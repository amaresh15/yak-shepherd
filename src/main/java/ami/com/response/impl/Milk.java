package ami.com.response.impl;

import org.springframework.beans.factory.annotation.Value;

import ami.com.been.Herd;
import ami.com.been.Labyak;
import ami.com.response.Product;
import ami.com.response.ProductType;

public class Milk implements Product {

	private ProductType name = ProductType.MILK;
	
	private float value = 0;
	
	@Value("wool.message")
	private String message = "liters of milk";
	
	@Override
	public void totalProduction(Herd herd, int days) {
		
		for (Labyak labYak : herd.getLabyak()) {
			if("f".equals(labYak.getSex())) {
				int ageAtStartup = (int)(labYak.getAge() * 100);
				int productiveDays = 1000 >= ageAtStartup + days ? days : 1000 - ageAtStartup;
				value += (50 * productiveDays) - ((2 * ageAtStartup + productiveDays - 1) * productiveDays * .03)/2;
			}
			
		}
		
	}

	@Override
	public boolean processOrder(String order) {
		return false;
	}

	@Override
	public String availableStock() {
		return null;
	}
	
	@Override
	public ProductType getName() {
		return this.name;
	}
	
	@Override
	public String getValue() {
		return Float.toString(value);
	}
	
	@Override
	public String toString() {
		StringBuilder report = new StringBuilder();
		report.append(value);
		report.append(" ");
		report.append(message);
		
		return report.toString();
	}

}

package ami.com.response;

import ami.com.response.impl.Milk;
import ami.com.response.impl.Wool;

public class ProductFactory {

	public static Product getProduct(ProductType product) {
		switch (product) {
		case MILK:
			return new Milk();
		case WOOL:
			return new Wool();
		default:
			return null;
		}
	}
}

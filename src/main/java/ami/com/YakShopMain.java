package ami.com;

import ami.com.been.YakReport;
import ami.com.service.ReportService;

public class YakShopMain {
	  
    public static void main(String[] args) {
		ReportService service = new ReportService();
		YakReport report = service.createReport("herd.xml", 14);
		System.out.println(report);
	}
}

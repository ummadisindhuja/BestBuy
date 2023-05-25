package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.BestBuyUtils;

public class BaseBestBuy extends BestBuyUtils {
	public String excelfile;
	@BeforeMethod
	public void start() throws Exception {
		browserLaunch(getpropvalue("browser"));
		launchUrl(getpropvalue("url"));
		BestBuyUtils obj = new BestBuyUtils();
		obj.stateSelect();
		

	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}

package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseBestBuy;
import page.CheckOutPaymentPage;

public class CheckOutPaymentTc extends BaseBestBuy {
	@Test
	public void checkOut(){
		CheckOutPaymentPage checkOut= new CheckOutPaymentPage();
		checkOut.checkOutPaymentPage("ummadimails.ummadisindhuja@gmail.com", "parukumar@143");
		checkOut.checkOutPaymentPage1("1234 5678 9023 3445","ummadi", "sindhuja", "HIG 64,SingporeTownShip,kadapa","Kadapa", "516002");
		WebElement text=driver.findElement(By.xpath("//p[contains(text(),'Please enter a valid card number.')]"));
		String actual = checkOut.getText(text);
		String expected = "https://developer.bestbuy.com/";
		System.out.println("Actual is : " + actual + " ---AND--- " + "  Expected is  : " + expected);
		Assert.assertEquals(actual, expected);
	}

}

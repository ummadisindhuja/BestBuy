package testCase;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseBestBuy;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.UrlBrokenPage;

public class UrlBrokenTc extends BaseBestBuy {
	@Test
	public void tc_001() {
		UrlBrokenPage urlbroke = new UrlBrokenPage();
		urlbroke.brokenLink();
		String actual = driver.getCurrentUrl();
		String expected = "https://developer.bestbuy.com/";
		System.out.println("Actual is : " + actual + " ---AND--- " + "  Expected is  : " + expected);
		Assert.assertEquals(actual, expected);
		if (actual.equals(expected)) {
			System.out.println("url not broken");
		} else {
			System.out.println("url broken");
		}
	}

}

package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserClosingBrowser {
	@Test
	public void unitedStates() {
		WebDriverManager.chromedriver().setup();// launch chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.findElement(By.xpath("(//img[@alt='United States'])[1]")).click();
		driver.close();
	}
	@Test
	public void canada() {
		WebDriverManager.chromedriver().setup();// launch chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.findElement(By.xpath("(//img[@alt='Canada'])[1]")).click();
		driver.close();
	}

}

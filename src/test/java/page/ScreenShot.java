package page;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BaseBestBuy;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot extends BaseBestBuy{
	private static ExtentReports extent;
	public static WebDriver driver;
	public static ExtentTest test ;
	@BeforeMethod
	public void start() {
		extent = new ExtentReports("Report1.html", false);
		// creates a toggle for the given test, adds all log events under it
		//test= extent.startTest("google", "search Java ");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("G:\\soft ware\\BestBuy\\src\\test\\java\\testCase\\AllMenuTc.java");
		
	}
	@Test
	public void test1() throws Exception {
		test= extent.startTest("google", "search Java ");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
		// log(LogStatus, details)
		test.log(LogStatus.INFO, "This step shows usage of log(logStatus, details)");
		// report with snapshot
		String img = test.addScreenCapture("./Screenshots/Screen.png");
		test.log(LogStatus.INFO, "Image", "Image example: " + img);
		// end test
	    //extent.endTest(test);
		// Assert.assertFalse(isAlertPresent(driver));
		//System.out.println(driver.switchTo().alert().getText());
		// calling flush writes everything to the log file
		//extent.flush();
	}
	@Test
public void test2() throws Exception {
		test= extent.startTest("google1", "search ja ");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
		// log(LogStatus, details)
		test.log(LogStatus.INFO, "This step shows usage of log(logStatus, details)");
		// report with snapshot
		String img = test.addScreenCapture("./Screenshots/Screen.png");
		test.log(LogStatus.INFO, "Image", "Image example: " + img);
		// end test
		//extent.endTest(test);
		// Assert.assertFalse(isAlertPresent(driver));
		//System.out.println(driver.switchTo().alert().getText());
		// calling flush writes everything to the log file
		//extent.flush();
	}
	@AfterMethod
	public void methodClosure() {
		extent.endTest(test);
		driver.close();
		extent.flush();
	}
	@AfterSuite
	public void automationClosure() {
		extent.flush();
	}
	public static boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex) {
			return false;
		}
	}
}




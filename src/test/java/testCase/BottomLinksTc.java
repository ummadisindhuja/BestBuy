package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseBestBuy;
import page.AllMenuDealsPage;
import page.BottomLinksPage;

public class BottomLinksTc extends BaseBestBuy {
	@Test
	public void menu_001() {
		BottomLinksPage links=new BottomLinksPage();
		links.accesebility();
		String actual = driver.getTitle();
		String expected="Accessibility - Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void menu_003() {
		BottomLinksPage links=new BottomLinksPage();
		links.doNotShareInfo();
		String actual = driver.getTitle();
		String expected=" Start Request - Best Buy ";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_004() {
		BottomLinksPage links=new BottomLinksPage();
		links.intrestedAds();
		String actual = driver.getTitle();
		String expected="Interest-Based Ads - Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_005() {
		BottomLinksPage links=new BottomLinksPage();
		links.pesonalInfo();
		String actual = driver.getTitle();
		String expected="Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_006() {
		BottomLinksPage links=new BottomLinksPage();
		links.privacy();
		String actual = driver.getTitle();
		String expected="Privacy Policy Hub - Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_007() {
		BottomLinksPage links=new BottomLinksPage();
		links.termsAndConditions();
		String actual = driver.getTitle();
		String expected="BestBuy.com Terms and Conditions";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_008() {
		BottomLinksPage links=new BottomLinksPage();
		links.statePrivacyRights();
		String actual = driver.getTitle();
		String expected="State Privacy Rights - Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_009() {
		BottomLinksPage links=new BottomLinksPage();
		links.adsOpt();
		String actual = driver.getTitle();
		String expected="Start Request - Best Buy ";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}

}

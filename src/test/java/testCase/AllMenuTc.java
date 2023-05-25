package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseBestBuy;
import page.AllMenuDealsPage;

public class AllMenuTc extends BaseBestBuy{
	@Test
	public void menu_001() {
		AllMenuDealsPage deals=new AllMenuDealsPage();
		deals.topDeals();
		String actual = driver.getTitle();
		String expected="Top Deals and Featured Offers on Electronics - Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_002() {
		AllMenuDealsPage deals=new AllMenuDealsPage();
		deals.dealOfTheDay();
		String actual = driver.getTitle();
		String expected="Deal of the Day: Electronics Deals - Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_003() {
		AllMenuDealsPage deals=new AllMenuDealsPage();
		deals.totalTechMemberShip();
		String actual = driver.getTitle();
		String expected="Best Buy Totaltech™ – Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_004() {
		AllMenuDealsPage deals=new AllMenuDealsPage();
		deals.creditCards();
		String actual = driver.getTitle();
		String expected="Best Buy Credit Card: Rewards &amp; Financing";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_005() {
		AllMenuDealsPage deals=new AllMenuDealsPage();
		deals.giftIdeas();
		String actual = driver.getTitle();
		String expected="Gift Ideas 2023: Best Gifts to Give This Year - Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_006() {
		AllMenuDealsPage deals=new AllMenuDealsPage();
		deals.giftCards();
		String actual = driver.getTitle();
		String expected="Gifts Cards and E-Gift Cards - Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_007() {
		AllMenuDealsPage deals=new AllMenuDealsPage();
		deals.bestBuyBussiness();
		String actual = driver.getTitle();
		String expected="Best Buy for Business - Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_008() {
		AllMenuDealsPage deals=new AllMenuDealsPage();
		deals.bestBuyOutlet();
		String actual = driver.getTitle();
		String expected="Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void menu_009() {
		AllMenuDealsPage deals=new AllMenuDealsPage();
		deals.healthAndWellness();
		String actual = driver.getTitle();
		String expected="Health & Wellness Solutions & Technology - Best Buy";
		System.out.println("Actual is : "+actual+" ---AND--- "+"  Expected is  : "+expected);
		Assert.assertEquals(actual, expected);
	}
	
}

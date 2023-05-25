package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseBestBuy;

public class AllMenuDealsPage extends BaseBestBuy {

	@FindBy(xpath = "//a[@data-lid='hdr_td_topdeals']")
	WebElement topDeals;

	@FindBy(xpath = "//a[@data-lid='hdr_dotd']")
	WebElement dealOfTheDay;

	@FindBy(xpath = "//a[@data-lid='hdr_best_buy_totaltech']")
	WebElement totalTechMemberShip;

	@FindBy(xpath = "//a[@data-lid='hdr_crd']")
	WebElement creditCards;

	@FindBy(xpath = "//a[@data-lid='hdr_gift_cards']")
	WebElement giftCards;

	@FindBy(xpath = "//a[@data-lid='hdr_gift_ideas']")
	WebElement giftIdeas;

	@FindBy(xpath = "//span[contains(text(),'More')]")
	WebElement moreDDClick;

	@FindBy(xpath = "(//a[@data-lid='hdr_health'])[2]")
	WebElement healthAndWellness;

	@FindBy(xpath = "(//a[@data-lid='hdr_best_buy_outlet'])[2]")
	WebElement bestBuyOutlet;

	@FindBy(xpath = "(//a[@data-lid='hdr_best_buy_business'])[2]")
	WebElement bestBuyBussiness;

	public AllMenuDealsPage() {
		PageFactory.initElements(driver, this);
	}

	public void topDeals() {
		clickElement(topDeals);
	}

	public void dealOfTheDay() {
		clickElement(dealOfTheDay);
	}

	public void totalTechMemberShip() {
		clickElement(totalTechMemberShip);
	}

	public void creditCards() {
		clickElement(creditCards);
	}


	public void giftIdeas() {
		clickElement(giftIdeas);
	}

	public void healthAndWellness() {
		clickElement(moreDDClick);
	    clickElement(healthAndWellness);
	}

	public void bestBuyOutlet() {
		clickElement(moreDDClick);
		clickElement(bestBuyOutlet);
	}

	public void bestBuyBussiness() {
		clickElement(moreDDClick);
		clickElement(bestBuyBussiness);
	}
	public void giftCards() {
		clickElement(bestBuyBussiness);
	}

}

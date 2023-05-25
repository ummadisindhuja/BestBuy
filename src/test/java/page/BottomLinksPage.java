package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseBestBuy;

public class BottomLinksPage extends BaseBestBuy {
	@FindBy(xpath = "//a[@data-track='ft_legal']")
	WebElement accesebility;

	@FindBy(xpath = "//a[@data-track='ft_legal_terms_conditions']")
	WebElement termsAndConditions;

	@FindBy(xpath = "//a[@data-track='ft_legal_privacy']")
	WebElement privacy;

	@FindBy(xpath = "//a[@data-track='ft_legal_interest_based_ads']")
	WebElement intrestedAds;

	@FindBy(xpath = "//a[@data-track='ft_legal_state_privacy_rights']")
	WebElement statePrivacyRights;

	@FindBy(xpath = "//a[@data-track='ft_legal_do_not_sell_personal_info']")
	WebElement doNotShareInfo;

	@FindBy(xpath = "//a[@data-track='ft_legal_limit_use_sensitive_personal_info']")
	WebElement pesonalInfo;

	@FindBy(xpath = "//a[@data-track='ft_legal_targeted_advertising_opt_out']")
	WebElement adsOpt;

	

	public BottomLinksPage() {
		PageFactory.initElements(driver, this);
	}

	public void accesebility() {
		clickElement(accesebility);
	}

	public void termsAndConditions() {
		clickElement(termsAndConditions);
	}

	public void privacy() {
		clickElement(privacy);
	}

	public void intrestedAds() {
		clickElement(intrestedAds);
	}

	public void doNotShareInfo() {
		clickElement(doNotShareInfo);
	}

	public void pesonalInfo() {
		clickElement(pesonalInfo);

	}

	
	public void statePrivacyRights() {

		clickElement(statePrivacyRights);
	}
	public void adsOpt() {

		clickElement(adsOpt);
	}

}

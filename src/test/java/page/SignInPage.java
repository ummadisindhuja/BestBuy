package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseBestBuy;

public class SignInPage extends BaseBestBuy {
	@FindBy(xpath = "//span[contains(text(),'Account')]")
	WebElement accountDropDown;
	@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement SignInButton;
	@FindBy(xpath = "//input[@id='fld-e']")
	WebElement email;
	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement password;
	@FindBy(xpath = "//button[@data-track='Sign In']")
	WebElement signInClick;

	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	public void logIn(String email, String password) {
		clickElement(accountDropDown);
		clickElement(SignInButton);
		addText(this.email, email);
		addText(this.password, password);
		clickElement(signInClick);
	}
}

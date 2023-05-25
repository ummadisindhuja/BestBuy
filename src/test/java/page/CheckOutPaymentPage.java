package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseBestBuy;

public class CheckOutPaymentPage extends BaseBestBuy {
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
	@FindBy(xpath = "//span[@class='cart-label']")
	WebElement cartClick;
	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement checkOutClick;
	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement continueToPayButton;
	@FindBy(xpath = "//input[@id='number']")
	WebElement cardNumber;
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastName;
	@FindBy(xpath = "//input[@id='street']")
	WebElement address;
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	@FindBy(xpath = "//select[@class='tb-select']")
	WebElement selectDropDown;
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipcode;
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement placeOrderButton;
	public CheckOutPaymentPage() {
		PageFactory.initElements(driver, this);
	}

	public void checkOutPaymentPage(String email, String password) {
		clickElement(accountDropDown);
		clickElement(SignInButton);
		addText(this.email, email);
		addText(this.password, password);
		clickElement(accountDropDown);
		clickElement(signInClick);
	}

	public void checkOutPaymentPage1(String cardNumber, String firstName, String lastName, String address, String city,
			String zipCode) {
		
		clickElement(cartClick);
		clickElement(checkOutClick);
		clickElement(continueToPayButton);
		addText(this.cardNumber, cardNumber);
		addText(this.firstName, firstName);
		addText(this.lastName, lastName);
		addText(this.address, address);
		addText(this.city, city);
		dropDownSelectByValue(selectDropDown, "AK");
		addText(this.zipcode, zipCode);
		
	}

}

package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseBestBuy;

public class createAccountPage extends BaseBestBuy {
	@FindBy(xpath="//span[contains(text(),'Account')]")
	WebElement accountDropDown;
	@FindBy(xpath="(//a[contains(text(),'Create Account')])[1]")
	WebElement createbutton;
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;
	@FindBy(xpath="//input[@id='reenterPassword']")
	WebElement confirmPwd;
	@FindBy(xpath="//input[@id='phone']")
	WebElement mobileNumber;
	@FindBy(xpath="//input[@id='is-recovery-phone']")
	WebElement checkBox;
	@FindBy(xpath="//button[contains(text(),'Create an Account')]")
	WebElement submitButton;
	
	
	public createAccountPage() {
		PageFactory.initElements(driver, this);
	}
	public void createAccount(String firstName,String lastName,String email,String password,String confirmPwd,String mobileNumber) {
		clickElement(accountDropDown);
		clickElement(createbutton);
		addText(this.firstName,firstName);
		addText(this.lastName,lastName);
		addText(this.email,email);
		addText(this.password,password);
		addText(this.confirmPwd,confirmPwd);
		addText(this.confirmPwd,confirmPwd);
		addText(this.mobileNumber,mobileNumber);
		clickElement(checkBox);
		clickElement(submitButton);
	}
	

}

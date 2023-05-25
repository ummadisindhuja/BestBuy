package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseBestBuy;

public class AddItemBrandPage extends BaseBestBuy{
	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement menuclick;
	@FindBy(xpath="//button[@data-id='node-87']")
	
	WebElement brands;
	@FindBy(xpath="//a[@data-lid='ubr_shp_apl']")
	
	WebElement appleBrand;
	@FindBy(xpath="//a[@data-track='[context:widgetType=secondaryNavigation,"
			+ "linkContent=Mac,linkRegion=Apple Navigation,linkPlacement=c1w1i1]']")
	
	WebElement macDD ;
	
	@FindBy(xpath="//a[contains(text(),'iMac Pro')]")
	WebElement imacpro;
	@FindBy(xpath="//div[contains(text(),'24\" iMac® with Retina "
			+ "4.5K display - Apple M1 - 8GB Memory - 256GB SSD (Latest Model) - Silver')]")
	WebElement selectitem;
	@FindBy(xpath="//button[@data-sku-id='6450874']")
	WebElement addCart;
	
	public AddItemBrandPage() {
		PageFactory.initElements(driver, this);
	}
	public void addItemBrandPage() {
		clickElement(menuclick);
		clickElement(brands);
		clickElement(appleBrand);
		waitforme(macDD);
		clickElement(macDD);
		waitforme(imacpro);
		clickElement(imacpro);
		waitforme(selectitem);
		clickElement(selectitem);
		clickElement(addCart);

	}
}

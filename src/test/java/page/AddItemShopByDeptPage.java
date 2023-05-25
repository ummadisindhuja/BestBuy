package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseBestBuy;

public class AddItemShopByDeptPage extends BaseBestBuy {
	
	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement menuclick;
	@FindBy(xpath="//button[@data-id='node-285']")
	WebElement tvAndHomeTheater;
	@FindBy(xpath="//button[@data-id='node-236']")
	WebElement TvsByBrand;
	@FindBy(xpath="//a[@data-lid='ubr_tv_brand_sony_tvs']")
	WebElement sonyTv;
	@FindBy(xpath="//button[@data-sku-id='6505561']")//wait
	WebElement sony_32AddCart;
	
	public AddItemShopByDeptPage() {
		PageFactory.initElements(driver, this);
	}
	public void addItemShopByDept() {
		clickElement(menuclick);
		clickElement(tvAndHomeTheater);
		clickElement(TvsByBrand);
		waitforme(sonyTv);
		clickElement(sonyTv);
		waitforme(sony_32AddCart);
		clickElement(sony_32AddCart);
	}
	
}

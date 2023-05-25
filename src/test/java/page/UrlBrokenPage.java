package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseBestBuy;

public class UrlBrokenPage extends BaseBestBuy {
	@FindBy(xpath="//a[@data-lid='ft_partner_developers']")
	WebElement developers;
public UrlBrokenPage() {
	PageFactory.initElements(driver, this);
}

public void brokenLink() {
	
	clickElement(developers);
}

}

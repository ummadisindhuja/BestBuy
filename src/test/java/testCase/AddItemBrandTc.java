package testCase;

import org.testng.annotations.Test;

import base.BaseBestBuy;
import page.AddItemBrandPage;

public class AddItemBrandTc extends BaseBestBuy{
	@Test
	public void addFromBrand() {
		AddItemBrandPage add= new AddItemBrandPage();
		add.addItemBrandPage();
	}

}

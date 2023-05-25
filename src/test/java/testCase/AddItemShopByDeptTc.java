package testCase;

import org.testng.annotations.Test;

import base.BaseBestBuy;
import page.AddItemShopByDeptPage;

public class AddItemShopByDeptTc extends BaseBestBuy {
	@Test
	public void addItem() {
		AddItemShopByDeptPage add=new AddItemShopByDeptPage();
		add.addItemShopByDept();
	}

}

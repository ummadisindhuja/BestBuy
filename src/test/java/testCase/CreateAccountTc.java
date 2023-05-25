package testCase;

import org.testng.annotations.Test;

import base.BaseBestBuy;
import page.createAccountPage;


public class CreateAccountTc extends BaseBestBuy{
	@Test
	public void tc_001() {
		createAccountPage create=new createAccountPage();
		create.createAccount("sindhuja", "ummadi", "ummadimails.ummadisindhuja@gmail.com","password", "password", "123456789");
	}
	@Test
	public void tc_002() {
		createAccountPage create=new createAccountPage();
		create.createAccount("sindhuja", "ummadi", "ummadimails.ummadisindhuja@gmail.com","parukumar@143", "parukumar@143", "8522098804");
	}
	@Test
	public void tc_003() {//in valid 
		createAccountPage create=new createAccountPage();
		create.createAccount("sindhuja", "katam", "ummadimails.ummadisindhuja@gmail.com","parukumar@143", "parukumar@143", "8522098804");
	}
	@Test
	public void tc_004() {//in valid 
		createAccountPage create=new createAccountPage();
		create.createAccount(" ", "katam", "ummadimails.ummadisindhuja@gmail.com","parukumar@143", "parukumar@143", "8522098804");
	}
	@Test
	public void tc_005() {//in valid 
		createAccountPage create=new createAccountPage();
		create.createAccount("sindhuja", " ", "ummadimails.ummadisindhuja@gmail.com","parukumar@143", "parukumar@143", "8522098804");
	}
	@Test
	public void tc_006() {//in valid 
		createAccountPage create=new createAccountPage();
		create.createAccount("sindhuja", "ummadi", " ","parukumar@143", "parukumar@143", "8522098804");
	}
	@Test
	public void tc_007() {//in valid 
		createAccountPage create=new createAccountPage();
		create.createAccount("sindhuja", "katam", "ummadimails.ummadisindhuja@gmail.com"," ", "parukumar@143", "8522098804");
	}
	@Test
	public void tc_008() {//in valid 
		createAccountPage create=new createAccountPage();
		create.createAccount("sindhuja", "ummadi", "ummadimails.ummadisindhuja@gmail.com","parukumar@143", " ", "8522098804");
	}
	@Test
	public void tc_009() {//in valid 
		createAccountPage create=new createAccountPage();
		create.createAccount("sindhuja", "katam", "ummadimails.ummadisindhuja@gmail.com","parukumar@143", "parukumar", "8522098804");
	}
	@Test
	public void tc_0010() {//in valid 
		createAccountPage create=new createAccountPage();
		create.createAccount("sindhuja", "katam", "ummadimails.ummadisindhuja@gmail.com","parukumar@143", "parukumar@143", " ");
	}
	

}

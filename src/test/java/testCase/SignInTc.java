package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseBestBuy;
import page.SignInPage;

public class SignInTc extends BaseBestBuy {
	
	@Test 
	public void tcInvalidEmail_001() {
		SignInPage signin = new SignInPage();
		signin.logIn("ummadi@gmailcom", "password");
		
		
	}
	@Test
	public void tcValidEmail_002() {
		SignInPage signin = new SignInPage();
		signin.logIn("ummadimails.ummadisindhuja@gmail.com", "parukumar@143");
			
	}
	 @Test
	public void tcInValidEmail_003() {
		SignInPage signin = new SignInPage();
		signin.logIn("ummadimailsja@gmail.com", "parukumar@143");
				
	}
	 @Test
	public void tcInValidpass_003() {
		SignInPage signin = new SignInPage();
		signin.logIn("ummadimails.ummadisindhuja@gmail.com", "parar@143");
					
	}
	 @Test
	public void tcInValidgmail_004() {
		SignInPage signin = new SignInPage();
		signin.logIn("ummadimails.ummadisindhuja@hmail.com", "parar@143");
						
		}

}

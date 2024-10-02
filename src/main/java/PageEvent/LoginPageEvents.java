package PageEvent;

import org.testng.Assert;

import PageElement.LoginPageElements;
import Util.ElementFetch;

public class LoginPageEvents {
	
	ElementFetch elementFetch =new ElementFetch();;
	public void verifyLoginPageOpenOrNot() {
		
		System.out.println("signinPage clicked------");
	Boolean flag	=elementFetch.getWebElement("XPATH", LoginPageElements.LoginPageText).isDisplayed();
	Assert.assertTrue(flag, "This LoginPage");
	}
	
	public void enterEmailID() {
		System.out.println("Emailid selected------");
		elementFetch.getWebElement("ID", LoginPageElements.emailid).sendKeys("smitasucharitananda.gmail.com");
	}
}
	
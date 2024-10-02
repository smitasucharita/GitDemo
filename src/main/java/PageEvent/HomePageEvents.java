package PageEvent;


import org.testng.Assert;

import PageElement.HomePageElements;
import Util.ElementFetch;

public class HomePageEvents {
	ElementFetch elementFetch;
	public void clickOnSignInButton() {
		elementFetch=new ElementFetch();
		System.out.println("signinButton going for clicked------");
		elementFetch.getWebElement("XPATH", HomePageElements.SigninButton).click();
		System.out.println("signinButton clicked------");
		
	}

}


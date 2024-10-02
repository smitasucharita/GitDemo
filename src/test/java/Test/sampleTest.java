package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseTTest;
import PageEvent.HomePageEvents;
import PageEvent.LoginPageEvents;
import Util.SuiteListener;

@Listeners(SuiteListener.class)
public class sampleTest extends BaseTTest {
	
	
	
	HomePageEvents homePageEvents =new HomePageEvents();
	LoginPageEvents loginPageEvents =new LoginPageEvents() ;

	@BeforeMethod
	public void setup() {
		LunchApplication();
	}
	@Test
	public void samleMethodForEmailIdEntering() {
		 homePageEvents =new HomePageEvents();
		 loginPageEvents =new LoginPageEvents() ;
		homePageEvents.clickOnSignInButton();
		loginPageEvents.verifyLoginPageOpenOrNot();
		loginPageEvents.enterEmailID();
		
	}
	@Test
	public void login() {
		
		 loginPageEvents =new LoginPageEvents() ;
		loginPageEvents.verifyLoginPageOpenOrNot();
		loginPageEvents.enterEmailID();
		
	}

	@Test(enabled=true)
	public void Skiptest() {
		 System.out.println("Using this test for skip");
		
	}

@AfterMethod
public void tearDown() {
	
	afterMethod();
}
}



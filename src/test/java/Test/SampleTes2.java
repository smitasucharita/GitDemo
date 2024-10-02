package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTTest;
import PageEvent.HomePageEvents;
import PageEvent.LoginPageEvents;

public class SampleTes2 extends BaseTTest {
		
		
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
		

		@Test(enabled=true)
		public void Skiptest() {
			 System.out.println("Sample 2 executed");
			
		}

	@AfterMethod
	public void tearDown() {
		
		afterMethod();
	}
	}




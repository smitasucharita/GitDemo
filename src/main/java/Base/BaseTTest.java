package Base;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Util.Constant;

public class BaseTTest {
	public static WebDriver driver;
	public static ExtentReports extens;
	public static ExtentSparkReporter sparkReporter;
	public static ExtentTest logger;
	@BeforeTest
	public void beforeTestMethod() {
		sparkReporter =new ExtentSparkReporter(System.getProperty("user.dir")+ File.separator +"Reports"+ File.separator+"AutomatioReport.html");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("Automation Results");
		sparkReporter.config().setDocumentTitle("Automation Test Results");

		extens = new ExtentReports();
		extens.attachReporter(sparkReporter);

		extens.setSystemInfo("Tester is: ","Japneet Sachdeva");
	}

public void LunchApplication() {
	   
		setUpDriver(Constant.browserName);
		driver.manage().window().maximize();
		driver.get(Constant.url);
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		
		
	}

public void afterMethod() {
//	ITestResult result;
//		if(result.getStatus()==ITestResult.SUCCESS)
//		{
//			String methodName=result.getMethod().getMethodName();
//			String logText="Test Case" + methodName + "Pass";
//			Markup m=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
//			logger.log(Status.PASS, m);
//		}
//		else if(result.getStatus()==ITestResult.FAILURE) {
//			
//				String methodName=result.getMethod().getMethodName();
//				String logText="Test Case" + methodName + "Fail";
//				Markup m=MarkupHelper.createLabel(logText, ExtentColor.RED);
//				logger.log(Status.FAIL, m);
//			}
//		
		driver.close();;
		
	}
	@AfterTest
public void afterTest() {
		
		extens.flush();
		
	}
	
	public void setUpDriver(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.cheome.driver", System.getProperty("user.dir")+ File.separator +"drivers"+ File.separator+"chromedriver");
			driver=new ChromeDriver();
			
			
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ File.separator +"drivers"+ File.separator+"geckodriver");
		    driver=new FirefoxDriver();
		}
		
		else
		{
			System.setProperty("webdriver.cheome.driver", System.getProperty("user.dir")+ File.separator +"drivers"+ File.separator+"chromedriver");
			driver=new ChromeDriver();
		}
	}
	

}






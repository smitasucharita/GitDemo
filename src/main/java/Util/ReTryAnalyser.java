package Util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryAnalyser implements IRetryAnalyzer {
   int count=0;
   int retrycount=1;
	@Override
	public boolean retry(ITestResult iTestResult) {
		// TODO Auto-generated method stub
		while(count<retrycount) {
			count++;
		
		}
		return true;
	}
	
	

}


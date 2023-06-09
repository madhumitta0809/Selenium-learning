package retryfailedTestcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
int failedCount=0;
int limit=5;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(failedCount<limit)
		{
			failedCount++;
			return true;
		}
		return false;
	}
	 

}

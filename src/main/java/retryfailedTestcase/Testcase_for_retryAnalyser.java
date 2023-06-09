package retryfailedTestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase_for_retryAnalyser {

	 @Test(retryAnalyzer = RetryAnalyzer.class)
		public void test1()
		{
			Assert.assertEquals(false, true);
		}
	    @Test(retryAnalyzer = RetryAnalyzer.class)
		public void test2()
		{
			Assert.assertEquals(false, true);
		}
}

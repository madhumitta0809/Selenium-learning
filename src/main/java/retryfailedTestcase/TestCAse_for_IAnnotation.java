package retryfailedTestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCAse_for_IAnnotation {
    @Test()
	public void test1()
	{
		Assert.assertEquals(false, true);
	}
    @Test
	public void test2()
	{
		Assert.assertEquals(false, true);
	}
}


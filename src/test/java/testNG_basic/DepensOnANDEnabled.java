package testNG_basic;

import org.testng.annotations.Test;

public class DepensOnANDEnabled {
	@Test(timeOut = 1000)
	public void Permission() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("permission granted");
	}
	@Test(dependsOnMethods = "Permission",alwaysRun = true)
	public void marriage()
	{
		System.out.println("Marriage hanppened");
	}
	@Test(alwaysRun = true,enabled = true)
	public void priority_alwaysrun_or_enabled()
	{
		System.out.println("heyyy");
	}


}

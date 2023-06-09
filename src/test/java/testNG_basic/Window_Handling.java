package testNG_basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author mypc
 *
 */
public class Window_Handling {
    @Test
	public void window() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		driver.get("https://letcode.in/windows");
//		String wh=driver.getWindowHandle();
//		System.out.println(wh);
//		driver.findElementById("home").click();
//		Set<String> whs=driver.getWindowHandles();
//		System.out.println(whs);
//		
//		for (String wh1 : whs) {
//			if(!wh1.equals(wh))
//					{
//				driver.switchTo().window(wh1);
//					}
//		}
//		
//		driver.findElementByClassName("card-footer-item").click();
//		
		
		driver.get("https://letcode.in/windows");
		driver.findElementById("multi").click();
		Set<String> wh3=driver.getWindowHandles();
		System.out.println(wh3);
		List<String> l=new ArrayList<String>(wh3);
		driver.switchTo().window(l.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		Set<String> ne=driver.getWindowHandles();
		List<String> lis=new ArrayList<String>(ne);
		driver.switchTo().window(lis.get(0));
		System.out.println(driver.getCurrentUrl());
		
		
		
		
	
		

	}

}

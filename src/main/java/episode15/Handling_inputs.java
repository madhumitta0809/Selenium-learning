package episode15;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_inputs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://letcode.in/edit");
		
		//driver.findElementByXPath("//input[@iplaceholder='Enter first & last name']").sendKeys("madhu");
		//click();
		driver.findElementById("join").sendKeys("hi",Keys.TAB);
		
		driver.findElementById("fullName").sendKeys("jh");
		String s=driver.findElementById("getMe").getAttribute("value");
		System.out.println(s);
		driver.findElementById("clearMe").clear();
		Boolean en=driver.findElementById("noEdit").isEnabled();
		System.out.println(en);
	String k=driver.findElementById("dontwrite").getAttribute("readonly");
	//System.out.println(k);
	if(k.equals("true"))
	{
		System.out.println("readonly");
	}
		
		
		

	}

}

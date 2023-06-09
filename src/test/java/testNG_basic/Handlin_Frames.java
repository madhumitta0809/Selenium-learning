package testNG_basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlin_Frames {
	@Test
	public void frame()  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		driver.findElementByName("fname").sendKeys("Mdhu");
		
		WebElement ele=driver.findElementByXPath("//iframe[@src='innerFrame']");
		driver.switchTo().frame(ele);
		driver.findElementByName("email").sendKeys("hello");
		
		driver.switchTo().parentFrame();
		driver.findElementByName("lname").sendKeys("mitta");
		
		driver.switchTo().frame(ele);
		driver.findElementByName("email").clear();
		driver.findElementByName("email").sendKeys("madhumitta0@gmail.com");
				
		driver.switchTo().defaultContent();
		driver.findElementByClassName("card-footer-item").click();
		//driver.navigate().back();
		//driver.switchTo().frame("fname");
		//driver.switchTo().frame(ele);
		//driver.findElementByName("email").clear();
		
		//driver.findElementByName("email").sendKeys("mmmadhumitta0@gmail.com");
		//driver.switchTo().defaultContent();
		//driver.findElementByClassName("card-footer-item").click();
		
		//driver.switchTo().frame(0).switchTo().frame(0);
		
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[.='Try it']").click();
		
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("madh");
		alt.accept();
		
		String s=driver.findElementByXPath("//p[contains(text(),'How')]").getText();
		System.out.println(s);
		
		

}
}
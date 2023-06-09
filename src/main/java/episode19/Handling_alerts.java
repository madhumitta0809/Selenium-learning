package episode19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://letcode.in/alert");
		driver.findElementByXPath("//button[.='Simple Alert']").click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		System.out.println("acceptrd");
		
		WebElement ele = driver.findElementByXPath("//button[.='Confirm Alert']");	
		Thread.sleep(1000);
		ele.click();
		//Thread.sleep(1000);
		alert.dismiss();

		Thread.sleep(1000);
		String s=ele.getText();
		System.out.println(s);
		
		
		driver.findElementById("prompt").click();
		
		alert.sendKeys("Madhumitta");
		
		String k=alert.getText();
		
		
		alert.accept();
		System.out.println(k);
		
		String f=driver.findElementById("myName").getText();
		System.out.println(f);;
		

	}

}

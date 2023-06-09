package Episode12;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://letcode.in/");
		driver.findElementByLinkText("Log in").click();
		driver.findElementByName("email").sendKeys("madhumitta0@gmail.com");
		Thread.sleep(1000);
		driver.findElementByXPath("//html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//html/body/app-root/app-signin/div/div/div/div/div[1]/button").click();
		}
		

	}



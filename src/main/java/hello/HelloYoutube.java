package hello;





import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class HelloYoutube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		//driver.findElementByXPath("//input[@iplaceholder='Enter first & last name']").sendKeys("madhu");
		
		driver.findElementByName("email").sendKeys("chellztheaviator@gmail.com");
		driver.findElementByXPath("//button[@role='button']").click();
		//Thread.sleep(1000);
		//driver.findElementByName("password").click();
		//driver.findElementByXPath("//label[@for='id_password']").click();
		//driver.findElementByXPath("/html/body/div[1]/div/div[3]/div/div/div[1]/form/div[2]/div[1]/div/label/input").sendKeys("chellZZ0405%");
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		 
		WebElement pwd=wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				return t.findElement(By.name("password"));
			}
			
		});
		pwd.sendKeys("chellZZ0405%");
		//driver.findElementByName("password").sendKeys("chellZZ0405%");
		driver.findElementByXPath("//button[.='Sign In']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[.='Pappa']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//a[@aria-label='Alexa & Katie']").click();
		
	}

}

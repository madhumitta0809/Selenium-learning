package testNG_basic;





import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;


public class HelloYoutube {
	
	@DataProvider(name="login", indices= {0},parallel=true)
	public String[][] getData()
	{
		String[][] data=new String[2][2];
		
		data[0][0]="chellztheaviator@gmail.com";
		data[0][1]="chellZZ0405%";
		
		data[1][0]="chellztheaviator@gmail.com";
		data[1][1]="chellZZ0405%";
		return data;
	}
	@Test(dataProvider = "login")
	public void netflixlogin(String a,String b) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.findElementByXPath("//input[@iplaceholder='Enter first & last name']").sendKeys("madhu");
		
		driver.findElementByName("email").sendKeys(a);
		driver.findElementByXPath("//button[@role='button']").click();
		Thread.sleep(1000);
		//driver.findElementByName("password").click(); 
		//driver.findElementByXPath("//label[@for='id_password']").click();
		//driver.findElementByXPath("/html/body/div[1]/div/div[3]/div/div/div[1]/form/div[2]/div[1]/div/label/input").sendKeys("chellZZ0405%");
		driver.findElementByName("password").sendKeys(b);
		driver.findElementByXPath("//button[.='Sign In']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//span[.='Pappa']").click();
		//Thread.sleep(1000);
		//driver.findElementByXPath("//a[@aria-label='Alexa & Katie']").click();
		driver.quit();
	}
	
	

}

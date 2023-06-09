package diff_ways_to_maximize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maximize {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--start-maximized");
		ChromeDriver driver =new ChromeDriver(co);
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		
		//Dimension d=new Dimension(1500,900);
		//driver.manage().window().setSize(d);
		
		
		
}
}

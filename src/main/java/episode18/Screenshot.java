package episode18;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://letcode.in/buttons");
		TakesScreenshot ts=((TakesScreenshot)driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./snaps/img.png");
		//FileHandler f=new FileHandler();
		FileUtils.copyFile(src,des);
		
		
		
	
		
		
		WebElement e=driver.findElementByCssSelector("#home");
		TakesScreenshot ts1=((TakesScreenshot)e);
		File s1=ts1.getScreenshotAs(OutputType.FILE);
		File d1=new File("./snaps/img2.png");
		FileUtils.copyFile(s1,d1);
		
		driver.navigate().to("https://letcode.in/");
		WebElement e1=driver.findElementByClassName("subtitle");
		TakesScreenshot ts2=((TakesScreenshot)e1);
		File s2=ts2.getScreenshotAs(OutputType.FILE);
		File d2=new File("./snaps/img1.png");
		FileUtils.copyFile(s2, d2);
		


	}

}

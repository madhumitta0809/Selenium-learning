package Episode23;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement s=driver.findElementById("draggable");
		WebElement d=driver.findElementById("droppable");
		Actions builder =new Actions(driver);
		builder.dragAndDrop(s, d).perform();
		
		int x=s.getLocation().getX();
		int y=s.getLocation().getY();
		builder.dragAndDropBy(s, x+40, y+40).perform();
		
		driver.quit();


	}

}

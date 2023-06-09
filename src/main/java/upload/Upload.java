package upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	driver.get("https://the-internet.herokuapp.com/upload");
driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\mypc\\Downloads\\sampleFile.jpeg");
driver.findElement(By.id("file-submit")).click();
/*
 * //e.click(); driver.findElement(By.id("uploadfile")).click();
 * Thread.sleep(3000); String
 * file="C:\\Users\\mypc\\Downloads\\sampleFile.jpeg"; StringSelection
 * select=new StringSelection(file);
 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
 * Robot r=new Robot(); r.keyPress(KeyEvent.VK_CONTROL);
 * r.keyPress(KeyEvent.VK_V); r.keyRelease(KeyEvent.VK_CONTROL);
 * r.keyRelease(KeyEvent.VK_V); Thread.sleep(3000);
 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
 */
	
	
	
	}
}

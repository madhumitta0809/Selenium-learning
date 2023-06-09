package interview_questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingLinks {
public static void main(String[] args) throws InterruptedException
{WebDriver driver=new ChromeDriver();

	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("cricket \n");
	Thread.sleep(2000);
	List<WebElement> s=driver.findElements(By.xpath("//a"));
	for (WebElement webElement : s) {
		System.out.println(webElement.getAttribute("href"));
	}
	driver.quit();
}

}

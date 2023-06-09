package hyperlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		WebElement e=driver.findElement(By.linkText("Go to Dashboard"));
		e.click();
		driver.navigate().back();
	WebElement findDestination=	driver.findElement(By.partialLinkText("Find the URL "));
	String destination=findDestination.getAttribute("href");
	System.out.println(destination);
	
	WebElement broken=driver.findElement(By.linkText("Broken?"));
	broken.click();
	String title=driver.getTitle();
	if(title.contains("404"))
	{
		System.out.println("The link is broken");
	}
	driver.navigate().back();
	WebElement e1=driver.findElement(By.linkText("Go to Dashboard"));
	e1.click();
	driver.navigate().back();
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int n=links.size();
	for (WebElement webElement : links) {
		String s=webElement.getAttribute("href");
		System.out.println(s);
		
	}
	System.out.println(n);
	
	
		
	}

}

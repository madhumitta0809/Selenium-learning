package selectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		List<WebElement> ws= driver.findElements(By.xpath("//select[@id='cars']/option"));
		int k=ws.size();
		System.out.println(k);
	Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(ws.get(0)).click(ws.get(2)).build().perform();
		
	}

}

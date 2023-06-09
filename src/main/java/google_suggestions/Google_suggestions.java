package google_suggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_suggestions {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("game of");
		Thread.sleep(1000);
		int i=0;
		List<WebElement> s=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for (WebElement webElement : s) {
			System.out.println(webElement.getText());
			String text=webElement.getText();
			if(text.contains("ott"))//click the suggestion which the contains given text
			{
				webElement.click();
				break;
			}
			//click 3rd suggestion
//			i++;
//			if(i==5)
//			{
//				webElement.click();
//				break;
//			}
			
		}
		
	}
}

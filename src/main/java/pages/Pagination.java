package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {
	
	public static void main(String[]args) throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
		String nextbuttonClassValue;
		List<String> names=new ArrayList<String>();
		List<WebElement> namesList;
		int sizeofpagenation =driver.findElements(By.xpath("//a[@class='page-link']")).size();
		System.out.println(sizeofpagenation);
		if(sizeofpagenation>0)
		{
			do
			{
			 namesList= driver.findElements(By.xpath("//td[@class='sorting_1']"));
			for (WebElement name : namesList) {
				names.add(name.getText());
			}
			
			WebElement nextbutton=driver.findElement(By.id("dtBasicExample_next"));
			nextbuttonClassValue=nextbutton.getAttribute("class");
			
			if(!nextbuttonClassValue.contains("disabled"))
			{
				nextbutton.click();
			}
			else
			{
				break;
			}
			}while(true);
		}
		else
		{
			System.out.println("no pagination");
		}
		System.out.println(names);
		
		for (String s : names) {
			
			System.out.println(s);
		}

	}
}

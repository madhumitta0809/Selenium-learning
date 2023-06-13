package episode40;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
	
		
		WebElement table=driver.findElementById("simpletable");
		
		List<WebElement> colcnt=  table.findElements(By.tagName("th"));
		System.out.println(colcnt.size());
		
		
		List<WebElement> rowcnt=  table.findElements(By.cssSelector("tbody tr"));
				System.out.println(rowcnt.size());
		
		for (WebElement col : colcnt) {
			System.out.println(col.getText());     //to get all headers
		}
		
		
		for (WebElement row : rowcnt) {
			List<WebElement> particular_rows_3_col =row.findElements(By.tagName("td"));
			WebElement name=particular_rows_3_col.get(0);
			System.out.println(name.getText());
		}
		

		for (WebElement row : rowcnt) {
			List<WebElement> particular_rows_3_col =row.findElements(By.tagName("td"));
			  for (WebElement singleelement : particular_rows_3_col) {
				  String single=singleelement.getText();
				  System.out.println(single);
			      if(single.equals("Man"))
			      {
			    	  System.out.println("Yes");
			    	 WebElement e= row.findElement(By.tagName("input"));
			    	 e.click();
			    	 break;
			      }
			  }
				
			}
			
		
		WebElement table1=driver.findElementById("shopping");
				
		List<WebElement> totalcol=table1.findElements(By.tagName("th"));
		List<WebElement> totalrow=table1.findElements(By.cssSelector("tbody tr"));
		System.out.println(totalrow.size());
		
		int k=0;
		for (WebElement arow : totalrow) {
			List<WebElement> acol=arow.findElements(By.tagName("td"));
			WebElement w =acol.get(1);
			String s= w.getText();
					int n=Integer.parseInt(s);
					k=k+n;
			
		}
		
		System.out.println(k);
		
		WebElement total= table1.findElement(By.cssSelector("tfoot b "));
		String p=total.getText();
		int b=Integer.parseInt(p);
		if(b==k)
		{
			System.out.println("Equal");
		}
		
		
			
		//driver.quit();  

	}

}

package episode27;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://letcode.in/dropdowns");
		WebElement e=driver.findElementById("fruits");
		Select s=new Select(e);
		s.selectByIndex(5);
		WebElement g=s.getFirstSelectedOption();
		System.out.println(g.getText());
		
		WebElement sh=driver.findElementById("superheros");
		
		Select ss=new Select(sh);
		System.out.println(ss.isMultiple());
		ss.selectByVisibleText("Aquaman");
		ss.selectByValue("bp");
		ss.selectByIndex(2);
		List <WebElement> g2=ss.getAllSelectedOptions();
		for(WebElement w : g2)
		{
		System.out.println(w.getText());
		}
		
		ss.deselectByIndex(2);
		

	}

}

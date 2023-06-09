package episode17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://letcode.in/buttons");
		Point p=driver.findElementById("position").getLocation();
		System.out.println(p);
		int x=p.getX();
		int y=p.getY();
		System.out.println(x+" y is "+y);
		
		String s=driver.findElementById("color").getCssValue("background-color");
		System.out.println(s);
		
		Rectangle r=driver.findElementById("property").getRect();
		Dimension d=r.getDimension();
		System.out.println(d);
		
		
	}

}

package screenshot.robotclass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SS {

	public static void main(String[] args) throws IOException, AWTException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://letcode.in/buttons");
	
	Robot r=new Robot();
	
	Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rec=new Rectangle(screensize);
	BufferedImage src=r.createScreenCapture(rec);
	File des=new File("./snaps/img2.png");
	ImageIO.write(src, "png", des);
	
	
	}
	
}

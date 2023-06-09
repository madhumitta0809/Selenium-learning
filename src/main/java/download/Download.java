package download;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(5000);
		File f=new File("C:\\Users\\mypc\\Downloads");
		File[] totalfiles=f.listFiles();
		
		for (File file : totalfiles) {
			//System.out.println(file.getName());
			if(file.getName().equals("sampleFile.jpeg"))
			{
				System.out.println(file.getName());
				System.out.println("file downloaded");
				break;
				
			}
				
		}
		
	}

}

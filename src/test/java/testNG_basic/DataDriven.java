package testNG_basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {
	
	String[][] data=null;
	
	
	@DataProvider(name="logi")
	public String[][] getLoginData() throws IOException
	{
		data=getExcel();
		return data;
	}
	
	public String[][] getExcel() throws IOException
	{
		File f=new File("./excel data/Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		//String file="./excel data/Book1.xlsx";
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheetAt(0);
		
		int rc=sh.getPhysicalNumberOfRows();
		//Row row=sh.getRow(0);
		int cc=sh.getRow(0).getLastCellNum();
		
		String[][] testdata=new String[rc-1][cc];		
		
		for(int i=1;i<rc;i++)
		{
			XSSFRow r=sh.getRow(i);
			for(int j=0;j<cc;j++)
			{
				XSSFCell cell=r.getCell(j);
				DataFormatter df=new DataFormatter();
				String value=df.formatCellValue(cell);
				testdata[i-1][j]=value;
			}
		}
			
		
		wb.close();
		return testdata;
	}
		
		@Test(dataProvider="logi")
		public void login(String data[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.netflix.com/in/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.findElementByName("email").sendKeys(data[0]);
			driver.findElementByXPath("//button[@role='button']").click();
			Thread.sleep(1000);
			
			driver.findElementByName("password").sendKeys(data[1]);
			driver.findElementByXPath("//button[.='Sign In']").click();
			Thread.sleep(1000);
			driver.findElementByXPath("//span[.='Pappa']").click();
			
			driver.close();
		}
		
		
		
	}
	
	
	
    


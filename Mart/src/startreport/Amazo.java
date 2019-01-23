package startreport;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import startreport.*;
public class Amazo extends Reportexe {
	String filePath="./test data/data.properties";
	Properties ps=new Properties();
public String getPropertyFileObj(String name) throws IOException {
		
		FileInputStream fs=new FileInputStream(filePath);
		ps.load(fs);
		String str=ps.getProperty(name);
		return str ;
		
	}
		
	@BeforeTest
	public void testfirst() throws InterruptedException, IOException
		{
			// TODO Auto-generated method stub
			Thread.sleep(5000);
			System.out.println("helo");			
			driver.navigate().to(getPropertyFileObj("url"));
			driver.manage().window().maximize();
			Thread.sleep(2000);
	}
		
	@Test
	public void testsecond() throws Throwable
	{
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys(getPropertyFileObj("username"));
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys(getPropertyFileObj("password"));
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		WebElement td=driver.findElement(By.cssSelector("#container > div > header > div._1tz-RS > div > div._1Wr4v5 > div:nth-child(1) > div > div > svg>path[class='_2GxHSA']"));
		
		ac.moveToElement(td).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul._3Ji-EC li._2sYLhZ:nth-child(9)")).click();
		
		
		Thread.sleep(2000);
		driver.close();		
	
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "testing");
	}

}

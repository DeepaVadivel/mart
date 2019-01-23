package startreport;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiplescreenshot {
@Test
public void testing1() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:/Users/deepa.vadivel/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
	
	driver.navigate().to("http://www.seleniumeasy.com/test/input-form-demo.html");
	
	driver.manage().window().maximize();
	takeScreenshot(driver, "screenshot1");
	WebElement tg=driver.findElement(By.name("first_name"));
	
	tg.sendKeys("deepa");
	Thread.sleep(3000);
	takeScreenshot(driver, "screenshot2");
	driver.close();
}
	public static void takeScreenshot(WebDriver driver, String name)
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:/Users/deepa.vadivel/pictures/screnshot/"+name+".png");
		try
		{
		FileUtils.copyFile(src, destFile);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
		
		
	

}


package startreport;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Thirdparty {
@Test
	public void testing() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://compressimage.toolur.com/");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.id("browse"));
		s.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\deepa.vadivel\\Documents\\file1.exe");
		Thread.sleep(10000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(10000);
		driver.close();
	}

}

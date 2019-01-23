package startreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadrive {

	@Test(dataProvider="Logincrede")
	public void dataDrive(String username, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='nav-line-2'][text()='Your Orders']")).click();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.name("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#ap_password")).sendKeys(password);
		driver.findElement(By.cssSelector("input#signInSubmit")).click();
		Thread.sleep(2000);
		driver.close();
	}
	@DataProvider
	public Object[][] Logincrede()
	{
		Object[][] so=new Object[2][2];
		so[0][0]="8296708517";
		so[0][1]="mayilsamy";
		so[1][0]="deepmanju1996@gmail.com";
		so[1][1]="Mayilsamy@1";
		return so;
		
	}
}

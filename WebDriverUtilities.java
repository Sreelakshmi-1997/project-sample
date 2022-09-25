package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtilities {
public static WebDriver driver;
	
	public static void launchBrowser(String driverpath,String url) {
		
		
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	public void click(By value)
	{
		driver.findElement(value).click();
	}
	public void sendkeys(By value,String value1)
	{
		driver.findElement(value).sendKeys(value1);;
	}
	
}



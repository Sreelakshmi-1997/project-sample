package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class utl extends WebDriverUtilities{
	public static WebDriver driver;
	
	  @Test(enabled= true,priority=2)
	  public void test1() throws InterruptedException {
		  
	      sendkeys(By.id("user-name"),"standard_user");
	      sendkeys(By.id("password"),"secret_sauce");
	      click(By.id("login-button"));
	     //select1
		  click(By.xpath("//*[@id=\"item_4_img_link\"]/img"));
		  
		  //addtocart1
		  click(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		  
		  //back1 
		  click(By.id("back-to-products"));
		 
		  //select2
		  click(By.xpath("//*[@id=\"item_1_img_link\"]/img"));
		  
		  //addtocart2
		  click(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
		
		  //back2
		  click(By.xpath("//*[@id=\"back-to-products\"]"));
		  
		  //cart
		  click(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		  
		  //checkout
		  click(By.xpath("//*[@id=\"checkout\"]"));
		  
		  //firstname
		  sendkeys(By.id("first-name"),"Sreelakshmi");
		  
		  //lastname
		  sendkeys(By.id("last-name")," N");
		  
		  //postcode
		  sendkeys(By.id("postal-code"),"680741");
		  
		  //conform
		  click(By.xpath("//*[@id=\"continue\"]"));
		  
		  //finish
		  click(By.xpath("//*[@id=\"finish\"]"));
		  Thread.sleep(4000);
		  
	  }
	    @Test(enabled= true,priority=1)
		public void UrlCheck() {
		    String myurl="https://www.saucedemo.com/";
	    	String applicationurl =driver.getCurrentUrl();
			
			Assert.assertEquals(applicationurl,myurl);
			
	      }
	    @Test(enabled= true,priority=3)
	    public void mainPage() {
	    	String title="Swag Labs";
	    	String validate=driver.getTitle();
	    	
	    	Assert.assertEquals(validate,title);
	    	
	    }

	  @BeforeTest
	  public void beforeTest() {
		  String url="https://www.saucedemo.com/";
		  String driverpath="D:\\Lib\\chromedriver.exe";
		  launchBrowser(driverpath,url);
		  
		  driver=WebDriverUtilities.driver;
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }



}

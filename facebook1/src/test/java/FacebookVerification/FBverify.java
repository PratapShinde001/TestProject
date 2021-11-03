package FacebookVerification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.FBbase;
import facebook.FacebookHomepage;
import facebook.FacebookLogin;



public class FBverify extends FBbase{
		
	 WebDriver driver;
	 private FacebookLogin login;
	 private FacebookHomepage home;
	
	 
	 
	 @BeforeTest
	 @Parameters("browser")
	 
	 public void launchBrowser(String browser) throws InterruptedException {
		 if(browser.equals("Chrome"))
		 {
			 driver=OpenChromeBrowser();
		 }
		 if(browser.equals("Firefox"))
		 {
			 driver=openFireFoxBrowser();
		 }
		 
		 driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1500);
	 }
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		//driver = OpenChromeBrowser();
		
	  		Thread.sleep(1500);
	}
	
	@BeforeMethod
	@Parameters("Browser")
	public void beforeMethod()
	{
		System.out.println("Chrome");
		FacebookLogin Login = new FacebookLogin(driver);
		 
		 Login.SendUserName();
		 Login.SendPassword();
		 Login.LogIn();
		 		 
	}
	
	@Test
	public void testA()
	{
		driver.manage().window().maximize();
	}
	
	@Test
	public void testB() throws InterruptedException
	{
		String url = driver.getCurrentUrl();
		//Assert.assertEquals(url, "https://login.oracle.com/mysso/signon.jsp");
		
		SoftAssert soft =new SoftAssert();
		soft.assertNotEquals(url, "http//facebook.market");
		System.out.println(url);
		
		home = new FacebookHomepage(driver);
		Thread.sleep(3000);				
		home.MarketPlace();
		Thread.sleep(3000);
		soft.assertAll();
	}
	
	@AfterMethod()
	public void Aftermethod() throws InterruptedException
	{
		
		home = new FacebookHomepage(driver);
		Thread.sleep(2000);
		home.Logout();
	}
	
	@AfterClass()
	public void afterClass() throws InterruptedException
	{
	//	Thread.sleep(2000);
		driver.close();
	}
	
	@AfterTest()
	
	public void afterTest()
	{
		System.out.println("thanks");
	}
	

}

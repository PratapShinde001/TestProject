package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FBbase {
	
	public static  WebDriver OpenChromeBrowser() {
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver =new ChromeDriver(options);
	return driver;
	
	}
	public static WebDriver openFireFoxBrowser() {
	FirefoxOptions options = new FirefoxOptions() ;
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.gecko.driver", "E:\\gecko\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver(options);
	return driver;
}
}

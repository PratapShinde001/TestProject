package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	
	WebDriver driver;
	@FindBy (xpath="//input[@id='email']")  
	private WebElement username;
	
	@FindBy (xpath ="//input[@id='pass']")
	private WebElement Password;
	
	@FindBy (xpath ="//button[@value='1']")
	private WebElement LogIn;
	
	public FacebookLogin(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Actions Act = new Actions(driver);
	
		
	}
	
	public void SendUserName() {
		username.sendKeys("shindeprataprao001@gmail.com");	
	}
	
	public void SendPassword() {
		Password.sendKeys("Pratap@9665");
	}
	public void LogIn() {
		LogIn.click();
	//	Alert Alt =driver1.switchTo().alert();
	}
//	public void logOut() {
//		logOut.click();
//	}
		

}

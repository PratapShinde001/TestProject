package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomepage {
	
WebDriver driver;
	
	@FindBy (xpath="//a[@aria-label='Marketplace']")
	WebElement marketplace;
	
	@FindBy (xpath="//a[@aria-label='Watch']")
	WebElement Watch;
	
	@FindBy (xpath = "//div[@aria-label='Account']")
	private WebElement DropDown;
	
	@FindBy (xpath = "//span[text()='Log Out']")
	private WebElement LogOut;
	
	@FindBy (xpath ="//div[@aria-label='Create']")
	private WebElement create;
	
	@FindBy (xpath = "//img[@class='hu5pjgll bixrwtb6']")
	private WebElement watch;
	
	public FacebookHomepage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	public void MarketPlace() {
		
	marketplace.click();
		//Watch.click();	
	}
	
//	Actions Act =new Actions(driver);
	//============
	public void create()
	{
		create.click();
	}
	
	public void watch()
	{
		watch.click();
	}
	
	//===============
	public void Logout() throws InterruptedException
	{
		Actions Act = new Actions(driver);
		Act.click(DropDown).perform();
		Thread.sleep(3000);
		Act.click(LogOut).perform();
		

	}
}

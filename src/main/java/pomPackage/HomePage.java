package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (xpath="//*[@name='PIM']")
	private WebElement username ;
	
	@FindBy (xpath="//*[@name='Leave']")
	private WebElement password ;
	
	@FindBy (xpath="//*[text()=' My info ']")
	private WebElement LogInButton ;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this );
	}
	
	
	public void verifyPIMTab()
	{
		PIM.isDisplayed();
	}
	
	public void sendPassword()
	{
		password.sendKeys("admin123");
	}
	
	public void clickOnLogInButton()
	{
		LogInButton.click();
	}
	
	
	
	
	
	
}

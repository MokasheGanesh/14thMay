package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {
	WebDriverWait wait ;
	@FindBy (xpath="//*[@name='username']")
	private WebElement username ;
	
	@FindBy (xpath="//*[@name='password']")
	private WebElement password ;
	
	@FindBy (xpath="//*[@type=\"submit\"]")
	private WebElement LogInButton ;
	
	public LogIn(WebDriver driver)
	{
		 wait = new WebDriverWait(driver,10);
		PageFactory.initElements(driver, this );
	}
	
	
	public void sendUserName()
	{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
		username.sendKeys("Admin");
	}
	
	public void sendPassword()
	{
		password.sendKeys("admin123");
	}
	
	public boolean clickOnLogInButton() throws InterruptedException
	{
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='login']")));

		boolean result= LogInButton.isDisplayed();
		LogInButton.click();
		
		return result;
	}
	
	
}

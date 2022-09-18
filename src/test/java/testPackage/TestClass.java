package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.LogIn;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	//(Verify Login functionality)
	LogIn login= new LogIn(driver);
			login.sendUserName();
			login.sendPassword();
			login.clickOnLogInButton();
	
	//(Verify Home page )
			HomePage home= new HomePage(driver);
					login.verifyPIMTab();
					login.verifyLeaveTab();
					login.verifyMyinfoTab();
			
	}
	
	
	
	
	
	
	
	
	
	
}

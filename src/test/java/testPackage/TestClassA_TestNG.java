package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.beust.jcommander.Parameter;

import pomPackage.LogIn;
import utility.FetchData;
import utility.Pojo;
import utility.Screeshot;

public class TestClassA_TestNG extends Pojo
{
	WebDriver driver;
	ExtentTest logger;
	ExtentReports  extent;
	@BeforeClass
	public void beforeTest()
	{
		WebDriver driver=openChrmoebrowser();
		this.driver=driver;
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./test-output/Batch14thMay.html");
		  extent= new ExtentReports();
		extent.attachReporter(reporter);
		logger = extent.createTest("verifyLogin");
		logger = extent.createTest("testB");
		
		
		
		
	}
	
	@Test (priority=1)
	public void verifyLogin() throws InterruptedException, IOException
	{
		
		
		
		
		
		LogIn login= new LogIn(driver);
				login.sendUserName();
				//login.sendPassword();
				//boolean result	=login.clickOnLogInButton();
				Thread.sleep(2000);
				String actual_URL	=driver.getCurrentUrl();
				System.out.println(actual_URL);
				String expected_URL  = "https://opensource-demo.orangehrmlive.com/web/index.php/auth";
				
				SoftAssert soft= new SoftAssert();
				soft.assertEquals(actual_URL, expected_URL);
		
				System.out.println("Last line of test case");
		
//				Assert.fail();
				
				soft.assertAll();
	
	}
	
	@BeforeMethod
	public void method()
	{
		System.out.println("Before Method");
	}
	
	@Test(priority=2)
	public void testB()
	{
			System.out.println("Hello");
			
		
	}
	
	
	
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String temp = Screeshot.captureScreeshot(driver);
			
			logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		
		extent.flush();
	}
	
	
	
	
}

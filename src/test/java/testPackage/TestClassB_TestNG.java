package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassB_TestNG {

	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass_ClassB");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod__ClassB");
	}
	
	@Test
	public void testA()
	{
		System.out.println("testA_ClassB");
	}
	
	@Test
	public void testB()
	{
		System.out.println("testB_ClassB");
	}
	
	
	@Test
	public void testC() throws InterruptedException
	{
		System.out.println("testC_ClassB");
		
	}
		
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod_ClassB");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass_ClassB");
	}
	
	
	
	
	
	
}

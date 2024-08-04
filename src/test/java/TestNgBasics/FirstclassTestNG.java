package TestNgBasics;

import org.testng.annotations.*;

public class FirstclassTestNG {
	
	@Test(priority=1,groups= {"Sanity","SIT"})
	public void FirstTestcase()
	{
		System.out.println("First Testcase");
	}
	
	@Test(priority=0,groups="SIT")
	public void SecondTestcase()
	{
		System.out.println("Second Testcase");
		throw new ArithmeticException("error");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void BeforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	
}

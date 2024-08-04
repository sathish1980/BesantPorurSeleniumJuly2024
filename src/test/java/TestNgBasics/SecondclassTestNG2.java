package TestNgBasics;

import org.testng.annotations.*;

public class SecondclassTestNG2 {
	
	@Test(priority=1,enabled=true,invocationCount=5,invocationTimeOut=60,groups="Sanity")
	public void FirstTestcaseinSC()
	{
		System.out.println("First Testcase");
	}
	
	@Test(priority=0,timeOut=60,dependsOnMethods="FirstTestcaseinSC",groups="Sanity")
	public void SecondTestcaseinSC()
	{
		System.out.println("Second Testcase");
		//throw new ArithmeticException("error");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method in SC");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method in SC");
	}
	
	//@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class in SC");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class in Sc");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite in sc");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite in Sc");
	}
		
	
}

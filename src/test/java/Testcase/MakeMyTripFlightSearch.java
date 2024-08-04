package Testcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import Drivers.BrowserDriver;
import Elements.CommonElements;
import Pages.SearchPage;
import Pages.SearchResultPage;
import Utils.PropertyFileRead;

public class MakeMyTripFlightSearch extends BrowserDriver {
	
	private String ExpectedNetworkError = "NETWORK PROBLEM";
	private String ExpectedsameCityError = "From & To airports cannot be the same";
	
	
	@BeforeSuite
	public void LaunchBrowser() throws IOException
	{
		launchTheBrowser();
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		CloseTheBrowser();
	}

	
	@BeforeTest
	public void LaunchURL() throws IOException
	{
		String urls = PropertyFileRead.ReadEnvData().getProperty("url");
		browser.get(urls);
	}
	
	@BeforeClass
	public void ClosePopup()
	{
		CommonElements.WaitForElementtobeClickable(browser,By.cssSelector("[data-cy='closeModal']"),60);
		CommonElements.ClickOnButton(browser.findElement(By.cssSelector("[data-cy='closeModal']")));
		
	}
	
	@Test(priority=0)
	public void SearchFlightWithValidValues()
	{
		/*
		 * Click On From and Select the Value from the list
		 * Clicn On TO and Select the Value from the list
		 *  Click On Date and Select the Value
		 *  Click On Search button
		 *  Validate the search result
		 */
		SearchPage sp = new SearchPage(browser);
		//Step 1.
		sp.ClickOnFrom();
		// step1 - part 2
		sp.GetDataFromList("PNQ");
		// Step 2
		sp.ClickOnTo();
		// step2 - part 2
		sp.GetDataFromList("MAA");
		// Step 3
		sp.SelectDate("15");
		//Step 4
		sp.ClickOnSearch();
		//Step 5
		SearchResultPage srp = new SearchResultPage(browser);
		Assert.assertEquals(srp.GetActualNetworkError(), ExpectedNetworkError);
		CommonElements.ClickOnBrowserBackButton(browser);

	}
	


	@Test(priority=1)
	public void SearchFlightWithSameCity()
	{
		/*
		 * Click On From and Select the Value from the list
		 * Clicn On TO and Select the Value from the list

		 */
		SearchPage sp = new SearchPage(browser);
		
		//Step 1.
		sp.ClickOnFrom();
		// step1 - part 2
		sp.GetDataFromList("PNQ");
		// Step 2
		sp.ClickOnTo();
		// step2 - part 2
		sp.GetDataFromList("PNQ");
		//Step 5
		Assert.assertEquals(sp.GetActualsamecityrror(), ExpectedsameCityError);
	}
	
	
	
}

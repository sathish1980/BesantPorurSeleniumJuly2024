package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Elements.CommonElements;

public class SearchResultPage extends CommonElements {

	WebDriver browser;
	
	public SearchResultPage(WebDriver browser)
	{
		this.browser=browser;
	}
	public String GetActualNetworkError()
	{
		WaitForElementvisible(browser,By.cssSelector("[class='error-title']"),60);
		return GetText(browser.findElement(By.cssSelector("[class='error-title']")));	
	}
}

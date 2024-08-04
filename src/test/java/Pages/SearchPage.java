package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Elements.CommonElements;

public class SearchPage extends CommonElements{
	
	WebDriver browser;
	
	public SearchPage(WebDriver browser)
	{
		this.browser=browser;
	}
	
	public void ClickOnFrom()
	{
		WaitForElementtobeClickable(browser,By.cssSelector("[for=fromCity]"),60);
		ClickOnButton(browser.findElement(By.cssSelector("[for=fromCity]")));	
	}
	
	public void GetDataFromList(String expectedCountry)
	{
		List<WebElement> allcountries=	browser.findElements(By.xpath("//*[@id='react-autowhatever-1']//li"));
		for(WebElement eachcountries :allcountries)
		{
			String actualCountry = eachcountries.findElement(By.cssSelector("[class*='flexOne']>div[class*='lightGreyText']")).getText();
			
			//3.Compare the expected with actual value in the list
			if(expectedCountry.equalsIgnoreCase(actualCountry))
			{
				// 4.Once its mathced then i need to click that value from the list
				eachcountries.click();
				break;
			}
		}
	}
	
	public void ClickOnTo()
	{
		WaitForElementtobeClickable(browser,By.cssSelector("[for=toCity]"),60);
		ClickOnButton(browser.findElement(By.cssSelector("[for=toCity]")));	
	}
	
	public void SelectDate(String expectedDate)
	{
		List<WebElement> allWeeks = browser.findElements(By.xpath("(//*[@class='DayPicker-Months']//div[@class='DayPicker-Month'])[last()]//div[@class='DayPicker-Week']"));
		for(WebElement eachWeek : allWeeks)
		{
			List<WebElement> allDaysInaWeek=	eachWeek.findElements(By.cssSelector("div[class^='DayPicker-Day']"));
			for (WebElement eachday : allDaysInaWeek)
			{
				
				String className = eachday.getAttribute("class");
				if(!(className.contains("outside")||className.contains("disabled")||className.contains("selected")))
				{
					String actualDate =eachday.findElement(By.tagName("p")).getText();
					if(actualDate.equalsIgnoreCase(expectedDate))
					{
						eachday.click();
						return ;
					}
				}
			}
		}
	}
	
	public void ClickOnSearch()
	{
		WaitForElementtobeClickable(browser,By.xpath("//*[text()='Search']"),60);
		ClickOnButton(browser.findElement(By.xpath("//*[text()='Search']")));	
	}
	

	
	public String GetActualsamecityrror()
	{
		WaitForElementvisible(browser,By.cssSelector("[data-cy='sameCityError']"),60);
		return GetText(browser.findElement(By.cssSelector("[data-cy='sameCityError']")));	
	}
	

}

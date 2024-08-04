package BasicsTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ListConceptswithRoundTrip {
	
	WebDriver browser;
	public void listimplementaiton(String actualFromCountry,String actualToCountry) throws InterruptedException
	{
		/*
		 * 1.click the list dropdown icon
		 * 2.Get the value from the list
		 * 3.Compare the expected with actual value in the list
		 * 4.Once its mathced then i need to click that value from the list
		 */
				browser=new ChromeDriver();
				browser.get("https://www.makemytrip.com/");
				browser.manage().window().maximize();
				WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-cy='closeModal']")));
				
				//browser.findElement(By.cssSelector("[data-cy='closeModal']")).click();
				browser.findElement(By.className("commonModal__close")).click();
				// click Round Trip
				browser.findElement(By.xpath("//*[@data-cy='roundTrip']//span")).click();
				
				//1.click the list dropdown icon
				browser.findElement(By.cssSelector("[for=fromCity]")).click();
				// 2.Get the value from the list
				SelectFromAndTo(actualFromCountry);
				// 3.Get the value from the list
				browser.findElement(By.cssSelector("[for=toCity]")).click();
				SelectFromAndTo(actualToCountry);
				// 4.Select From date
				SelectFromDate("31");
				// 5.Select To date
				Thread.sleep(5000);
				SelectReturnDate("5");
				
	}
	
	public void SelectFromAndTo(String expectedCountry)
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
	
	public void SelectFromDate(String expectedDate)
	{
		List<WebElement> allWeeks = browser.findElements(By.xpath("(//*[@class='DayPicker-Months']//div[@class='DayPicker-Month'])[1]//div[@class='DayPicker-Week']"));
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
	public void SelectReturnDate(String expectedDate)
	{
		List<WebElement> allWeeks = browser.findElements(By.xpath("(//*[@class='DayPicker-Months']//div[@class='DayPicker-Month'])[last()]//div[@class='DayPicker-Week']"));
		for(WebElement eachWeek : allWeeks)
		{
			List<WebElement> allDaysInaWeek=eachWeek.findElements(By.cssSelector("div[class^='DayPicker-Day']"));
			for (WebElement eachday : allDaysInaWeek)
			{
				
				String className = eachday.getAttribute("class");
				if(!(className.contains("outside")||className.contains("disabled")||className.contains("selected")))
				{
					String actualDate =eachday.findElement(By.tagName("p")).getText();
					if(actualDate.equalsIgnoreCase(expectedDate))
					{
						System.out.println(actualDate);
						eachday.click();
						return ;
					}
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ListConceptswithRoundTrip l = new ListConceptswithRoundTrip();
		l.listimplementaiton("PNQ","MAA");
	}

}

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

public class ListConcepts2 {
	
	public void listimplementaiton(String actualCountry) throws InterruptedException
	{
		/*
		 * 1.click the list dropdown icon
		 * 2.Get the value from the list
		 * 3.Compare the expected with actual value in the list
		 * 4.Once its mathced then i need to click that value from the list
		 */
				WebDriver browser=new ChromeDriver();
				browser.get("https://www.makemytrip.com/");
				browser.manage().window().maximize();
				WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-cy='closeModal']")));
				
				//browser.findElement(By.cssSelector("[data-cy='closeModal']")).click();
				browser.findElement(By.className("commonModal__close")).click();
				
				//1.click the list dropdown icon
				browser.findElement(By.cssSelector("[for=fromCity]")).click();
				// 2.Get the value from the list
				List<WebElement> allcountries=	browser.findElements(By.xpath("//*[@id='react-autowhatever-1']//li"));
				for(WebElement eachcountries :allcountries)
				{
					String expectedCountry = eachcountries.findElement(By.cssSelector("[class*='flexOne']>div[class*='lightGreyText']")).getText();
					
					//3.Compare the expected with actual value in the list
					if(expectedCountry.equalsIgnoreCase(actualCountry))
					{
						// 4.Once its mathced then i need to click that value from the list
						eachcountries.click();
						break;
					}
				}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ListConcepts2 l = new ListConcepts2();
		l.listimplementaiton("PNQ");
	}

}

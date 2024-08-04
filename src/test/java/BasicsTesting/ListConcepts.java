package BasicsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListConcepts {
	
	public void listimplementaiton(String actualCountry) throws InterruptedException
	{
		/*
		 * 1.click the list dropdown icon
		 * 2.Get the value from the list
		 * 3.Compare the expected with actual value in the list
		 * 4.Once its mathced then i need to click that value from the list
		 */
				WebDriver browser=new ChromeDriver();
				browser.get("https://www.leafground.com/select.xhtml;");
				browser.manage().window().maximize();
				//1.click the list dropdown icon
				browser.findElement(By.xpath("//*[@id='j_idt87:country']//div[starts-with(@class,'ui-selectonemenu-trigger')]")).click();
				// 2.Get the value from the list
				List<WebElement> allcountries=	browser.findElements(By.xpath("//*[@id='j_idt87:country_items']//li"));
				for(WebElement eachcountries :allcountries)
				{
					String expectedCountry = eachcountries.getText();
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
		ListConcepts l = new ListConcepts();
		l.listimplementaiton("usa");
	}

}

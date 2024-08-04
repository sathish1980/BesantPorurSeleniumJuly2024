package BasicsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesConcept {

	
	public void TableImplementation(String expectedCountry) throws InterruptedException
	{
		WebDriver browser=new ChromeDriver();
		browser.get("https://www.leafground.com/table.xhtml");
		browser.manage().window().maximize();
		//Thread.sleep(3000);
		//browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]")).click();
		
		/*
		 * pagination
		 */
		List<WebElement> allpage= browser.findElements(By.xpath("//*[@class='ui-paginator-pages']//a"));
		for(int j=1;j<=allpage.size();j++)
		{
			browser.findElement(By.xpath("//*[@class='ui-paginator-pages']//a["+j+"]")).click();
			
			Thread.sleep(2000);
		
		List<WebElement> allRows= browser.findElements(By.xpath("//*[@id='form:j_idt89_data']//tr"));
		for(int i=1;i<=allRows.size();i++)
		{

			String actualCountry = browser.findElement(By.xpath("//*[@id='form:j_idt89_data']//tr["+i+"]//td[2]//span[starts-with(@style,'vertical-align:')]")).getText();
			if(expectedCountry.equalsIgnoreCase(actualCountry))
			{
				String name = browser.findElement(By.xpath("//*[@id='form:j_idt89_data']//tr["+i+"]//td[1]")).getText();
				System.out.println(name);
			}
		}
		}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TablesConcept F = new TablesConcept();
		F.TableImplementation("India");
	}

}

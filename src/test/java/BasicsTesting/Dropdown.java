package BasicsTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class Dropdown {
	
	public void dropdownimplementaiton() throws InterruptedException
	{
				WebDriver browser=new ChromeDriver();
				browser.get("https://www.leafground.com/select.xhtml;");
				browser.manage().window().maximize();
				Select dropdown = new Select(browser.findElement(By.xpath("//*[@class='ui-selectonemenu']")));
				//dropdown.selectByIndex(2);
				System.out.println(dropdown.isMultiple());
				dropdown.selectByVisibleText("Cypress");
				
				if(dropdown.isMultiple())
				{
					dropdown.selectByValue("2");
					dropdown.selectByVisibleText("playwright");
					dropdown.selectByValue("");
					dropdown.deselectByIndex(0);
					
				}
				
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Dropdown R = new Dropdown();
		R.dropdownimplementaiton();
	}

}

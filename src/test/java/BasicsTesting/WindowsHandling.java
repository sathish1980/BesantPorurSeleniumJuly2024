package BasicsTesting;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	
	public void WindowsImplementation() throws InterruptedException
	{
		WebDriver browser=new ChromeDriver();
		browser.get("https://www.leafground.com/window.xhtml;");
		browser.manage().window().maximize();
		String parentWindow = browser.getWindowHandle(); // to get the current window name
		browser.findElement(By.id("j_idt88:new")).click();
		Set<String> allWindows = browser.getWindowHandles();
		System.out.println(allWindows);
		for (String eachWindow : allWindows)
		{
			if(!parentWindow.equalsIgnoreCase(eachWindow))
			{
				browser.switchTo().window(eachWindow);
				List<WebElement> allExist = browser.findElements(By.id("menuform:j_idt40"));
				if(allExist.size()>0)
				{
					browser.findElement(By.id("menuform:j_idt40")).click();
					browser.findElement(By.id("menuform:m_input")).click();
					browser.findElement(By.id("j_idt88:name")).sendKeys("Sathish");
				
					browser.switchTo().window(parentWindow);
					break;
					
				}
			}
			
		}
		browser.quit();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WindowsHandling F = new WindowsHandling();
		F.WindowsImplementation();
	}

}

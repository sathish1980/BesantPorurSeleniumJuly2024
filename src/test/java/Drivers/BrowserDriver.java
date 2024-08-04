package Drivers;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utils.PropertyFileRead;

public class BrowserDriver {
	public static WebDriver browser;
	
	
	public void launchTheBrowser() throws IOException
	{	
		String browserName = PropertyFileRead.ReadEnvData().getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
		browser= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
		browser = new FirefoxDriver();
		}
		else
		{
		browser = new EdgeDriver();
		}
		
		browser.manage().window().maximize();
	}
	
	
	public void CloseTheBrowser()
	{
		if(browser!=null)
		{
			browser.quit();
		}
	}

}

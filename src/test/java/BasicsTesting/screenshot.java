package BasicsTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	WebDriver browser;
	
	public void screenshotimplementaiton() throws InterruptedException, IOException
	{
	/*
	 * vertical- up down
	 * horizontal - right left
	 * towards end
	 * towards top
	 * towards right
	 * towards left
	 * scroll to specific element
	 */
				browser=new ChromeDriver();
				browser.get("https://www.leafground.com/drag.xhtml");
				browser.manage().window().maximize();
				takescreenshot("fistdata");
				// vertical down
				JavascriptExecutor js= (JavascriptExecutor)browser;
				//vertical scroll down
				js.executeScript("window.scrollBy(0,750)", "");
				Thread.sleep(1000);
				// vertical up
				//vertical scroll down
				js.executeScript("window.scrollBy(0,-250)", "");
				// Horizontal right
				js.executeScript("window.scrollBy(750,0)", "");
				Thread.sleep(1000);
				// horizontal left
				js.executeScript("window.scrollBy(-250,0)", "");
				
				//vertical scroll to page end
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				//vertical scroll to page up
				js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
				//horizontal scroll to page right end
				js.executeScript("window.scrollBy(document.body.scrollHeight,0)");
				//horizontal scroll to page left end
				js.executeScript("window.scrollBy(-document.body.scrollHeight,0)");
				
				WebElement progressbar=browser.findElement(By.id("form:j_idt119"));
				js.executeScript("arguments[0].scrollIntoView();", progressbar);
				takescreenshot("Lastdata");
	}
	
	public void takescreenshot(String filename) throws IOException
	{
		String path = System.getProperty("user.dir")+"\\Screenshot\\"+filename+".png";
		TakesScreenshot t =(TakesScreenshot)browser;
		File sourceFile =t.getScreenshotAs(OutputType.FILE);
		File DestinationFile = new File(path);
		FileUtils.copyFile(sourceFile, DestinationFile);
	}
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		screenshot s = new screenshot();
		s.screenshotimplementaiton();
	}

}

package BasicsTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollOperation {
	
	public void scrollimplementaiton() throws InterruptedException
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
				WebDriver browser=new ChromeDriver();
				browser.get("https://www.leafground.com/drag.xhtml");
				browser.manage().window().maximize();
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
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ScrollOperation s = new ScrollOperation();
		s.scrollimplementaiton();
	}

}

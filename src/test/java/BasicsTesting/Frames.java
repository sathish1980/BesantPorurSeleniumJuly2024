package BasicsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	
	public void framesImplementation() throws InterruptedException
	{
		WebDriver browser=new ChromeDriver();
		browser.get("https://www.leafground.com/frame.xhtml");
		browser.manage().window().maximize();
		//Thread.sleep(3000);
		//browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]")).click();
		
		List<WebElement> allFrames= browser.findElements(By.tagName("iframe"));
		for(int i=0;i<allFrames.size();i++)
		{
			browser.switchTo().frame(i);
			List<WebElement> elementExist= browser.findElements(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]"));
			if(elementExist.size()>0)
			{
				browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]")).click();
				browser.switchTo().defaultContent();
				break;
			}
			browser.switchTo().defaultContent();
		}
	}
	
	public void nestedframesImplementation() throws InterruptedException
	{
		WebDriver browser=new ChromeDriver();
		browser.get("https://www.leafground.com/frame.xhtml");
		browser.manage().window().maximize();
		//Thread.sleep(3000);
		//browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]")).click();
		
		List<WebElement> allFrames= browser.findElements(By.tagName("iframe"));
		for(int i=0;i<allFrames.size();i++)
		{
			browser.switchTo().frame(i);
			List<WebElement> secondFrames= browser.findElements(By.tagName("iframe"));
			if(secondFrames.size()>0)
			{
			browser.switchTo().frame("frame2");
			
			List<WebElement> elementExist= browser.findElements(By.xpath("//*[@id='Click' and contains(@style,'4b7ecf')]"));
			if(elementExist.size()>0)
			{
				browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'4b7ecf')]")).click();
				browser.switchTo().defaultContent();
				break;
			}
			}
			browser.switchTo().defaultContent();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Frames F = new Frames();
		F.nestedframesImplementation();
	}

}

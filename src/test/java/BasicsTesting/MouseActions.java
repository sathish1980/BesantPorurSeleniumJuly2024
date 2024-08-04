package BasicsTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions {
	
	public void mouseimplementaiton() throws InterruptedException
	{
		/*
		 * 1.click the list dropdown icon
		 * 2.Get the value from the list
		 * 3.Compare the expected with actual value in the list
		 * 4.Once its mathced then i need to click that value from the list
		 */
				WebDriver browser=new ChromeDriver();
				browser.get("https://www.ebay.com/");
				browser.manage().window().maximize();
				Actions mouse =new Actions(browser);
				mouse.moveToElement(browser.findElement(By.xpath("(//*[@class='vl-flyout-nav__container']//*[text()='Electronics'])[1]"))).perform();
				Thread.sleep(1000);
				mouse.moveToElement(browser.findElement(By.xpath("//*[text()='Computers and tablets']"))).click().perform();
				
	}

	
	public void mouseimplementaiton2() throws InterruptedException
	{
		/*
		 * 1.click the list dropdown icon
		 * 2.Get the value from the list
		 * 3.Compare the expected with actual value in the list
		 * 4.Once its mathced then i need to click that value from the list
		 */
				WebDriver browser=new ChromeDriver();
				browser.get("https://www.facebook.com/");
				browser.manage().window().maximize();
				Actions mouse =new Actions(browser);
				mouse.moveToElement(browser.findElement(By.id("email"))).sendKeys("sathish").doubleClick().contextClick().perform();			
	}
	
	public void dragandDrop() throws InterruptedException
	{
		/*
		 * 1.click the list dropdown icon
		 * 2.Get the value from the list
		 * 3.Compare the expected with actual value in the list
		 * 4.Once its mathced then i need to click that value from the list
		 */
				WebDriver browser=new ChromeDriver();
				browser.get("https://www.leafground.com/drag.xhtml");
				browser.manage().window().maximize();
				Actions mouse =new Actions(browser);
				mouse.moveToElement(browser.findElement(By.id("form:drag"))).dragAndDrop(browser.findElement(By.id("form:drag")), browser.findElement(By.id("form:drop_content"))).perform();
	}
	
	public void dragandDropby() throws InterruptedException
	{
		/*
		 * 1.click the list dropdown icon
		 * 2.Get the value from the list
		 * 3.Compare the expected with actual value in the list
		 * 4.Once its mathced then i need to click that value from the list
		 */
				WebDriver browser=new ChromeDriver();
				browser.get("https://www.leafground.com/drag.xhtml");
				browser.manage().window().maximize();
				Actions mouse =new Actions(browser);
				mouse.moveToElement(browser.findElement(By.id("form:conpnl"))).dragAndDropBy(browser.findElement(By.id("form:conpnl")), 150, 0).perform();
				Thread.sleep(1000);
				mouse.moveToElement(browser.findElement(By.id("form:conpnl"))).dragAndDropBy(browser.findElement(By.id("form:conpnl")), -150, 0).perform();
	}
	
	
	public void keyboard() throws InterruptedException
	{
		/*
		 * 1.click the list dropdown icon
		 * 2.Get the value from the list
		 * 3.Compare the expected with actual value in the list
		 * 4.Once its mathced then i need to click that value from the list
		 */
				WebDriver browser=new ChromeDriver();
				browser.get("https://www.facebook.com/");
				browser.manage().window().maximize();
				Actions mouse =new Actions(browser);
				mouse.moveToElement(browser.findElement(By.id("email"))).sendKeys("sathish").doubleClick().perform();	
				//mouse.keyDown(Keys.CONTROL).keyDown(Keys.)
				mouse.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	}
	
	public void robotclass() throws AWTException
	{
		WebDriver browser=new ChromeDriver();
		browser.get("https://www.facebook.com/");
		browser.manage().window().maximize();
		Actions mouse =new Actions(browser);
		mouse.moveToElement(browser.findElement(By.id("email"))).sendKeys("sathish").doubleClick().perform();	
		//mouse.keyDown(Keys.CONTROL).keyDown(Keys.)
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	
	
	public void robotclass2() throws AWTException
	{
		WebDriver browser=new ChromeDriver();
		browser.get("https://www.facebook.com/");
		browser.manage().window().maximize();
		Actions mouse =new Actions(browser);
		mouse.moveToElement(browser.findElement(By.id("email"))).sendKeys("Besant Techonology").doubleClick().contextClick().perform();	
		//mouse.keyDown(Keys.CONTROL).keyDown(Keys.)
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		MouseActions l = new MouseActions();
		l.robotclass2();
	}

}

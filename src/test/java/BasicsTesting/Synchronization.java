package BasicsTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	
	/*
	 * 1.Implict Wait-->
	 * webdriverobj.manage().timeouts().implicitlywait(Duration.ofSeconds(60))
	 * 2.Explicit Wait-->
	 * 3.Fluent Wait-->
	 *  JAVA wait
	 * 4.Thread.sleep(milliseconds)
	 */
	WebDriver browser;
	
	public void createAccount() throws InterruptedException
	{
				browser=new ChromeDriver();
				browser.get("https://www.facebook.com/");
				//browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				browser.manage().window().maximize();
				browser.findElement(By.cssSelector("[data-testid='open-registration-form-button']")).click();
				//WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
				//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[placeholder=\"First name\"]")));
				Thread.sleep(2000);
				browser.findElement(By.cssSelector("[placeholder=\"First name\"]")).sendKeys("sathish");
				//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[placeholder=\"Last name\"]")));

				browser.findElement(By.cssSelector("[placeholder=\"Last name\"]")).sendKeys("sathish");
				
	}
	
	public void EnterLastName()
	{
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		browser.findElement(By.cssSelector("[placeholder=\"Last name\"]")).sendKeys("sathish");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Synchronization s = new Synchronization();
		s.createAccount();
		s.EnterLastName();
	}

}

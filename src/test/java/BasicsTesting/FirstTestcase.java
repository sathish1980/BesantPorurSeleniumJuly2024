package BasicsTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestcase {
	
	
	public void launch() throws InterruptedException
	{
		//WebDriver browser=new ChromeDriver();
		WebDriver browser=new FirefoxDriver();
		browser.get("https://www.facebook.com/");
		Thread.sleep(1000);
		browser.manage().window().maximize();
		/*Thread.sleep(1000);
		browser.get("https://www.gmail.com/");
		Thread.sleep(1000);
		browser.navigate().back();
		Thread.sleep(1000);
		browser.navigate().forward();
		Thread.sleep(1000);
		browser.navigate().refresh();
		Thread.sleep(1000);
		browser.close();*/
		WebElement userName = browser.findElement(By.id("email"));
		userName.sendKeys("sathish");
		//userName.clear();
		browser.findElement(By.name("email")).sendKeys("kumar");
		//browser.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("kumar");
		//browser.findElement(By.id("u_0_9_Ft")).click();
		//browser.findElement(By.linkText("Forgotten password?")).click();
		//browser.findElement(By.partialLinkText("pass")).click();
		
		// tagname and id
		browser.findElement(By.cssSelector("input#email")).sendKeys("besant");
		// tagname and class
		browser.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("besant");
		// tag and atribute
		browser.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("besant");
		//tag ,class and attribute
		browser.findElement(By.cssSelector("input.inputtext _55r1 _6luy[data-testid='royal_email']")).sendKeys("besant");
		// starts with - cap symbol
		browser.findElement(By.cssSelector("[class^='inputtext']")).sendKeys("besant");
		// ends with - dollar symbol
		browser.findElement(By.cssSelector("[class$='9npi']")).sendKeys("besant");
		// contains - Star symbol
		browser.findElement(By.cssSelector("[class*='9npi']")).sendKeys("besant");
		
		// xpath
		// basic xpath
		browser.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys("Besant");
		//contains
		browser.findElement(By.xpath("//input[contains(@class,'_55r1')]")).sendKeys("test");
		//and or
		browser.findElement(By.xpath("//input[contains(@class,'_55r1') and @id='pass']")).sendKeys("test1");
		//starts-with
		browser.findElement(By.xpath("//input[starts-with(@class,'input') and @id='pass']")).sendKeys("test1");
				
		//text()
		browser.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirstTestcase obj = new FirstTestcase();
		obj.launch();
	}

}

package BasicsTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertConcept {
	
	public void alertimplementaiton() throws InterruptedException
	{
		/*
		 * 1.click the list dropdown icon
		 * 2.Get the value from the list
		 * 3.Compare the expected with actual value in the list
		 * 4.Once its mathced then i need to click that value from the list
		 */
				WebDriver browser=new ChromeDriver();
				browser.get("https://www.leafground.com/alert.xhtml");
				browser.manage().window().maximize();
				browser.findElement(By.id("j_idt88:j_idt91")).click();
				// to click oK
				browser.switchTo().alert().accept();
				String output= browser.findElement(By.id("simple_result")).getText();
				System.out.println(output);
			
				browser.findElement(By.id("j_idt88:j_idt93")).click();
				browser.switchTo().alert().dismiss();
				String output1= browser.findElement(By.id("result")).getText();
				System.out.println(output1);
				browser.findElement(By.id("j_idt88:j_idt104")).click();
				Alert alert = browser.switchTo().alert();
				//browser.switchTo().alert().sendKeys("Besant");
				alert.sendKeys("Besant");
				System.out.println(browser.switchTo().alert().getText());
				//browser.switchTo().alert().accept();
				alert.accept();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AlertConcept l = new AlertConcept();
		l.alertimplementaiton();
	}

}

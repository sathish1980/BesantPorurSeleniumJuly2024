package BasicsTesting;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VVConcept {
	
	public void vvimplementaiton() throws InterruptedException
	{
		/*
		 * 1.click the list dropdown icon
		 * 2.Get the value from the list
		 * 3.Compare the expected with actual value in the list
		 * 4.Once its mathced then i need to click that value from the list
		 */
				WebDriver browser=new ChromeDriver();
				browser.get("https://www.leafground.com/checkbox.xhtml");
				browser.manage().window().maximize();
				// get Title
				String title = browser.getTitle();
				System.out.println(title);
				// get current url
				String url = browser.getCurrentUrl();
				System.out.println(url);
				// get DOM
				String pagesource =browser.getPageSource();
				System.out.println(pagesource);
				// get text
				String text = browser.findElement(By.xpath("(//div[@class='card']//h5)[1]")).getText();
				System.out.println(text);
				// get Atrributes
				String att =browser.findElement(By.xpath("//*[starts-with(@class,'ui-selectcheckboxmenu-multiple-container')]")).getAttribute("data-label");
				System.out.println(att);
				
				// get window NAme
				String wndowname = browser.getWindowHandle();
				System.out.println(wndowname);
				
				// get window NAme
				Set<String> wndownames = browser.getWindowHandles();
				System.out.println(wndownames);
				
				// get css value
				browser.findElement(By.xpath("(//*[starts-with(@class,'ui-chkbox-box ui-widget')])[1]")).click();
				Thread.sleep(1000);
				String back =browser.findElement(By.xpath("(//*[starts-with(@class,'ui-chkbox-box ui-widget')])[1]")).getCssValue("background");
				System.out.println(back);
				
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		VVConcept l = new VVConcept();
		l.vvimplementaiton();
	}

}

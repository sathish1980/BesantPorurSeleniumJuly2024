package BasicsTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightaElement {

	
	public void highlight()
	{
		WebDriver browser=new ChromeDriver();
		browser.get("https://www.leafground.com/checkbox.xhtml");
		browser.manage().window().maximize();
		WebElement ele = browser.findElement(By.xpath("(//*[starts-with(@class,'ui-chkbox-box ui-widget')])[1]"));
		ele.click();
		JavascriptExecutor js = (JavascriptExecutor) browser;
        //use executeScript() method and pass the arguments 
        //Here i pass values based on css style. Yellow background color with solid red color border. 
		//js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", ele);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighlightaElement H = new HighlightaElement();
		H.highlight();
	}

}

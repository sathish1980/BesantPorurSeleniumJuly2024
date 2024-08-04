package BasicsTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class RadiobuttonandCheckbox {
	
	public void radiobutton() throws InterruptedException
	{
				WebDriver browser=new ChromeDriver();
				browser.get("https://www.leafground.com/radio.xhtml");
				browser.manage().window().maximize();
				browser.findElement(By.xpath("(//table[@id='j_idt87:console1']//span[starts-with(@class,'ui-radiobutton-icon')])[4]")).click();
				String className = browser.findElement(By.xpath("(//table[@id='j_idt87:console1']//span[starts-with(@class,'ui-radiobutton-icon')]//parent::div)[4]")).getAttribute("class");
				System.out.println(className);
				if(className.contains("ui-state-active"))
				{
					System.out.println("True");
				}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RadiobuttonandCheckbox R = new RadiobuttonandCheckbox();
		R.radiobutton();
	}

}

package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateDataInTextbox 
{
	public static void main(String[] args) throws InterruptedException {

		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.id("username"));
		String unbefvalue=username.getAttribute("value");
		System.out.println(unbefvalue);
		//username.sendKeys("admin");
		//String unvalue=username.getAttribute("value");
		//System.out.println(unvalue);
		
		
		
	}
}

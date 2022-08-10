package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebLogoff 
{
	public static void main(String[] args) throws InterruptedException 
	{
		  String chromekey="webdriver.chrome.driver";
		  String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		  System.setProperty(chromekey, chromevalue);
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.id("email")).sendKeys("9206609040");
		  Thread.sleep(2000);
		  driver.findElement(By.id("pass")).sendKeys("Agnello@12345");
		  driver.findElement(By.name("login")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("[aria-label='Account']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		  
		  
		  
		  
		  
		  
		  
		
		  
		
	}

}

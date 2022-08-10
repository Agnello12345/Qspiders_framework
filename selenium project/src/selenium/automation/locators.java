package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args)
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	    driver.findElement(By.className("textField")).sendKeys("admin");
	    driver.findElement(By.className("pwdfield")).sendKeys("manager");
	    driver.findElement(By.className("initial")).click();
		
		
		
		
		
		
	}

}

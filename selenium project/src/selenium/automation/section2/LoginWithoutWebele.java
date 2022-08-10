package selenium.automation.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginWithoutWebele 
{
	public static void main(String[] args)
	{String chromekey="webdriver.chrome.driver";
	String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
	System.setProperty(chromekey, chromevalue);
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement un=driver.findElement(By.id("username"));
	WebElement pwd=driver.findElement(By.name("pwd"));
	WebElement logbut=driver.findElement(By.id("loginButton"));
   Actions act=new Actions(driver);
   //act.sendKeys(un,"admin").perform();
   //act.sendKeys(pwd,"manager").perform();
   //act.click(logbut).perform();
   act.sendKeys(un,"admin").sendKeys(pwd,"manager").sendKeys(logbut,"loginButton").build().perform();
	
	
	
		
	}

}

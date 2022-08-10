package selenium.automation.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitActi 
{
	public static void main(String[] args) 
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//		driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
//	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.titleContains("Time-Track"));
//	    
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='sbct']//span[starts-with(text(),'selenium')]")));
	}

}

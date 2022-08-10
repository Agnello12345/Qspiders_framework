package selenium.automation.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBxHandByKeybdStr 
{
	public static void main(String[] args) 
	{

		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement daylist=driver.findElement(By.id("day"));
		daylist.click();
		daylist.sendKeys(Keys.ARROW_UP);
		daylist.sendKeys(Keys.ARROW_UP);
		daylist.sendKeys(Keys.ARROW_UP);
		daylist.sendKeys(Keys.ARROW_UP);
		daylist.sendKeys(Keys.ARROW_UP);
		daylist.sendKeys(Keys.ARROW_UP);
		daylist.sendKeys(Keys.ARROW_UP);
		daylist.sendKeys(Keys.ARROW_UP);
		daylist.sendKeys(Keys.ARROW_UP);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ENTER);
	}

}

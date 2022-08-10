package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class DemoRelativeLocators 
{
	public static void main(String[] args) throws InterruptedException
	{
		int UniqueNum=(int)(Math.random()*1000000);
		String name="Rakesh" + UniqueNum;
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement pwdele=driver.findElement(By.name("pwd"));
		driver.findElement(RelativeLocator.with(By.tagName("input"))).above(pwdele).sendKeys("admin");
		
		
	

}
}
package selenium.automation.section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyClassHandling 
{public static void main(String[] args) throws InterruptedException 
{
	String chromekey="webdriver.chrome.driver";
	String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
	System.setProperty(chromekey, chromevalue);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	//driver.findElement(By.id("username")).sendKeys("admin")
    //driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
    // WebElement pwd=driver.findElement(By.name("pwd"));
//    pwd.sendKeys("manager");
//    pwd.sendKeys(Keys.ENTER);
    //pwd.sendKeys("manager",Keys.ENTER);
      
    //to select checkbox without click()
    driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);

}
}
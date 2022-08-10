package generic.repository;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;
	public DataUtility data= new DataUtility();
	@BeforeClass
	public void configBC() throws IOException
	{
		System.out.println("-------Browser Launch-------");
		System.setProperty(AutomationUtils.CHROMEKEY, AutomationUtils.CHROMEVALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data.accessPropertyData("url"));
		}
	
	@BeforeMethod
	public void ConfigBM() throws IOException
	{
		System.out.println("------Login to appln-----");
		driver.findElement(By.name("user_name")).sendKeys(data.accessPropertyData("username"));
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
	}
	
	@AfterMethod
	public void configAM()
	{ driver.findElement(By.xpath("//td[@class='genHeaderSmall']/following-sibling::td")).click();
    WebElement mor=driver.findElement(By.xpath("(//td[@class='small'])[2]"));
    Actions act1=new Actions(driver);
    act1.moveToElement(mor).click().build().perform();
    driver.findElement(By.linkText("Sign Out")).click();
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("---BROWSER CLOSED---");
		driver.quit();
		
	}
	

}

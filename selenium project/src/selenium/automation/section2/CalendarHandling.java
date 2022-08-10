package selenium.automation.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling 
{
	public static void main(String[] args) 
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		driver.findElement(By.id("datepicker")).click();
		//driver.findElement(By.cssSelector("a.ui-state-highlight")).click();
		//only used to handle current date
		
		
		//case 1--------if todays date is month end.
		WebElement ele=driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]/../following-sibling::td[1]"));
		List<WebElement> list=driver.findElements(By.xpath("//a[contains(@class,'ui-state-highlight')]/../following-sibling::td"));
		
		if(ele.getAttribute("class").contains(" ui-datepicker-other-month ui-datepicker-unselectable ui-state-disabled"))
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.xpath("//a[text()='1']")).click();
		}
		
		
		//case 2----------if todays date will be weekend.
		
		else if(list.size()==0)
		{
			List<WebElement> list1=driver.findElements(By.xpath("//a[contains(@class,'ui-state-highlight')]/../../preceding-sibling::tr"));
			if(list1.size()==0)
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				driver.findElement(By.xpath("//a[text()='1']")).click();
			}
			else
			{
				driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]/../../preceding-sibling::tr[1]/td[1]/a")).click();
			}
		}
		else
		{
			
		}
		
	}
	

}

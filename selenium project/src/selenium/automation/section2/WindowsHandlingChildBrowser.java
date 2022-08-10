package selenium.automation.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlingChildBrowser
{
	public static void main(String[] args) 
	{

        String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement jobs=driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act=new Actions(driver);
		act.moveToElement(jobs).perform();
		driver.findElement(By.linkText("Jobs by skill")).click();
		String mainId=driver.getWindowHandle();
		Set<String> allId=driver.getWindowHandles();
		System.out.println("main id is:" +mainId);
		for(String id:allId)
		{
			System.out.println(id);
			if(!mainId.equals(id))
			{
				driver.switchTo().window(id);
			}}
		String Skilltitle=driver.findElement(By.xpath("//h2[text()='Browse Jobs by IT Skills']")).getText();
		System.out.println(Skilltitle);
		driver.switchTo().window(mainId);
		driver.findElement(By.cssSelector("input[placeholder='Enter skills / designations / companies']")).sendKeys("automation");
		
		
		
		
		
			
			
		}
		

	
}

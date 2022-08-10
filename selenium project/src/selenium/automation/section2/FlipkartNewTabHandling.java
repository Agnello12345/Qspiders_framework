package selenium.automation.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNewTabHandling 
{
	public static void main(String[] args) 
	{

        String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone X",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Space Gray, 256 GB)']")).click();
		String mainID=driver.getWindowHandle();
		Set <String> allID=driver.getWindowHandles();
		for(String id:allID)
		{
			if(!mainID.equals(id))
			{
				driver.switchTo().window(id);
			}
			
		}
		String prize=driver.findElement(By.xpath("//span[text()='APPLE iPhone X (Space Gray, 256 GB)']/../../..//div[contains(@class,'jeq')]")).getText();
		System.out.println(prize);
		driver.switchTo().window(mainID);
        
	
		


}
}
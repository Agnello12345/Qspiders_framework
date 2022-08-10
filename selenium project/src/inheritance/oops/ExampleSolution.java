package inheritance.oops;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExampleSolution 
{
	public static void main(String[] args) 
	{
			
			
		
		String key="WebDriver.chrome.driver";
			String value="C:\\Users\\PC\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.ebay.com/");
			List<WebElement> list = driver.findElements(By.xpath("//Select[@aria-label='Select a category for search']"));	
			for(WebElement wb:list)
			{
					System.out.println(wb.getText());
		    }
			

	}


}

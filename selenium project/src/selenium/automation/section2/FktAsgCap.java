package selenium.automation.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FktAsgCap 
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
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("iphonex",Keys.ENTER);
		List<WebElement> text=driver.findElements(By.xpath("//div[starts-with(text(),'APPLE iPhone')]"));
	    List<WebElement> prize= driver.findElements(By.xpath("//div[starts-with(text(),'APPLE iPhone')]/../../div[2]/div[1]/div[1]/div[1]"));
	    System.out.println(text.size());
	    System.out.println(prize.size());
	    for(WebElement wb1:text)
	    {
	    	for(WebElement wb2:prize)
	    	{
	    		int count=0;
	       if(count==prize.size())
	    	   
    		{
    			break;
 		}
			System.out.println(wb1.getText()+"  "+wb2.getText());
			count++;
			break;
	    	}
	}
}
}
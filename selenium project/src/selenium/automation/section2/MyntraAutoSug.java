package selenium.automation.section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAutoSug 
{public static void main(String[] args) throws InterruptedException
{
	String chromekey="webdriver.chrome.driver";
	String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
	System.setProperty(chromekey, chromevalue);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("Reebok");
	Thread.sleep(2000);
	List<WebElement> myntrasug=driver.findElements(By.cssSelector("li.desktop-suggestion.null"));
	for(WebElement wb:myntrasug)
	{
	System.out.println(wb.getText());
	}
	for(WebElement wb:myntrasug)
	{
	if(wb.getText().equals("Reebok Slippers"))
	{
		System.out.println("REEBOK SLIPPERS IS PRESENT IN THE SUGGESTION");
		wb.click();
		break;
	}
	
	}
	System.out.println("total no of suggestions:" +myntrasug.size());
	driver.close();
}

}

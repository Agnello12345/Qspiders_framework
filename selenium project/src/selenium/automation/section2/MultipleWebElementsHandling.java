package selenium.automation.section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElementsHandling 
{
	public static void main(String[] args) 
	{

        String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		
		
		//List<WebElement> allLinks=driver.findElements(By.tagName("a"));     by using tagname
		int count=0;
		for(WebElement wb:allLinks)
		{
			System.out.println(wb.getText());
			count++;
		}
	//System.out.println("total number of links:" +allLinks.size());           ///by using size()
		System.out.println("total number of links:" +count);
		driver.close();
	}

}



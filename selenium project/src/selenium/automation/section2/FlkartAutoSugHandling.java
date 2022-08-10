package selenium.automation.section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlkartAutoSugHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
        String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//  using keystroke handling driver.findElement(By.name("q")).sendKeys("bluetooth",Keys.ENTER);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("bluetooth");
		Thread.sleep(2000);
	   List<WebElement> fkartsugs=driver.findElements(By.xpath("//div[contains(@data-tkid,'bluetooth')]"));
	   for(WebElement wb:fkartsugs)
	   {
		   System.out.println(wb.getText());
	   }
	   for(WebElement wb:fkartsugs)
	   { 
		   String text=wb.getText();
		  if(text.equals("bluetooth earphone"))
		  {
			  System.out.println("bluetooth earphoine is present in suggestion");
			  wb.click();
			  break;
		  }
	   }
}
}
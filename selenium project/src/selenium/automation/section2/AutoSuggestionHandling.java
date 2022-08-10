package selenium.automation.section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{

        String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allsuggestion=driver.findElements(By.xpath("//li[@class='sbct']//span[starts-with(text(),'selenium')]"));
//		for(WebElement wb:allsuggestion)
//		{
//			System.out.println(wb.getText());
//		}
//		System.out.println("total suggestions are:" +allsuggestion.size());
//		
		
		for(WebElement wb:allsuggestion)
		{
			String text=wb.getText();
			if(text.equals("selenium testing"))
			{
				System.out.println("selenium testing is present in the suggestion");
				wb.click();
				break;
			}
		}
		
		
		
		
		
		
		driver.close();
		

}
}
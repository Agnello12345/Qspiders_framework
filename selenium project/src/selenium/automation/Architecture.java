package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Architecture 
{
	public static void main(String[] args) throws InterruptedException 
	{
		  String chromekey="webdriver.chrome.driver";
		  String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		  System.setProperty(chromekey, chromevalue);
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		  WebElement Search=driver.findElement(By.name("q"));
		  Search.sendKeys("bluestar");
		  Search.submit();
		  
		  
		 
		  
		  
		  
		  
	

}
}
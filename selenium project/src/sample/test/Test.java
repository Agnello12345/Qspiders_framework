package sample.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PC\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/dialog-boxes/");
		driver.findElement(By.cssSelector("button[id='create-user']")).click();
		
	    
  List<WebElement> allText = driver.findElements(By.cssSelector("div[id='dialog-form']"));
  for(WebElement text:allText)
  {
	  if(text.equals("Name"))
	  {
		  System.out.println("The ctreate user button is clicked and displayed");
	  }
	  
  break;
  
  }}
	
		
		
		
		
		
		
	
	
	}}
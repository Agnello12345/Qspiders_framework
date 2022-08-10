package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXpathIndex 
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
		driver.findElement(By.name("q")).sendKeys("APPLE IPHONE X");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//span[text()='Add to Compare']/../../span)[1]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//span[text()='Add to Compare']/../../span)[2]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//span[text()='Add to Compare']/../../span)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Add to Compare']/../../span)[last()]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Add to Compare']/../../span)[last()-1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Add to Compare']/../../span)[last()-2]")).click();
		
}
}
package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartRating 
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
		driver.findElement(By.name("q")).sendKeys("boat bluetooth headphones");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		//String brandname=driver.findElement(By.xpath("//a[text()='boAt Rockerz 450 with Upto 15 Hours Playback Bluetooth ...']")).getText();
		//System.out.println(brandname);
	    //String Rating=driver.findElement(By.cssSelector("productRating_LSTACCFEHZ8GSGWMMSD3VEWSN_ACCFEHZ8GSGWMMSD_")).getText();
		Thread.sleep(2000);
	    String Rating=driver.findElement(By.xpath("//a[text()='boAt Rockerz 450 with Upto 15 Hours Playback Bluetooth ...']/../div[2]")).getText();
	    System.out.println(Rating);
	    
	    
	    
	    
	    
	    
	    
	    driver.close();
	    
}
}

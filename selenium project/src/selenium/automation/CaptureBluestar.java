package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureBluestar
{
	public static void main(String[] args) throws InterruptedException
	{
		String chromekey = "webdriver.chrome.driver";
		String chromevalue = "D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey,chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("blue star");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Blue Star']")).click();
		String capturetext=driver.findElement(By.id("result-stats")).getText();
		System.out.println(capturetext);
		driver.close();
	}
}

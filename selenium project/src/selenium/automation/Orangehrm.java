package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm 
{
	public static void main(String[] args) throws InterruptedException
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='FREE TRIAL']")).click();
		String captext=driver.findElement(By.xpath("//span[text()='Pick a username for OrangeHRM trial.']")).getText();
		System.out.println(captext);
		driver.close();
		}
}

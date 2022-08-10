package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathQuest 
{
	public static void main(String[] args) throws InterruptedException
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/html/webpage%20registration.html");
		driver.findElement(By.xpath("//input[1]")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[2]")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[6]")).click();
	    //driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("admin");
	    //driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("manager");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/input[7]")).click();
}
}

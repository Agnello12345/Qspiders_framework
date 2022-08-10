package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttrib 
{
	public static void main(String[] args) throws InterruptedException 
	{

		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[contains(@placeholder,'User')]")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		String text=driver.findElement(By.xpath("(//label[text()='Keep me logged in']")).getText();
		System.out.println(text);
		String print=driver.findElement(By.xpath("//label[contains(text(),'Keep me')]")).getText();
		System.out.println(print);
		driver.close();
		
		
	}

}

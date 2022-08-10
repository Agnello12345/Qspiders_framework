package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingReebok 
{
	public static void main(String[] args) throws InterruptedException
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("Reebok");
		driver.findElement(By.className("desktop-iconSearch")).click();
		String brandname=driver.findElement(By.className("title-title")).getText();
		System.out.println(brandname);
		String inventory=driver.findElement(By.className("title-count")).getText();
		System.out.println(inventory);
		if(brandname==brandname)
		{
			if(inventory==inventory)
			{
				System.out.println("validation pass");
			}
			else
			{
				System.out.println("validation fail");
			}
		}
	}
}



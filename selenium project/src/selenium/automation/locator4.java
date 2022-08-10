package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator4 {
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
		//driver.findElement(By.partialLinkText("Login")).click();
		//Thread.sleep(3000);
		//String timetrack=driver.findElement(By.cssSelector("td.pagetitle")).getText();
		//System.out.println(timetrack);
		//if(timetrack.equals("Enter Time-Track"))
		//{
			//System.out.println("validation pass");
		//}
		//else
		//{
			//System.out.println("validation fail");
		//}
		
	//}
//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.get("https://www.myntra.com/");
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("Reebok");
		//driver.findElement(By.className("desktop-iconSearch")).click();
		//String BrandName=driver.findElement(By.cssSelector("h1.title-title")).getText();
		//System.out.println(BrandName);
		//String Quantity= driver.findElement(By.cssSelector("span.title-count")).getText();
		//System.out.println(Quantity);
		//if(BrandName==BrandName )
		//{
			//if(Quantity==Quantity) {
				//System.out.println("validatioin pass");
			//}
			
		//}
		//else {
			//System.out.println("validatioin fails");
		//}
	//}
//}
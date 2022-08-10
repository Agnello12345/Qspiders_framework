package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime 
{
	public static void main(String[] args) throws InterruptedException
	{
		int UniqueNum=(int)(Math.random()*1000000);
		String name="Rakesh" + UniqueNum;
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a#loginButton")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div#container_tasks")).click();
		driver.findElement(By.cssSelector("div.plusIcon")).click();
		driver.findElement(By.cssSelector("div.createNewCustomer")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.newNameField ")).sendKeys(name);
		driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("Rakesh is new customer");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
		String CustomerName = driver.findElement(By.xpath("//div[text()'" +name+ "']")).getText();
		System.out.println("customer create with name:" +CustomerName);
		if(CustomerName.equals(name))
		{
			System.out.println("customer creation pass");
		}
		else
		{
			System.out.println("customer creation fail");
		}
		driver.close();
		
		
	
	}
	}

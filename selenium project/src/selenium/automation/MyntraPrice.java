package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraPrice 
{
	public static void main(String[] args) throws InterruptedException 
	{

		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("watch");
		driver.findElement(By.className("desktop-submit")).click();
		String brand=driver.findElement(By.xpath("//h3[text()='boAt']")).getText();
		//String brand=driver.findElement(By.cssSelector("h3.product-brand")).getText();
		System.out.println(brand);
        String price=driver.findElement(By.cssSelector("span.product-discountedPrice")).getText();		
        System.out.println(price);

}
}


package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDealsCap
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
		String title=driver.findElement(By.xpath("//h2[text()='Deals of the Day']")).getText();
		System.out.println(title);
		String deals=driver.findElement(By.xpath("//h2[text()='Deals of the Day']/../div[1]")).getText();
		System.out.println(deals);


}
}
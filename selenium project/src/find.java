import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class find {
	public static void main(String[] args)
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("9206609040");
		driver.findElement(By.id("pass")).sendKeys("Agnello@12345");
		driver.findElement(By.name("login")).click();
		
		
		
	}
	
	

}

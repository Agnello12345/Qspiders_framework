package selenium.automation.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOrangehrm 
{
	public static void main(String[] args) throws InterruptedException
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.findElement(By.cssSelector("a.btn-orange.trial-btn.pulse")).click();
		driver.findElement(By.name("FullName")).sendKeys("AGNELLO FERNANDES A");
		driver.findElement(By.name("CompanyName")).sendKeys("qspiders");
		driver.findElement(By.name("JobTitle")).sendKeys("faculty");
		driver.findElement(By.xpath("//select[@name='NoOfEmployees']//option[@value='76 - 100']")).click();
		driver.findElement(By.xpath("//div[@class='iti__selected-flag']")).click();
		List<WebElement> countries=driver.findElements(By.xpath("//ul[@class='iti__country-list']//li//span[@class='iti__country-name']"));
		for(WebElement wb:countries)
		{
			System.out.println(wb.getText());
			if(wb.getText().equals("India"))
			{
			System.out.println("country is present in the list");
			wb.click();
			break;
			}
		
		}
		driver.findElement(By.cssSelector("input#Form_submitForm_Contact")).sendKeys("9206609040");
		System.out.println(countries.size());
		
		
	

}
}
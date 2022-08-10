package selenium.automation.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions 
{
	public static void main(String[] args) 
	{

        String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement image=driver.findElement(By.className("icp-nav-link-inner"));
		Actions act=new Actions(driver);
		act.moveToElement(image).perform();
        WebElement changeopt=driver.findElement(By.linkText("Change"));
        act.moveToElement(changeopt).click().build().perform();
        WebElement select=driver.findElement(By.cssSelector("input[value='pt_BR']"));
        act.moveToElement(select).click().build().perform();
        WebElement dollar=driver.findElement(By.cssSelector("span[data-action='a-dropdown-button']"));
        act.moveToElement(dollar).click().build().perform();
        WebElement currency=driver.findElement(By.linkText("₹ - INR - Indian Rupee"));
        act.moveToElement(currency).click().build().perform();
        WebElement save=driver.findElement(By.className("a-button-input"));
       act.moveToElement(save).click().build().perform();
      
}
}
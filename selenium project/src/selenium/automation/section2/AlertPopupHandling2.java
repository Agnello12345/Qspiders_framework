package selenium.automation.section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandling2 
{
	public static void main(String[] args) 
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alt1=driver.switchTo().alert();
        alt1.dismiss();
        String res1=driver.findElement(By.id("result")).getText();
        System.out.println(res1);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alt2=driver.switchTo().alert();
        alt2.sendKeys("my own message");
        alt2.accept();
        String res2=driver.findElement(By.id("result")).getText();
        System.out.println(res2);
        
        
    

}
}
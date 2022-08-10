package selenium.automation.section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandling 
{

	public static void main(String[] args) 
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
        driver.findElement(By.cssSelector("div[class='popup_menu_button popup_menu_button_settings '] ")).click();
        driver.findElement(By.linkText("Types of Work")).click();
        driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
        driver.findElement(By.cssSelector("input[id='name']")).sendKeys("testing");
        driver.findElement(By.cssSelector("input[onclick='handleCancel();']")).click();
        Alert alt=driver.switchTo().alert();
        String alertmsg=alt.getText();
        System.out.println(alertmsg);
        alt.accept();

}
}
package selenium.automation.section2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptInvInAuto 
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
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("document.querySelector('input#username').setAttribute('value','admin');");
        jse.executeScript("document.querySelector(input[name='pwd']).setAttribute('value','manager);");
        jse.executeScript("document.querySelector(\"a#loginButton\").click();");
        
        

}
}

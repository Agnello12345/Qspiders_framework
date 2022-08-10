package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateHoverMessage 
{
	public static void main(String[] args) throws InterruptedException {

		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement chkbx=driver.findElement(By.id("keepLoggedInCheckBox"));
		String hovermsg=chkbx.getAttribute("title");
		System.out.println(hovermsg);
		driver.close();

}
}
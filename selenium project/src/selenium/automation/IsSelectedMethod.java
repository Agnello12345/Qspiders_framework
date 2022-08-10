package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod 
{
	public static void main(String[] args) 
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/html/webpage%20registration.html");
		WebElement chkbx=driver.findElement(By.cssSelector("input[type='checkbox']"));
		chkbx.click();
		if(chkbx.isSelected())
		{
			System.out.println("checkbox selected succefully");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}

}
}
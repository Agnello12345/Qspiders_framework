package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueValidErrorMsg 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String chromekey="webdriver.chrome.driver";
		  String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		  System.setProperty(chromekey, chromevalue);
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.actitime.com/login.do");
		  Thread.sleep(2000);
		  driver.findElement(By.id("loginButton")).click();
		  Thread.sleep(2000);
		  WebElement error=driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
		  String err=error.getText();
		  System.out.println(err);
		  if(error.getText().contains(err))
			  //if(error.getText().contains("username or password is invalid")
		  {
			  System.out.println("error text validation pass");
		  }
		  else
		  {
			  System.out.println("error text validation fail");
		  }
		  String colourcode=error.getCssValue("color");
		  System.out.println(colourcode);
		  if(colourcode.equals("rgba(206, 1, 0, 1)"))
		  {
			  System.out.println("error colour validation pass");
		  }
		  else
		  {
			  System.out.println("error colour validation fail");
		  }
		  String fontvalue=error.getCssValue("font");
		  System.out.println(fontvalue);
		  driver.close();
		  
		  
		
	}

}

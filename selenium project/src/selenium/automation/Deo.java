package selenium.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Deo
{
	public static void main(String[] args) throws Throwable
	{
  String chromekey="webdriver.chrome.driver";
  String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
  System.setProperty(chromekey, chromevalue);
  ChromeDriver driver=new ChromeDriver();
  driver.get("https://www.flipkart.com/");
  String name=driver.getCurrentUrl();
  System.out.println(name);
	}

}

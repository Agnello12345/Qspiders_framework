package selenium.automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Akhil 
{
	public static void main(String[] args) throws Throwable
	{
  String chromekey="webdriver.chrome.driver";
  String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
  System.setProperty(chromekey, chromevalue);
  ChromeDriver driver=new ChromeDriver();
  driver.get("https://www.flipkart.com/");
  driver.get("https://www.amazon.com/");
  String name=driver.getTitle();
  System.out.println(name);
  String url=driver.getCurrentUrl();
  System.out.println(url);
  String sourcecode=driver.getPageSource();
  System.out.println(sourcecode);
  driver.manage().window().maximize();
  Thread.sleep(3000);
  driver.manage().window().minimize();
  Thread.sleep(3000);
  driver.manage().window().fullscreen();
  Thread.sleep(3000);
  driver.manage().window().setSize(new Dimension(300,500));
  Thread.sleep(3000);
  Point p=new Point(200,300);
  driver.manage().window().setPosition(p);
  Thread.sleep(3000);
  Navigation nav=driver.navigate();
  nav.back();
  Thread.sleep(3000);
  nav.forward();
  Thread.sleep(3000);
  nav.refresh();
  driver.close();
  driver.quit();
	}
  
}

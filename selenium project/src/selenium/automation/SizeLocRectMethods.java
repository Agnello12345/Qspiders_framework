package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeLocRectMethods
{
	public static void main(String[] args) throws InterruptedException {

		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.id("username"));
		Dimension d=username.getSize();
		System.out.println(d.getHeight()+"----"+d.getWidth());
		Point p=username.getLocation();
		System.out.println(p.getX()+"------"+p.getY());
		Rectangle rect=username.getRect();
		System.out.println("the height is:" +rect.height);
		System.out.println("the width is:" +rect.width);
		System.out.println("the x distance is:" +rect.getX());
		System.out.println("the y distance is:" +rect.getY());
		
		
		

}
}

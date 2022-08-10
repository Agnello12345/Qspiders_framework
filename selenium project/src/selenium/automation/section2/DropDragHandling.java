package selenium.automation.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDragHandling 
{
	public static void main(String[] args) 
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
	
		
		WebElement drag1=driver.findElement(By.xpath("//div[text()='Stockholm'][2]"));
		WebElement drop1=driver.findElement(By.xpath("//div[text()='Sweden']"));
		Actions act=new Actions(driver);
	    act.dragAndDrop(drag1, drop1).perform();
		WebElement drag2=driver.findElement(By.xpath("//div[text()='Washington'][2]"));
		WebElement drop2=driver.findElement(By.xpath("//div[text()='United States']"));
		act.dragAndDrop(drag2, drop2).perform();
		WebElement drag3=driver.findElement(By.xpath("//div[text()='Madrid'][2]"));
		WebElement drop3=driver.findElement(By.xpath("//div[text()='Spain']"));
		act.dragAndDrop(drag3, drop3).perform();
		WebElement drag4=driver.findElement(By.xpath("//div[text()='Rome'][2]"));
		WebElement drop4=driver.findElement(By.xpath("//div[text()='Italy']"));
		act.dragAndDrop(drag4, drop4).perform();
		WebElement drag5=driver.findElement(By.xpath("//div[text()='Copenhagen'][2]"));
		WebElement drop5=driver.findElement(By.xpath("//div[text()='Denmark']"));
		act.dragAndDrop(drag5, drop5).perform();
		WebElement drag6=driver.findElement(By.xpath("//div[text()='Oslo'][2]"));
		WebElement drop6=driver.findElement(By.xpath("//div[text()='Norway']"));
		act.dragAndDrop(drag6, drop6).perform();
		WebElement drag7=driver.findElement(By.xpath("//div[text()='Seoul'][2]"));
		WebElement drop7=driver.findElement(By.xpath("//div[text()='South Korea']"));
		act.dragAndDrop(drag7, drop7).perform();
		
		
	

}
}
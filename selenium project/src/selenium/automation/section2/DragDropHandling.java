package selenium.automation.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropHandling 
{
	public static void main(String[] args) 
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement dragele=driver.findElement(By.id("draggable"));
		WebElement dropele=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		//act.dragAndDrop(dragele, dropele).perform();
		act.clickAndHold(dragele).release(dropele).build().perform();
		
		
	}

}

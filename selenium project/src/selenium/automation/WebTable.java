package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable 
{
	public static void main(String[] args) throws InterruptedException
	{
		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/html/webtable.html");
		String age=driver.findElement(By.xpath("//td[text()=' Agnello Fernandes ']/../td[3]")).getText();
		System.out.println("age of agnello is:" +age);
		String Age=driver.findElement(By.xpath("//td[text()=' Akash ']/following-sibling::td[2]")).getText();
		System.out.println("age of akash is:" +Age);
		String name=driver.findElement(By.xpath("//*[text()=' sister ']/preceding-sibling::td")).getText();
		System.out.println("Name is :" +name);
		String ages=driver.findElement(By.xpath("//th[text()=' Age ']/../following-sibling::tr/td[3][text()<'28']")).getText();
		System.out.println("age below 28 :" +ages);
		String A=driver.findElement(By.xpath("//th[text()=' Age ']/../following-sibling::tr/td[3][text()<='28']")).getText();
		System.out.println("ages below and equal to 28 is:" +A);
		String B=driver.findElement(By.xpath("//th[text()=' Age ']/../following-sibling::tr/td[3][text()>'25']")).getText();
		System.out.println("age greater than 25 is:" +B);
		String C=driver.findElement(By.xpath("//th[text()=' Age ']/../following-sibling::tr/td[3][text()>='25']")).getText();
		System.out.println("age greater than or equal to 25 is:" +C);
		String D=driver.findElement(By.xpath("//th[text()=' Age ']/../following-sibling::tr/td[3][text()!='25']")).getText();
		System.out.println("age not equal 25 is:" +D);
}
}
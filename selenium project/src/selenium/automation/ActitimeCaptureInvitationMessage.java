package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeCaptureInvitationMessage 
{
public static void main(String[] args) throws InterruptedException 
{
	String chromekey="webdriver.chrome.driver";
	String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
	System.setProperty(chromekey, chromevalue);
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//span[text()='Sign up']")).click();
//	driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
//	driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
//	driver.findElement(By.cssSelector("a#loginButton")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.cssSelector("div#container_users")).click();
//	driver.findElement(By.cssSelector("[class='components_button withPlusIcon']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.cssSelector("input#createUserPanel_firstNameField")).sendKeys("Agnello");
//	driver.findElement(By.cssSelector("input#createUserPanel_lastNameField")).sendKeys("Fernandes");
//	driver.findElement(By.cssSelector("input#createUserPanel_emailField")).sendKeys("agnello29117@gmail.com");
//	Thread.sleep(2000);
//	driver.findElement(By.cssSelector("div[class='components_switcher small off animated']")).click();
//	driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
//	Thread.sleep(2000);
//	String result1=driver.findElement(By.xpath("(//div[@class='invitationInfoHeader'])[1]")).getText();
//	System.out.println(result1);
//	Thread.sleep(2000);
//	String result2=driver.findElement(By.xpath("(//div[@class='invitationInfo'])[1]")).getText();
//	System.out.println(result2);
//	Thread.sleep(2000);
//	String result=result1+result2;
//	if(result.contains(result1)&&result.contains(result2))
//	{
//		System.out.println("validation pass");
//	}
//	else
//	{
//		System.out.println("validation fail");
//	}
//	
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
}
}

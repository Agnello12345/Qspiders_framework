import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {

		String chromekey="webdriver.chrome.driver";
		String chromevalue="D:\\ocsm 14 automation setup\\chromedriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a#loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("container_users")).click();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("shobha");
		Thread.sleep(2000);
		driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("rani");
		Thread.sleep(2000);
		driver.findElement(By.id("createUserPanel_emailField")).sendKeys("shobharani0596@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='components_switcher small animated on']")).click();
		Thread.sleep(2000);
		
	}

}

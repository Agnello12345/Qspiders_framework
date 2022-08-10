package org.vtiger.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProductWithCampaign 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("root");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Products")).click();
    driver.findElement(By.cssSelector("[alt='Create Product...']")).click();
    driver.findElement(By.cssSelector("[name='productname']")).sendKeys("Laptop");
    driver.findElement(By.cssSelector(".crmbutton.small.save")).click();
    String productmsg = driver.findElement(By.cssSelector(".lvtHeaderText")).getText();
    System.out.println(productmsg);
  
  if(productmsg.contains("Product Information"))
  {
	  System.out.println("product created sucessfully");
  }
  else
  {
	  System.out.println("product creation failed");
  }

	


}

package org.vtiger.testscripts;



import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.repository.BaseClass;

public class CreateInvoice extends BaseClass
{
	@Test
	public void CreateInvoiceInApp()
	{
			WebElement more=driver.findElement(By.xpath("//a[text()='More']"));
		    Actions act=new Actions(driver);
		    act.moveToElement(more).perform();
		    driver.findElement(By.xpath("//a[text()='Invoice']")).click();
		    driver.findElement(By.cssSelector("[title='Create Invoice...']")).click();
		    driver.findElement(By.cssSelector("[name='subject']")).sendKeys(data.accessExcelSheetData("InvoiceData",1,3));
		    driver.findElement(By.xpath("(//img[@alt='Select'])[3]")).click();
		    String mainid=driver.getWindowHandle();
		    Set<String> allids=driver.getWindowHandles();
		    for(String id:allids)
		    if(!mainid.equals(id))
		    {
		    	driver.switchTo().window(id);
		    }
		    driver.findElement(By.xpath("//table[@class='small' and @style]/tbody/tr[2]/td[1]/a")).click();
		    Alert alt=driver.switchTo().alert();
		    alt.accept();
		    driver.switchTo().window(mainid);
		 driver.findElement(By.xpath("//input[@id='productName1']/following-sibling::img")).click();
		 mainid=driver.getWindowHandle();
		 allids=driver.getWindowHandles();
		    for(String id:allids)
		    if(!mainid.equals(id))
		    {
		    	driver.switchTo().window(id);
		    }
		    driver.findElement(By.cssSelector("#popup_product_55")).click();
		    driver.switchTo().window(mainid);
		    driver.findElement(By.cssSelector(".detailedViewTextBoxOn")).sendKeys(data.accessExcelSheetData("InvoiceData", 2, 3));
		    
		    driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("xyz");
		    driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("xyz");
		    driver.findElement(By.cssSelector("[value='  Save  ']")).click();
		    String msg=driver.findElement(By.cssSelector(".lvtHeaderText")).getText();
		    System.out.println(msg);
		    if(msg.contains(data.accessExcelSheetData("InvoiceData", 3, 3)))
		    {
		    	System.out.println("VALIDATION PASS");
		    }
		    else
		    {
		    	System.out.println("VALIDATION FAIL");
		    }
		    
		    
		    
		    
		
	}

}

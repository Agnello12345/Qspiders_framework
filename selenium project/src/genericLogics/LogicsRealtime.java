package genericLogics;

import java.io.File;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.mysql.jdbc.Driver;

public class LogicsRealtime 
{
	//To capture screenshot OF any page...
	EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);
	File scrimg=eDriver.getScreenshotAs(OutputType.FILE);
	File dstimg=new File("./Screenshot/instagram.png");
	FileUtils.copyFile(scrimg, dstimg);

	//how to create a dynamic element to avoid duplicates
	Random random=new Random();
	int ranNum=random.nextInt(1000);
	String orgName="TESTYANTRA"+ranNum;
	
	//how to fetch data from jdbc database into java program
	
	

}

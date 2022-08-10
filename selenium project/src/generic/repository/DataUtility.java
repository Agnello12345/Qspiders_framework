package generic.repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


class DataUtility
{
	public String accessPropertyData(String Key) throws IOException
	{
		FileInputStream fis=new FileInputStream(AutomationUtils.PROPERTYPATH);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(Key);
	}
	
	public String accessExcelData(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(AutomationUtils.EXCELPATH);
		Workbook book = WorkbookFactory.create(fis);
		DataFormatter format=new DataFormatter();
		return format.formatCellValue(book.getSheet(sheetname).getRow(rownum).getCell(cellnum));
		
		
	}
}
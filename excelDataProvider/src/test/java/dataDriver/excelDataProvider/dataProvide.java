package dataDriver.excelDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
public class dataProvide {
	
DataFormatter formattter = new DataFormatter();	
@Test(dataProvider="drivenTest")
public void testCaseData (String greeting, String Commnunication, String id)
{
	System.out.println(greeting+Commnunication+id);
}

@DataProvider(name="drivenTest")
public Object[][] getData() throws IOException
{
	//Object[][] data = {{"hello","text","1"},{"bye","message","143"},{"solo","call","453"}};
	//return data;
	FileInputStream fis = new FileInputStream("C:\\Users\\Chandan Irmal\\Downloads\\excelDriven.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
	int rowCount =sheet.getPhysicalNumberOfRows();
	XSSFRow row = sheet.getRow(0);
	int colCount =row.getLastCellNum();
	Object data[][]=new Object[rowCount-1][colCount];
	for (int i=0; i<rowCount-1;i++)
	{
		row =sheet.getRow(i+1);
		for (int j=0;j<colCount;j++)
		{
			XSSFCell cell=row.getCell(j);
			data[i][j]=formattter.formatCellValue(cell);
			
		}
	}return data;
	
	}
}



import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.DataFormatter;
import java.io.FileOutputStream;

public class UploadDownload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String FruitName = "Apple";
		String Price ="345";
		String updatedValue = "599";
		String Filename = "C:\\Users\\Chandan Irmal\\Downloads\\download.xlsx";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/upload-download-test/");
		// download

		driver.findElement(By.cssSelector("#downloadButton")).click();
		updateExcel(Filename, FruitName, Price, updatedValue);
		WebElement Upload = driver.findElement(By.cssSelector("input[type='file']"));

		Upload.sendKeys("C:/Users/Chandan Irmal/Downloads/download.xlsx");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		By Upload2 = By.cssSelector("div[class='Toastify__toast-body'] div:nth-child(2)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Upload2));
		String toastText = driver.findElement(Upload2).getText();
		System.out.println(toastText);
		Assert.assertEquals("Updated Excel Data Successfully.", toastText);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(Upload2));
		String priceColumn = driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
		System.out.println(priceColumn);
		String ActualPrice = driver.findElement(By.xpath("//div[text()='" + FruitName
				+ "']/parent::div/parent::div/div[@id='cell-" + priceColumn + "-undefined']")).getText();
		Assert.assertEquals("599", ActualPrice);
		
		
		

	}
	
	public static void updateExcel(String filename,
            String fruitName,
            String Price,
            String updatedValue) throws IOException {
		String value;
		DataFormatter formater = new DataFormatter();
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colcount = row.getLastCellNum();
		int k = 0;
		int l = 0;
		for (int i = 0; i < rowCount; i++) {
			XSSFRow go = sheet.getRow(i);
			for (int j = 0; j < colcount; j++)

			{
				value = formater.formatCellValue(go.getCell(j));
				if (value.equalsIgnoreCase(fruitName)) {
					k=i;

				} else if (value.equalsIgnoreCase(Price)) {
					l=j;

				}

			}

		}
		
		Row rowField = sheet.getRow(k);
		Cell cellField = rowField.getCell(l);
		cellField.setCellValue(updatedValue);
		FileOutputStream fos = new FileOutputStream(filename);
		wb.write(fos);
		wb.close();
		fis.close();
		

	}
		
	}





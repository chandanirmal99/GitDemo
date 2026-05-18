import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Assignment10307 {

	public static void main(String[] main) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");

		js.executeScript("document.querySelector(\".table-display\").scrollTop=5000");

		int a = driver.findElements(By.xpath("//td[1][text()='Rahul Shetty']")).size() + 1;
		System.out.println(a);

		System.out.println(driver.findElements(By.xpath("//tbody/tr/th")).size());

		System.out.println(driver.findElement(By.xpath("//fieldset/table/tbody/tr[3]")).getText());
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("C:\\Users\\Chandan Irmal\\Selenium SS\\screenshot.png"));
		
		
		

	}

}

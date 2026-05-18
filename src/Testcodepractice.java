import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcodepractice {
	public static void main(String[] args) throws InterruptedException {

     	WebDriver driver = new ChromeDriver();
     	
     	//System.out.println(testData(driver));
     	
     	Testcodepractice mathu = new Testcodepractice();
     	
     	System.out.println(mathu.testData(driver));
     	
     	
//		System.setProperty("Webdriver.chrome.driver", "/C:/Users/Chandan Irmal/Downloads/chromedriver-win64/chromedriver-win64.exe");
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
//		Thread.sleep(2000);
//
//		int i = 1;
//		while (i<5)
//		{
//		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
//		i++;
//		}
//
////		driver.findElement(By.xpath("//input[@value='Done']")).click();
//		
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='hrefIncAdt']")));
//
//		ArrayList<String> names = new ArrayList<String>();
//
//		names.add("Abhijeet");
//		names.add("Don");
//		names.add("Alekhya");
//		names.add("Adam");
//		names.add("Ram");
//		
//		
//
//		for (int i = 0; i < names.size(); i++)
//
//		{
//
//			String b = names.get(i);
//
//			if (b.startsWith("A"))
//
//			{
//				
//		
//				String c = b.toUpperCase();
//				
//				
//
//				
//
//			}
//
//		}
     	
	}

	
	
	public String testData(WebDriver driver) {
		
		String abc = "Hello";
		return abc;
		
	}
	
}

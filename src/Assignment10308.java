import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment10308 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		

		Actions s = new Actions(driver);
		
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		
		s.moveToElement(driver.findElement(By.xpath("//li/div[text()='India']"))).click().build().perform();
		
//		Thread.sleep(2000);
//		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN)
//		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//		driver.findElement(By.id("autocomplete")).getDomAttribute("value");
		
		
//		WebDriver driver = new ChromeDriver();		
//		driver.manage().window().maximize();		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));		
//		String country = "ind";		
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
//		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(country);		
//		Actions act = new Actions(driver);		
//		WebElement country_name = driver.findElement(By.xpath("//li/div[text()='India']"));		
//		act.moveToElement(country_name).click().build().perform();

		}

		
	}



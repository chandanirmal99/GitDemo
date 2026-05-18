import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//{Section 6 = Chapter 46}///////////////////////////////////////////////////////////// 
		
		System.setProperty("Webdriver.chrome.driver", "/C:/Users/Chandan Irmal/Downloads/chromedriver-win64/chromedriver-win64.exe");    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
//{Section 6 = Chapter 47}///////////////////////////////////////////////////////////// 
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		// public static void main (String[] args) { }
		
	}

}

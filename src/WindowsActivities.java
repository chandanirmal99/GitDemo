import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

public static void main(String[] args){

	
//{Section 6 = Chapter 48}///////////////////////////////////////////////////////////// 	
	System.setProperty("Webdriver.chrome.driver", "/C:/Users/Chandan Irmal/Downloads/chromedriver-win64/chromedriver-win64.exe");    
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://google.com");
	driver.manage().window().maximize();
	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	driver.navigate().back();
	driver.navigate().forward();
}
}
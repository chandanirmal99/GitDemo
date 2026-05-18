import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	
public static void main (String[] args) {
	
	
	
	String text ="Rahul";
	
	//System.setProperty("Webdriver.chrome.diver", "");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("name")).sendKeys(text);
	driver.findElement(By.cssSelector("[id = 'alertbtn']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	driver.findElement(By.id("name")).sendKeys(text);
	driver.findElement(By.cssSelector("[id = 'confirmbtn']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
	
	
	
	
	
	
	
}

}

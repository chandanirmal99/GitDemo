import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chapter65Asssignment {

public static void main (String[] args) throws InterruptedException {
	
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	
	driver.findElement(By.name("name")).sendKeys("Ram");

	driver.findElement(By.name("email")).sendKeys("Ramakrishna@gmail.com");
	
	driver.findElement(By.id("exampleInputPassword1")).sendKeys("Start@password900");
	
	
	
	driver.findElement(By.id("exampleCheck1")).click();
	
	WebElement find =driver.findElement(By.id("exampleFormControlSelect1"));
	
	
	Select man = new Select(find);
	
	man.selectByIndex(0);
	System.out.println(man.getFirstSelectedOption().getText());
	
	
	
	driver.findElement(By.name("inlineRadioOptions")).click();
	
	
	
	driver.findElement(By.name("bday")).sendKeys("18011999");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	System.out.println(driver.findElement(By.className("alert.alert-success.alert-dismissible")).getText());
	

}

}

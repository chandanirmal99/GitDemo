import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//{Section 5 = Chapter 33}/////////////////////////////////////////////////////////////

public class Locator {
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	driver.findElement(By.className("signInBtn")).click();
			
		
//{Section 5 = Chapter 34}/////////////////////////////////////////////////////////////
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	
	
//{Section 5 = Chapter 35}/////////////////////////////////////////////////////////////
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	// $('p.error')in console
	
//{Section 5 = Chapter 36}/////////////////////////////////////////////////////////////
	
	driver.findElement(By.linkText("Forgot your password?")).click(); 
	
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	

		    
//{Section 5 = Chapter 37}/////////////////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Johan@gmail.com");
	driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Motu@gmail.com");
    
// Under Consol = $('input[type="text"]:nth-child(3)')  

 //{Section 5 = Chapter 38}/////////////////////////////////////////////////////////////
    
    driver.findElement(By.xpath("//form/input[3]")).sendKeys("9786767564");
    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
   System.out.println(driver.findElement(By.cssSelector("form p")).getText());
  

   
 //{Section 6 = Chapter 39}///////////////////////////////////////////////////////////// 
   
 driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
 driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 Thread.sleep(1000);
 driver.findElement(By.id("chkboxOne")).click();
 driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
System.out.println(driver.findElement(By.cssSelector(".login-container")).getText());
 
 
}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
	
public static void main (String[]args) throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	
	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.manage().window().maximize();
	
	
   // driver.findElement(By.xpath("//a[@value ='BLR']")).click();
	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value ='BLR']")).click();
	
    Thread.sleep(1000);
    
   //driver.findElement(By.xpath("(//a[@value ='MAA'])[2]")).click();
    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value ='MAA']")).click();
    
 //{Section 7 = Chapter 63}////////////////////////////////////////////////////////////////////////////
    
    
    driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
    
	
}
}



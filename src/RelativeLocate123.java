import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import org.openqa.selenium.interactions.Actions;

public class RelativeLocate123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//{Section 15 = Chapter 123,124}/////////////////////////////////////////////////////////////////////////////////////////////

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// System.out.println(driver.findElement(By.xpath("//form/div[1]/label")).getText());

		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']:nth-child(2)"));

		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

		WebElement dateofBirth = driver.findElement(By.cssSelector("[for=\"dateofBirth\"]"));

		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
		
		WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
		
		//WebElement rdb = driver.findElement(By.id("inlineRadio1"));
		
		//System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
		
		
		Actions a= new Actions(driver);
		
	a.moveToElement(iceCreamLabel).build().perform();
	
	a.moveToElement(nameEditBox).click().keyDown(Keys.SHIFT).sendKeys("ohmcena").build().perform();
	
	

	}

}

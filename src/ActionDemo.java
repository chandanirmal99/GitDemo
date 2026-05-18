import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDemo {

	public static void main(String[] args) {
		
// {Section 10 - Chapter 86,87}////////////////////////////////////////////////////////////////
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandan
		// Irmal\\OneDrive\\Desktop\\Selenium Automation with Java\\Driver and
		// Eclipse\\chromedriver-win64\\chromedriver-win64.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[contains(@class,'glow-toaster-button')]")).click();

		Actions a = new Actions(driver);

		WebElement move = driver.findElement(By.xpath("//span[contains(@id,'accountList-nav-line-1')]"));

		// a.moveToElement(driver.findElement(By.cssSelector("span[id*='accountList-nav-line-1']"))).build().perform();
		a.moveToElement(move).contextClick().build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
				.doubleClick().build().perform();

	}

}

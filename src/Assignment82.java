import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment82 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("credentials_enable_service", false);

		prefs.put("password_manager_enabled", false);

		Map<String, Object> profile = new HashMap<String, Object>();

		profile.put("password_manager_leak_detection", false);

		prefs.put("profile", profile);

		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		String user = driver.findElement(By.xpath("//div/p/b/i[text() ='rahulshettyacademy']")).getText();

		String pass = driver.findElement(By.xpath("//div/p/b[2]/i[text() ='learning']")).getText();

		driver.findElement(By.id("username")).sendKeys(user);

		driver.findElement(By.id("password")).sendKeys(pass);

		driver.findElement(By.className("checkmark")).click();

		driver.findElement(By.xpath("//div/label[2]/span[@class='checkmark']")).click();

		if (

		driver.findElement(By.id("myModal")).getDomAttribute("style").contains("padding-right"))

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		{

			driver.findElement(By.id("okayBtn")).click();
		}

		driver.findElement(By.className("form-control"));
		WebElement staticDropdown = driver.findElement(By.xpath("//div/select"));

		Select category = new Select(staticDropdown);

		category.selectByIndex(0);
		category.getFirstSelectedOption();

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-info']:nth-child(1)")));

		List<WebElement> cart = driver.findElements(By.cssSelector(".btn.btn-info"));

		for (int i = 0; i < cart.size(); i++) {

			driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();

		}

		driver.findElement(By.cssSelector(".nav-item")).click();

	}

}

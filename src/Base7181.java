import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base7181 {

// {Section 8 - Chapter 71,72,73,74,75,76,77,78,79,80,81}////////////////////////////////////////////////////////////////

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		String[] intemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Brinjal" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		addItems(driver, intemsNeeded, w);

		// w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[alt='Cart']")));
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		// driver.findElement(By.xpath("//div/div[2]/button")).click();
		// driver.findElement(By.xpath("//button[text()='PROCEED TO
		// CHECKOUT']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.xpath("//div/input/following-sibling::button[@class='promoBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Code applied ..!']")));
		System.out.println(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());

	}

	public static void addItems(WebDriver driver, String[] intemsNeeded, WebDriverWait w)

	{
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{
			String[] name = products.get(i).getText().split("-");
			// if (name.contains("Cucumber"))

			String formattedName = name[0].trim();

			List intemsNeededList = Arrays.asList(intemsNeeded);

			if (intemsNeededList.contains(formattedName))

			{
				j++;
				w.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//div[@class='product-action']/button")));
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				// break;

				if (j == intemsNeeded.length)

				{
					break;
				}
			}

		}

	}
}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

//{Section 6 = Chapter 41}/////////////////////////////////////////////////////////////

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		String name = "rahul";
		WebDriver driver = new ChromeDriver();

		String password = getPassword(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);

		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals((driver.findElement(By.tagName("p")).getText()), "You are successfully logged in.");
		Assert.assertEquals((driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText()),
				"Hello " + name + ",");

//{Section 6 = Chapter 42}/////////////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		// driver.close();

	}

	// {Section 6 = Chapter
	// 43}/////////////////////////////////////////////////////////////
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		// Please use temporary password 'rahulshettyacademy' to Login.
		String Password = passwordArray[1].split("'")[0];
		return Password;

	}
}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignmemnt62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));

		checkbox.click();
		System.out.println(checkbox.isSelected());

		checkbox.click();
		System.out.println(checkbox.isSelected());

		System.out.println(driver.findElements(By.xpath("//div/fieldset/label/input[@type='checkbox']")).size());

	}

}

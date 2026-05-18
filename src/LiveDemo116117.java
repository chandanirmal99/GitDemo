import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo116117 {

// {Section 15 - Chapter 116,117,118,119}///////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click();

		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(originalList.equals(sortedList));

		// List<Integer> price = elementList.stream().filter(s ->
		// s.getText().contains("Beans"))
		// .map(s -> getPriceVeggie(s)).collect(Collectors.toList());

		// price.forEach(s -> System.out.println(s));
		List<Integer> price;

		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());

			price.forEach(s -> System.out.println(s));

			if (price.size() < 1)

			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}

		} while (price.size() < 1);

	}

	private static int getPriceVeggie(WebElement s) {

		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		int value = Integer.parseInt(pricevalue);
		return value;

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//{Section 7 = Chapter 53/60/61}/////////////////////////////////////////////////////////////

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		System.out.println(driver.findElements(By.cssSelector("input[type ='checkbox']")).size());

//{Section 7 = Chapter 64}/////////////////////////////////////////////////////////////		

//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))

		{

			System.out.println("It's Enabled");
			Assert.assertTrue(true);

		} else {

			Assert.assertTrue(false);
		}

		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000);

		int i = 1; // Initiation

		while (i < 5) // Comparison

		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++; // Condition

		}

//		for (int i=1;i<5;i++)
//			
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
//		
//	
		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	}

}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String a = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

		driver.findElement(By.id("checkBoxOption2")).click();

		driver.findElement(By.id("dropdown-class-example")).click();

		System.out.println(driver.findElement(By.xpath("//select/option[text()='" + a + "']")).getText());

		WebElement check = driver.findElement(By.id("dropdown-class-example"));

		Select make = new Select(check);

		make.selectByVisibleText(a);
		make.getFirstSelectedOption().click();

		driver.findElement(By.id("name")).sendKeys(a);
		driver.findElement(By.id("alertbtn")).click();

		String con = driver.switchTo().alert().getText();

		driver.switchTo().alert().accept();

		System.out.println(con);

		System.out.println(con.contains(a));

		driver.switchTo().defaultContent();

	}

}

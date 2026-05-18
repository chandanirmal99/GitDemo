import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();

		String parentid = it.next();
		String chindid = it.next();

		driver.switchTo().window(chindid);

		System.out.println(driver.findElement(By.xpath("//div/h3[text()='New Window']")).getText());

		driver.switchTo().window(parentid);

		System.out.println(driver.findElement(By.xpath("//div/h3[text()='Opening a new window']")).getText());

	}

}

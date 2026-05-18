import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow126 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
// {Section 16 - CHapter 126,127,128}////////////////////////////////////////////////////////////////

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		//driver.switchTo().newWindow(WindowType.TAB);

		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> Handles = driver.getWindowHandles();

		Iterator<String> it = Handles.iterator();

		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		driver.get("https://rahulshettyacademy.com/");

		String courseName = driver.findElements(By.cssSelector("[class*='font-bold text-lg group-hover']")).get(0)
				.getText();

		driver.switchTo().window(parentWindow);

		driver.findElement(By.cssSelector("[name='name']:nth-child(2)")).sendKeys(courseName);
		
		WebElement name = driver.findElement(By.cssSelector("[name='name']:nth-child(2)"));
		
		File file = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("logo.png"));
		
		
		System.out.println(name.getRect().getDimension().getHeight());
		
		System.out.println(name.getRect().getDimension().getWidth());
		
		
		

		// driver.quit();

	}

}

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Miscellaneous107108SS {
	
//{Section 13 = Chapter 107}/////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C://Users//Chandan Irmal//OneDrive//Desktop//Selenium Automation with Java//Driver and Eclipse//chromedriver-win64//chromedriver-win64.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		driver.manage().deleteAllCookies();

		// driver.manage().deleteCookieNamed("ads");

		// driver.manage().addCookie("Cookie" );
		
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src,new File("C:\\Users\\Chandan Irmal\\Selenium SS\\screenshot.png"));

	}

}

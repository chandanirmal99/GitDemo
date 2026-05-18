import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntrroduction{

	public static void main(String[] args) {
	
		//Invoking Browser
		//Chrome - ChromeDriver -> Methods
		//Firefox - FirefoxDriver -> methods close
		//safari SarDriver ->methods close get
		// webDriver close get + Own personal methods
		
		// chromedriver.exe (Third Party Driver File) -> Chrome browser
		//step to invoke chrome driver
		//Selenium manager (Inbuilt liablary in chromedriver class)
		
		
		//Method to set global level property
		
		
        //System.setProperty("Webdriver.chrome.driver", "/C:/Users/Chandan Irmal/Downloads/chromedriver-win64/chromedriver-win64.exe");    
		//WebDriver driver = new ChromeDriver();
		
		// Section 2 - Chapter 13////////////////////////////////////////////////////////////
			//driver.get("https://rahulshettyacademy.com");
			//System.out.println(driver.getTitle());
			//System.out.println(driver.getCurrentUrl());
			//driver.close();
			//driver.quit();
		
		//Section 2- Chapter 14////////////////////////////////////////////////////
		
		
//		System.setProperty("Webdriver.gecko.driver", "C://Users//Chandan Irmal//OneDrive//Desktop//Driver and Eclipse//geckodriver-v0.36.0-win-aarch64.exe");
//		WebDriver driver = new FirefoxDriver();
//		
//		
//		driver.get("https://rahulshettyacademy.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
//		driver.quit();
		
		//Section 2 - Chapter 15//////////////////////////////////////////////////
		
		//Edge Version Version 141.0.3537.57 (Official build) (64-bit) in laptop
		
		//System.setProperty("Webdriver.edge.driver", "C://Users//Chandan Irmal//OneDrive//Desktop//Driver and Eclipse//edgedriver_win64.exe");
	     WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
     	System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}

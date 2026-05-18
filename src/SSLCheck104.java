import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck104 {

	public static void main(String[] args)

//{Section 13 = Chapter 104}/////////////////////////////////////////////////////////////////////////////////////////////

	{
		FirefoxOptions options = new FirefoxOptions();

		options.setAcceptInsecureCerts(true);

		WebDriver driver = new FirefoxDriver(options);

		driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());

	}

}

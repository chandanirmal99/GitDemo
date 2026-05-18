import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
public class Retestingothers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");



		List<WebElement> links = driver.findElements(By.cssSelector("li.gf-li a"));



		SoftAssert a = new SoftAssert();



		for (WebElement link : links) {

		    String url = link.getAttribute("href");



		    try {

		        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

		        conn.setRequestMethod("GET");  // use GET instead of HEAD

		        conn.setInstanceFollowRedirects(true);

		        conn.connect();



		        int status = conn.getResponseCode();



		        a.assertTrue(status < 400,

		            "The link " + link.getText() + " is broken with code " + status);



		    } catch (Exception e) {

		        a.fail("Exception checking link: " + url + " → " + e.getMessage());

		    }

		}



		a.assertAll();

		driver.quit();

	}

}

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

public class BrokenLinks109110 {

	public static void main(String[] args) throws URISyntaxException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		SoftAssert a = new SoftAssert();

		for (WebElement link : links)

		{
			String url = link.getDomAttribute("href");
			
			 if (url == null || url.isEmpty() || !url.startsWith("http")) {
			        System.out.println("Skipping invalid URL: " + url);
			        continue;
			    }

			HttpURLConnection conn = (HttpURLConnection)new URI(url).toURL().openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int respoCode = conn.getResponseCode();

			System.out.println(respoCode);
			
			a.assertTrue(respoCode<400, "The link " + link.getText() + " is broken with code " + respoCode);
			
			
		}

		a.assertAll();
		
	    WebElement b = driver.findElement(By.cssSelector("li[class='gf-li'] a"));
	    
	   String urb = b.getDomAttribute("href");
		
		URI uri = new URI(urb);
		
		uri.getPath();
		
		System.out.println(uri);
		
		
		
		
		
		
		
//		for (WebElement link : links)
//
//		{
//			String url = link.getDomAttribute("href");
//			
//			 if (url == null || url.isEmpty() || !url.startsWith("http")) {
//			        System.out.println("Skipping invalid URL: " + url);
//			        continue;
//			    }
//		
		
		
//		1️⃣ Purpose of this code
//
//		This code is used to validate a URL before processing it.
//		If the URL is invalid, it skips the current loop iteration.
//
//		This is typically written inside a loop (like for or while).
//
//		2️⃣ Condition breakdown (if statement)
//		🔹 url == null
//
//		Checks whether the url variable has no object assigned
//
//		Prevents NullPointerException
//
//		Example:
//
//		String url = null;
//
//		🔹 url.isEmpty()
//
//		Checks whether the string is empty ("")
//
//		Length is 0
//
//		Example:
//
//		String url = "";
//
//
//		⚠️ This method is only safe if url is not null, which is why url == null is checked first.
//
//		🔹 !url.startsWith("http")
//
//		Checks whether the URL does NOT start with "http"
//
//		Valid URLs usually start with:
//
//		http://
//
//		https://
//
//		! means NOT
//
//		Example invalid URLs:
//
//		www.google.com
//		ftp://site.com
//		abc
//
//		🔹 || (OR operator)
//
//		Means if ANY ONE condition is true
//
//		So the if block runs if:
//
//		url is null
//
//		OR empty
//
//		OR not starting with http
//
//		3️⃣ Inside the if block
//		🔹 Print message
//		System.out.println("Skipping invalid URL: " + url);
//
//
//		Displays why the URL is skipped
//
//		Helpful for debugging
//
//		🔹 continue;
//
//		Skips the rest of the loop
//
//		Moves to the next iteration
//
//		Does NOT stop the loop entirely
//
//		Example:
//
//		for (String url : urls) {
//		    if (invalid)
//		        continue; // go to next URL
//		    // process valid URL
//		}
//
//		4️⃣ Overall meaning (in simple words)
//
//		“If the URL is null, empty, or not a proper HTTP URL, print a message and skip it.”
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//HttpURLConnection conn = (HttpURLConnection)new URI(url).toURL().openConnection();
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
//
//
//				So:

//		The most common HTTP request methods are:
//			GET: Used to retrieve (read) data from a specified resource on the server. GET requests should not modify data and are cacheable.
//			POST: Used to submit data to the server, typically to create a new resource. The data is included in the body of the request.
//			PUT: Used to update a specified resource. It replaces the entire content of the resource at a specific URL. If the resource does not exist, it may create a new one.
//			DELETE: Used to remove (delete) a specified resource from the server.
//			PATCH: Used for partial updates to a resource. Unlike PUT, which requires sending the entire resource data, PATCH only sends the data fields that need modification. 
//			Other, less common HTTP methods include:
//			HEAD: Similar to GET, but the server returns only the HTTP headers and no response body. This is useful for checking metadata or if a resource exists without downloading the full content.
//			OPTIONS: Used to describe the communication options (i.e., which HTTP methods) that are supported by the server for a specific URL or resource.
//			TRACE: Used for debugging purposes, echoing the received request back to the client.
//			CONNECT: Establishes a tunnel to the server identified by the target resource, often used for SSL/TLS tunneling through a proxy. 

//		The five main types of HTTP response codes are:
//			1xx Informational responses: The server is continuing to process a received request. Examples include 100 Continue and 101 Switching Protocols.
//			2xx Successful responses: The server successfully received and processed the request. Common codes are 200 OK, 201 Created, and 204 No Content.
//			3xx Redirection messages: Additional client action is needed to complete the request, often involving a new URL. Examples include 301 Moved Permanently, 302 Found, and 304 Not Modified.
//			4xx Client error responses: The request cannot be fulfilled due to a client-side issue. Examples are 400 Bad Request, 401 Unauthorized, 403 Forbidden, 404 Not Found, and 429 Too Many Requests.
//			5xx Server error responses: The server failed to process a valid request. Common codes include 500 Internal Server Error, 502 Bad Gateway, 503 Service Unavailable, and 504 Gateway Timeout. 

	}

}

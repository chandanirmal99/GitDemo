package rahulshettyacademy06;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import java.util.HashMap;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.TestComponents.Retry;

public class SubmitOrderTest extends BaseTest {
	
	String productName = "ZARA COAT 3";

	@Test (dataProvider="getData",groups = {"Purchase"})
	
	public void submitOrder(HashMap<String,String> input) throws IOException, InterruptedException {

		
		ProductCatalogue productCatalogue = landingPage.loginApplication(input.get("email"), input.get("password"));
		List<WebElement> products = productCatalogue.getProductsList(); //(Declaring variable in this case is not mandatory, Since it return list and this method also contains webDriver Wait)
		productCatalogue.addProductToCart(input.get("product"));//(Only one method is required since it contains everything)
		CartPage cartPage = productCatalogue.goToCartPage();//(This is from abstract component class)
		Boolean match = cartPage.verifyProductDisplay(input.get("product")); // // (Since here it return boolean and variable is required in next validation)
		Assert.assertTrue(match);
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		checkoutPage.selectCountry("ind");
		ConfirmationPage confirmationpage = checkoutPage.submitOrder();
		String confirmMessage = confirmationpage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));
	
		
		// (Page-Object and Reusable classes we use for defining WebElement and Performing Action)
		// (Test we use for giving actual text values and performing validation)
		
		
	}
	
	@Test (dependsOnMethods= {"submitOrder"},retryAnalyzer=Retry.class)
	
	public void OrderHistoryTest() throws InterruptedException
	{
		ProductCatalogue productCatalogue = landingPage.loginApplication("JohnDavid95@gmail.com", "Password@95");
	OrderPage orderPage =	productCatalogue.goToOrderPage();
	Assert.assertTrue(orderPage.verifyProductDisplay(productName));
		
	}
	
	
	@DataProvider
	
	public Object[][] getData() throws IOException {
		                  
		List<HashMap<String,String>> data=getJasonDataToMap(System.getProperty("user.dir")+"//src//test//java//rahulshettyacademy//data//PurchaseOrder.json");
		return new Object[][] {{data.get(0)}, {data.get(1)}};
	}
	
//	@DataProvider
//	
//	public Object[][] getData()
//	{
//		return new Object[][] {{"Mahatma@gmail.com", "Phule@98", "ZARA COAT 3"}, {"JohnDavid95@gmail.com", "Password@95", "ADIDAS ORIGINAL"} };
//	}
	
//public Object[][] getData() {
//		
//		HashMap <String, String> map = new HashMap <String, String>();
//		map.put("email", "Mahatma@gmail.com");
//		map.put("password", "Phule@98");
//		map.put("product", "ZARA COAT 3");
//		
//		HashMap <String, String> map1 = new HashMap <String, String>();
//		map1.put("email", "JohnDavid95@gmail.com");
//		map1.put("password", "Password@95");
//		map1.put("product", "ADIDAS ORIGINAL");
////		Object[][] object = new Object[][] {{map}, {map1}};
////		return object;
////		
//		return new Object[][] {{map}, {map1}};
//	}
}



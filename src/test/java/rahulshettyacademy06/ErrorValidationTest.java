package rahulshettyacademy06;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.TestComponents.Retry;

public class ErrorValidationTest extends BaseTest {

	@Test (groups = {"ErrorHandling"})
	
	public void LoginErrorValidation() throws IOException, InterruptedException {

		String productName = "ZARA COAT 3";
		landingPage.loginApplication("JohngDavid95@gmail.com", "Password@95");
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());
		
	}
	
	@Test
	
	public void ProductErrorValidation() throws IOException, InterruptedException {

		String productName = "ZARA COAT 3";
		ProductCatalogue productCatalogue = landingPage.loginApplication("JohnDavid95@gmail.com", "Password@95");
		List<WebElement> products = productCatalogue.getProductsList(); //(Declaring variable in this case is not mandatory, Since it return list and this method also contains webDriver Wait)
		productCatalogue.addProductToCart(productName);//(Only one method is required since it contains everything)
		CartPage cartPage = productCatalogue.goToCartPage();//(This is from abstract component class)
		Boolean match = cartPage.verifyProductDisplay("ZARA COAT 33"); // // (Since here it return boolean and variable is required in next validation)
		Assert.assertFalse(match);
	}
	
	@Test
	
	public void Demo() {
		System.out.println("I am fine");
		System.out.println("I am happy");
	}

	
@Test
	
	public void go() {
		System.out.println("I am ok");
		System.out.println("I am sad");
	}


}

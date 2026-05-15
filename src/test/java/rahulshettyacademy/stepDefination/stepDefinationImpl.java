package rahulshettyacademy.stepDefination;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy06.CartPage;
import rahulshettyacademy06.CheckoutPage;
import rahulshettyacademy06.ConfirmationPage;
import rahulshettyacademy06.LandingPage;
import rahulshettyacademy06.ProductCatalogue;

public class stepDefinationImpl extends BaseTest {
	
public LandingPage landingPage;
public ProductCatalogue productCatalogue;
public ConfirmationPage confirmationpage;

	@Given("I landed on Ecommerce Page")
	
	public void I_landed_on_Ecommerce_Page() throws IOException
	{
		landingPage =launchAppication();
	}
	
	@Given("^Logged in with username (.+) and password (.+)$")
	
	
	public void Logged_in_with_username_and_password(String username,String password) {
		
		productCatalogue = landingPage.loginApplication(username,password);
		
		
	}
	
		
	
	@When("^I add product (.+) to Cart$")
	
	public void I_add_product_to_Cart(String productName) throws InterruptedException {
		
		List<WebElement> products = productCatalogue.getProductsList(); 
		productCatalogue.addProductToCart(productName);
	}
	
	@When ("^Checkout (.+) and submit the order$")
	
	public void Checkout_and_submit_the_order (String productName) throws InterruptedException
	
	{
		
		CartPage cartPage = productCatalogue.goToCartPage();//(This is from abstract component class)
		Boolean match = cartPage.verifyProductDisplay(productName); // // (Since here it return boolean and variable is required in next validation)
		Assert.assertTrue(match);
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		checkoutPage.selectCountry("ind");
		confirmationpage = checkoutPage.submitOrder();
	}
	
	@Then ("{string} message is displayed on ConfirmationPage")
	
	public void message_is_displayed_on_ConfirmationPage(String string)
	{
		String confirmMessage = confirmationpage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase(string));
		driver.close();
		
	}
	
   @Then ("{string} message is displayed")
	
	public void something_message_is_displayed (String string01){
	   
	   Assert.assertEquals(string01, landingPage.getErrorMessage());
	   driver.close();
	   
}
}
		
		
	

	



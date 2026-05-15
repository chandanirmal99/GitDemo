package rahulshettyacademy06;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".totalRow button")
	WebElement checkOutEle;

	@FindBy(css = ".cartSection h3")
	List<WebElement> cartProducts;
	
	
	public Boolean verifyProductDisplay (String productName)//(Since it returns boolean class hence return type is boolean)
	{
		Boolean match = cartProducts.stream()
				.anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
		return match;
	}
	
	public CheckoutPage goToCheckout() throws InterruptedException {
		
		checkOutEle.click();
		Thread.sleep(2000);
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		return checkoutPage; 
	}

}

package rahulshettyacademy.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import rahulshettyacademy06.CartPage;
import rahulshettyacademy06.OrderPage;

public class AbstractComponent {
	
	
	
	WebDriver driver;
	
	public AbstractComponent(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (css ="li i[class*='fa-shopping-cart']")
	 WebElement cartHeader;
	
	@FindBy (css ="[routerlink*='myorders']")
	WebElement orderHeader;
	
	public void waitForElemetToAppear(By findBy) {
		
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitForWebElementToAppear(WebElement findBy) {
		
		WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait3.until(ExpectedConditions.visibilityOf(findBy));
	}
	
	public CartPage goToCartPage() throws InterruptedException
	{
		
		
		cartHeader.click();
		CartPage cartPage = new CartPage(driver);
	 return cartPage;
	}
	
	public OrderPage goToOrderPage() throws InterruptedException
	{
		
		
		orderHeader.click();
		OrderPage orderPage = new OrderPage(driver);
	 return orderPage;
	}
	
public void waitForElemetToDisappear(WebElement ele) throws InterruptedException {
		
		
	Thread.sleep(2000);	Thread.sleep(2000);
	}


	

}

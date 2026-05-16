package rahulshettyacademy06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class ProductCatalogue extends AbstractComponent {
	

		WebDriver driver;

		public ProductCatalogue(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
            super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(css=".mb-3")
		List <WebElement> products;
		
		By productsBy =By.cssSelector(".mb-3");
		By addToCart = By.cssSelector(".card-body button:last-of-type");
		By toastMessage = By.cssSelector("#toast-container");
		
		
		public List<WebElement> getProductsList() { //(Since it return list hence List<WebElement>)
			
			waitForElemetToAppear(productsBy);
			return products; //(Here we are not performing any action hence only return)
		}
		
		public WebElement getProductByName(String productName)//(String Value will be given in test)
		
		{
			WebElement prod = getProductsList().stream() //(Since it is a list and return single WebElement)
					.filter(i -> i.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
			return prod;
		}
		
		public void addProductToCart (String ProductName) throws InterruptedException
		
		{
			WebElement prod = getProductByName(ProductName);// (Again we need to define it over here)
			prod.findElement(addToCart).click(); // (Since it is at WebElement level and not at driver level)
			waitForElemetToAppear(toastMessage);
			Thread.sleep(2000);
			
		}

	}



package rahulshettyacademy06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
	

		WebDriver driver;

		public LandingPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
            super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		

		
		@FindBy(id = "userEmail")
		WebElement userEmail;

		@FindBy(id = "userPassword")
		WebElement passwordEl;

		@FindBy(id = "login")
		WebElement submit;
		
		@FindBy (css="[class*=trigger]")
		WebElement errorMessage;
		
		public ProductCatalogue loginApplication(String email, String password) //(Since return is ProductCatalogue class, it is returning object name)
		{
			userEmail.sendKeys(email);
			passwordEl.sendKeys(password);
			submit.click();
			ProductCatalogue productCatalogue = new ProductCatalogue(driver);
			return productCatalogue;
		}
		
		public String getErrorMessage() {
			
			waitForWebElementToAppear(errorMessage);
			return errorMessage.getText();
		}
		
		public void goTo() {
			
			driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		}

	}



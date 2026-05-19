package Test;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@AfterTest
	public void Donpe() {
		System.out.println("Donpe");

	}

	@BeforeClass
	public void beforeclas()

	{
		System.out.println("Before executing any method in any class");
	}
     @Parameters({"URL","APIKey/usrname"})
	@Test
	public void login( @Optional String url,@Optional String key) {

		// Selenium

		System.out.println("WebloginHome");
        System.out.println(url);
        System.out.println(key);
	}

	@Test(groups={"Smoke"})

	public void Mobilelogincarloan() {
		System.out.println("Mobilelogincar");
	}

	@AfterClass
	public void afterclas()

	{
		System.out.println("After executing all the methods in the class");
	}

	@BeforeSuite

	public void BgSuite() {

		System.out.println("I am no 1");
	}

	@BeforeMethod

	public void beforeevery() {

		System.out.println("I will execute before every test method in day 3 class");
	}

	public void mobileLogincarLoan()

	{

		// Appium
		System.out.println("MobileLoginHome");
	}

	@Test(dataProvider="getData")
	public void mobileForincarLoan(String username, String password)

	{

		// Appium
		System.out.println("MobileLoginHome");
		System.out.println(username);
		System.out.println(password);
	}

	@AfterMethod

	public void Afterevery() {

		System.out.println("I will execute after every test method in day 3 class");
	}

	@AfterSuite

	public void afSuite() {

		System.out.println("I am the no 1 from last");
	}

	@Test

	public void mobileAmritgocarLoan()

	{

		// Appium
		System.out.println("MobileLoginHome");
		Assert.assertTrue(false);
	}

	@Test

	public void LoginAPIcarLoan()

	{
		// Rest API Automation

		System.out.println("APILoginHome");

	}
	
	@DataProvider
	public Object[][] getData()
	
	{
		//1st combination - username password - Good Credit History
		//2nd combination - username password - No credit History
		//3rd combination - username pasword - Fraudelant credit history
		
		Object[][] data = new Object[3][2];
		
		
		data[0][0]= "firstsetusername";
		data[0][1]="firstpassword";
		
		data[1][0]="secondsetusername";
		data[1][1]="Secondpassword";
		
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		
		return data;
	}

}

package Test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@Test(enabled=false)

	public void login(){

		// Selenium

		System.out.println("WebloginHome");

	}

	@Test(timeOut=4000)

	public void mobileLogincarLoan()

	{

		// Appium
		System.out.println("MobileLoginHome");
	}

	@Test(groups = { "Smoke" })

	public void MobileLoginHomeLoan() {

		System.out.println("MobileLoginHomeLoan");
	}

	@Test(dependsOnMethods = { "mobileLogincarLoan"})

	public void LoginAPIcarLoan()

	{
		// Rest API Automation

		System.out.println("APILoginHome");

	}
	
	@Parameters({"URL"})
	@Test
	public void LoginAPIparLoan(@Optional String urll)

	{
		// Rest API Automation

		System.out.println("APILoginHome02");
		System.out.println(urll);

	}
}

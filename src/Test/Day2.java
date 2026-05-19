package Test;

import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {

	@Test(dataProvider="getData")
	public void ploan(String username, String password)

	{
		System.out.println("good");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(groups = { "Smoke" })
	public void pload() {
		System.out.println("good");
	}

	@BeforeTest
	public void Prerequisite()

	{
		System.out.println("I will execute first");
		
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

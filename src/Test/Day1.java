package Test;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void cccGoes()

	{

		System.out.println("Pav");
		Assert.assertTrue(false);
	}
	@Test
	public void DemoComes()

	{

		System.out.println("Hello");
	}
	@Test
	public void DemoHigh5()

	{

		System.out.println("Hello");
	}
	@Test
	public void SecondTest() {
		
		System.out.println("Bye");
	}
	@Test
	public void SecondTest1() {
		
		System.out.println("Bye");
	}
	@Test
	public void SecondTest2() {
		
		System.out.println("Bye");
	}
   @AfterTest
   public void lastexecute ()
   {
	   System.out.println("I will execute last");
   }

}

package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class introTest2 {

	@Test
	public void PersonalLoan_3() {
		System.out.println("PL-3");
	}
	
	@BeforeTest
	public void executeFirst() {
		System.out.println("This test will run 1st before any case");
	}
	@AfterTest
	public void executeLast() {
		System.out.println("This test will run after all case in the folder");
	}
	@Test(groups= {"smoke"})
	public void group2() {
		System.out.println("G-22");
	}
}

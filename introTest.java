package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class introTest {

	@AfterSuite
	public void afterSuite() {
		System.out.println("Last case in the suite");

	}
	
	@Test
	public void PersonalLoan_1() {
		System.out.println("PL-1");
	}
	@Test
	public void PersonalLoan_2() {
		System.out.println("PL-2");
	}
	@Test
	public void PersonalLoan_4() {
		System.out.println("PL-4");
	}
	
	@Test(groups= {"smoke"})
	public void group1() {
		System.out.println("G-1");
	}
}

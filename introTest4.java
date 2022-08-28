package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class introTest4 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("It will excute before any case in this class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("It will excute after executing all case in this class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("It will excute before excuting each method in introTest4 class");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("It will excute After excuting each method in introTest4 class");
	}
	
	
	@Test
	public void WebOfficeLoan() {
		System.out.println("WOL");
	}
	@Test
	public void MobileOfficeLoan() {
		System.out.println("MOL");
	}
	@Test
	public void APIOfficeLoan() {
		System.out.println("APIOL");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("First case in the suite");
	}
	@Test(groups= {"smoke"})
	public void group4() {
		System.out.println("G-4");
	}
}

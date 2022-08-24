package test;

import org.testng.annotations.Test;

public class introTest3 {

	
	@Test
	public void WebHomeLoan() {
		System.out.println("WHL");
	}
	@Test
	public void MobileHomeLoan() {
		System.out.println("MHL");
	}
	@Test
	public void APIHomeLoan() {
		System.out.println("APIHL");
	}
	@Test(groups= {"smoke"})
	public void group3() {
		System.out.println("G-3");
	}
}

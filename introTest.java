package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class introTest {

	@AfterSuite
	public void afterSuite() {
		System.out.println("Last case in the suite");

	}
	
	@Parameters ({"URL2", "APIKEY"})
	@Test
	public void PersonalLoan_1(String uname2, String apikey) {
		System.out.println("PL-1");
		System.out.println(uname2);
		System.out.println(apikey);
		Assert.assertTrue(false);

	}
	@Test
	public void PersonalLoan_2() {
		System.out.println("PL-2");
	}
	@Test(dataProvider = "getData")
	public void PersonalLoan_4(String u, String p) {
		System.out.println("PL-4"); 
		System.out.println(u);
		System.out.println(p);
		

	}
	
	@Test(groups= {"smoke"})
	public void group1() {
		System.out.println("G-1");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "username1";
		data[0][1] = "password2";
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		return data;
		
	}
}

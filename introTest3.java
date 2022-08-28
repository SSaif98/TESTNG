package test;

import org.testng.annotations.Parameters;
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
	@Test(dependsOnMethods = {"WebOfficeLoan_3"})
	public void WebOfficeLoan_2() {
		System.out.println("WOL_2");
	}
	@Parameters("URL")
	@Test(timeOut=4000)
	public void WebOfficeLoan_3(String urlName) {
		System.out.println("WOL_3");
		System.out.println(urlName);
	}
	@Test(enabled=false)
	public void WebOfficeLoan_4() {
		System.out.println("WOL_4");
	}
}

/*DependsOnMethods:
@Test(dependsOnMethods = {"WebOfficeLoan_3","WebOfficeLoan_4"})
public void WebOfficeLoan_2(){
}
if we write like this then before running "WebOfficeLoan_2" following methods should be executed "WebOfficeLoan_3" & "WebOfficeLoan_4"
*/
/*
timeout = 4000:
Suppose you know this case will take too much time so that other cases will fail so we can give timeout time to tell the case wait before throughing error
*/

package parameterizationTest;

import org.testng.annotations.Test;

public class MultipleData {
	
	@Test(dataProviderClass=TestMultipleDataProviders.class, dataProvider="dp1")
	public void doLogin(String username, String password) {
		System.out.println(username+"---"+password);
	}
	
	@Test(dataProviderClass=TestMultipleDataProviders.class, dataProvider="dp2")
	public void users(String username, String password, String email) {
		System.out.println(username+"---"+password+"---"+email);
	}

}

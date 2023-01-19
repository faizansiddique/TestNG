package parameterizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test(dataProvider="getData")
	public void doLogin(String username, String password) {
		System.out.println(username+"---"+password);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "XYZ";
		data[0][1] = "abc";
		
		data[1][0] = "UVW";
		data[1][1] = "fgh";
		
		data[2][0] = "Ramboo";
		data[2][1] = "123456";
		
		return data;
	}

}

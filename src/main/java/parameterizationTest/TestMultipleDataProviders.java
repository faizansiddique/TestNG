package parameterizationTest;

import org.testng.annotations.DataProvider;

public class TestMultipleDataProviders {

	@DataProvider(name = "dp1")
	public static Object[][] getData() {

		//public static Object[][] getData(Method m) {
		//Object[][] data = null;
		//if(m.getName().equals("")){
		Object[][] data = new Object[2][2];

		data[0][0] = "Ramish";
		data[0][1] = "Qwerty@123";

		data[1][0] = "Umair";
		data[1][1] = "India@123";

		return data;
	}

	@DataProvider(name = "dp2")
	public static Object[][] getData2() {

		Object[][] data = new Object[2][3];

		data[0][0] = "Ramish";
		data[0][1] = "Qwerty@123";
		data[0][2] = "ramish@gmail.com";

		data[1][0] = "Umair";
		data[1][1] = "India@123";
		data[1][2] = "umair@yahoomail";

		return data;
	}

}

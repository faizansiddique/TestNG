package parameterizationTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterizationByXML {
	
	@Parameters({"browser"})
	@Test
	public void getBrowser(String browser) {
		System.out.println(browser);
		
	}

}

package softAssertAndMultipleReportingFailure;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase1 {
	
	@Test
	public void validateTitle() {
		
		SoftAssert softAssert = new SoftAssert();
		
		String expected_title = "gmail.com";
		String actual_title = "yahoomail.com";
		
		/*
		 * if(expected_title.equals(actual_title)) { System.out.println("Passed"); }else
		 * { System.out.println("Failed"); }
		 */
		System.out.println("Validating Title");
		softAssert.assertEquals(expected_title, actual_title);  //False
		
		System.out.println("Validating Image");
		softAssert.assertTrue(true, "Element not found");
		
		System.out.println("Validating Text box");
		softAssert.assertEquals(false, true,  "text box not found");
		
		softAssert.assertAll();
		
		
	}

}

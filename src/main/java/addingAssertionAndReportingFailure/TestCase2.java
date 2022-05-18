package addingAssertionAndReportingFailure;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test
	public void validateTitle() {
		
		String expected_title = "gmail.com";
		String actual_title = "yahoomail.com";
		
		/*
		 * if(expected_title.equals(actual_title)) { System.out.println("Passed"); }else
		 * { System.out.println("Failed"); }
		 */
		//Assert.assertTrue(false, "Element not founds");
		Assert.assertEquals(expected_title, actual_title);	
	}

}

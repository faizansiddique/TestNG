package forcefullySkipTestCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public void isSkipped() {
		throw new SkipException("Condition not mets");
	}

}

package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	
	@BeforeSuite
	public void init() {
		System.out.println("Before Initialization !!!");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("Quitting everything !!!");
	}

}

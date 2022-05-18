package regressionTest;

import org.testng.annotations.Test;

public class TestCase2 {

	@Test(priority = 2)
	public void test2() {
		System.out.println("Test 2");
	}

	@Test(priority = 1)
	public void test1() {
		System.out.println("Test 1");
	}

}

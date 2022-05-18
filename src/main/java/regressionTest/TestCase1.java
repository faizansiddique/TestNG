package regressionTest;

import org.testng.annotations.Test;

public class TestCase1 {

	@Test(priority = 2)
	public void test2() {
		System.out.println("Test 2");
	}

	@Test(priority = 1)
	public void test1() {
		System.out.println("Test 1");
	}

	@Test(priority = 3)
	public void test3() {
		System.out.println("Test 3");
	}

}

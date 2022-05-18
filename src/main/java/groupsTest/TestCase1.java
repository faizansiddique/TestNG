package groupsTest;

import org.testng.annotations.Test;

public class TestCase1 {

	@Test(priority = 1, groups = "functional")
	public void test1() {
		System.out.println("Test 1");
	}

	@Test(priority = 2, groups = "smoke")
	public void test2() {
		System.out.println("Test 2");
	}

	@Test(priority = 3, groups = { "functional", "regression" })
	public void test3() {
		System.out.println("Test 3");
	}

	@Test(priority = 4, groups = "smoke")
	public void test4() {
		System.out.println("Test 4");
	}

	@Test(priority = 5, groups = "functional")
	public void test5() {
		System.out.println("Test 5");
	}

	@Test(priority = 6, groups = { "regression", "smoke" })
	public void test6() {
		System.out.println("Test 6");
	}

	@Test(priority = 7, groups = "regression")
	public void test7() {
		System.out.println("Test 7");
	}

	@Test(priority = 8, groups = {"smoke", "regression"})
	public void test8() {
		System.out.println("Test 8");
	}

}

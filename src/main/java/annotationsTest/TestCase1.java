package annotationsTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestCase1 extends BaseTest {

	@BeforeTest
	public void createDB() {
		System.out.println("Create DB connection");
	}

	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}

	@Test(priority = 2)
	public void doLogin() {
		System.out.println("Login Page");
	}

	@Test(priority = 1)
	public void doRegister() {
		System.out.println("Registration Page");
	}

	@Test(priority = 3)
	public void doHomePage() {
		System.out.println("Home Page");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("close Browser");
	}

	@AfterTest
	public void deleteDB() {
		System.out.println("delete DB connection");
	}

}

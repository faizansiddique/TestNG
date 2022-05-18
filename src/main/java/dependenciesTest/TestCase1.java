package dependenciesTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test(priority = 1)
	public void doRegister() {
		System.out.println("Registration Page");
		Assert.fail("Element not found");
	}

	@Test(priority = 2, dependsOnMethods = "doRegister")
	public void doLogin() {
		System.out.println("Login Page");
	}

	@Test(priority = 3, dependsOnMethods = "doRegister", alwaysRun = true)
	public void homePage() {
		System.out.println("Home Page");
	}

	@Test(priority = 4)
	public void productCatalogPage() {
		System.out.println("Product Catalog Page");
	}

}

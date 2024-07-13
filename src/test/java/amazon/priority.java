package amazon;

import org.testng.annotations.Test;

public class priority {
    @Test (priority=-2)
	public void signup() {
		System.out.println("signup");

	}
    @Test(priority=-2)
	public void login() {
		System.out.println("login");

	}
    @Test(priority=5)
	public void searchProduct() {
		System.out.println("searchProduct");

	}
    @Test(priority=1)
	public void addToCart() {
		System.out.println("addToCart()");

	}
    @Test
	public void logout() {
		System.out.println("logout");

	}
}

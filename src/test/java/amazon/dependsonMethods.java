package amazon;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class dependsonMethods {
	/*
    @Test ()
	public void signup() {
		System.out.println("signup");

	}
    @Test(dependsOnMethods="signup")
	public void login() {
		System.out.println("login");

	} 
	
    @Test(enabled =false  ,alwaysRun=true)
	public void searchProduct() {
		System.out.println("searchProduct");

	} */
    
    
    @Test()
	public void addToCart() throws Exception {
		System.out.println("addToCart()");
      //  throw new NoSuchElementException("element not there");
	} 
	
    
    
    @Test( dependsOnMethods="addToCart" , alwaysRun=true)
	public void logout() 
    {
		System.out.println("logout"); 
		}

	}


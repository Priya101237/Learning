package amazon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class phone {

	public static void main(String[] args) throws InterruptedException {
		
		 
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
		/*
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    searchbox.sendKeys("lipstick");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    driver.findElement(By.xpath("//div[@class='rush-component s-featured-result-item s-expand-height']//span[@class='a-size-base-plus a-color-base a-text-normal'][contains(text(),'Mamaearth Creamy Matte Long Stay Lipstick with Mur')]")).click();
	    
	    driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]")).click(); */
	    
	  
	     WebElement textbox=driver.findElement(By.id("twotabsearchtextbox"));
	     textbox.sendKeys("iphonex");
	     textbox.submit();
	   //  driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Midnight/dp/B09G9HD6PD/ref=sr_1_2?dib=eyJ2IjoiMSJ9.OCoJgZ8ghdguKvc7Ozmt3CSuJaVlkM6d5ORz7uy3WAC_Nm36H5jjTNpp2IcaM2uR8Q_3sp3Fi5-wmJgva4iKdEg7PhngjapuVEitDn7beRa8FbnUanHnJLp6zDZTVz_p3ZPysRZXZISK0z8XSPmWmJwpcVvC8uI4ZcYJxfu9Y3ypAtCgI4JfAssIjNIqw0DGgz-07JVEoqyOwKAZGVOGJWopiPqy3jhrEVSnItOyc9w.I5D_ZNtmUFSYeznR06P0tdkuknSmHLE7ihFc3ndw3ms&dib_tag=se&keywords=iphone+x&qid=1718514537&sr=8-2");
	    // Thread.sleep(30); /*
	     driver.findElement(By.partialLinkText("iPhone 13 (128GB) - Midnight")).click();
	/*   Set<String> handles=  driver.getWindowHandles();
	   Iterator wins =handles.iterator();
	   String parentid=(String) wins.next();
	   String childid=(String) wins.next();
	   
	   driver.switchTo().window(childid); 
	   
	   
	   Set<String> s=driver.getWindowHandles();
		 ArrayList ar=new ArrayList(s);
		 System.out.println(ar.get(0));
		 System.out.println(ar.get(1));
		 driver.switchTo().window((String) ar.get(1));*/
		
		 WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement element1 = webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("x//input[@id='add-to-cart-button']")));
		 element1.click();
		//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	  
	     
	     
	   //  driver.findElement(By.xpath("//input[@id='add-to-cart-button']//following::span[1]")).click();
	   /*
	     Actions act =new Actions(driver);
	   WebElement add=   driver.findElement(By.xpath(""));
	  act.moveToElement(add).click().build().perform(); 
	  
	  WebElement element = driver.findElement(By.xpath("//input[id='add-to-cart-button']"));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);  */
	  
	//  WebElement element = driver.findElement(By.xpath("xpath_Of_Element"));    
	//  js.executeScript("arguments[0].click();",element);
	      
	    
	     

	}

}

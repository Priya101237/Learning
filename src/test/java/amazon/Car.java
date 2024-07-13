package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Car {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Car & Motorbike - Car Accessories");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Car & Motorbike']")).click();
	    driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("KOZDIKO Mini Magnetic Car Dashboard Mount Mobile Phone Holder with Metal Body Universal for Cars");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.partialLinkText(" Phone Holder with Metal Body Universal for Cars")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		//WebElement addtocart=	driver.findElement(By.xpath("//input[id=\"add-to-cart-button\"]"));
	     //addtocart.click();

	
		//driver.findElement(By.xpath("//span[text()='KOZDIKO Mini Magnetic Car Dashboard Mount Mobile Phone Holder with Metal Body Universal for Cars']")).click();
	    // Actions act = new Actions(driver);
	   // driver.findElement(By.xpath("//*[text()='Add to Cart']"));
	 //  act.moveToElement(addcart).click().perform(); 
	   
	    
		

	}

}

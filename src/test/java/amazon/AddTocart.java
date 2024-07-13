package amazon;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTocart {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cadbury dairy milk");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.partialLinkText("Cadbury Dairy Milk Silk Oreo Chocolate Bar, 60 g…")).click();
		Thread.sleep(30);
		driver.findElement(By.xpath("//*[@id=\"mbb-offeringID-1\"]")).click();
		
		
		 Set<String> s=driver.getWindowHandles();
		 ArrayList ar=new ArrayList(s);
		 System.out.println(ar.get(0));
		 System.out.println(ar.get(1));
		 driver.switchTo().window((String) ar.get(1));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		
		
		//input[@id="username] - xpath
		//input[text()='value'] - text
		//input[contains(text(), value)]
		
		
	}

}

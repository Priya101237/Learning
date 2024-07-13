package Flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class addcartfunctionality {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//Thread.sleep(30);
		
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		driver.findElement(By.xpath("//span[text()='Shop now']")).click();
		driver.findElement(By.xpath("//div[text()='Grocery']")).click();
		WebElement staples=driver.findElement(By.xpath("Staples"));
		Actions act =new Actions(driver);
		act.moveToElement(staples).perform();
		
		
		WebElement quantity =driver.findElement(By.xpath("//input[@class='p6sArZ']"));
		quantity.clear();
		quantity.sendKeys("4");
		

	}

}

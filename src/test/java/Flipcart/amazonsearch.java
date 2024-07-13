package Flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonsearch {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	     WebElement textbox=driver.findElement(By.id("twotabsearchtextbox"));
	     textbox.sendKeys("iphonex");
	     textbox.submit();
	     driver.findElement(By.partialLinkText("iPhone 13 (128GB) - Midnight")).click();
	     Thread.sleep(30);
	     
		
		

	}

}

package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java {

	public static void main(String[] args) {
		
		
		  ChromeDriver driver= new ChromeDriver();
		 driver.get(" https://www.google.com/");
	     driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement d=	 driver.findElement(By.xpath("//textarea[@name='q']"));
		 d.click();
		 JavascriptExecutor js=driver;
		// js.executeScript("arguments[0].click();" , d);
		 js.executeScript("arguments[0].setAttribute ('value','sachin')",d);	 	
	
	}

}
package Flipcart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alert {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	      Alert alert=driver.switchTo().alert();
	      String text=alert.getText();
	      System.out.println(text);
	      alert.accept();
	     
	      
	      
	    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	    Alert alt2= driver.switchTo().alert();
	     String text2=alt2.getText();
	     System.out.println(text2);
	     alt2.dismiss();
	     
	     driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	      Alert alt3= driver.switchTo().alert();
	      alt3.sendKeys("priya");
	      alt3.accept();
	      
	     
	     
	     
	    
		

	}

}

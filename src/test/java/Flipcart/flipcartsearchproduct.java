package Flipcart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartsearchproduct {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//search 
		 WebElement search =driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		 search .sendKeys("phone");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		// driver.findElement(By.xpath("//div[contains(text() ,'Galactic Black, 256')]")).click();
		List<WebElement> searchphone= driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div/div/div/div/a/div[2]/div[1]"));
		System.out.println(searchphone.size());
		
	   List<WebElement> mobilecount=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div/div/div/div/a/div[1]/div[1]/div/div"));
	   System.out.println(mobilecount.size());
	   
	   for(int i=0;i<mobilecount.size();i++)
	   {
		   System.out.println(mobilecount.get(i).getText());
	   }
           
	}

}

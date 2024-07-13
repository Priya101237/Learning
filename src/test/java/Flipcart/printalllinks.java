package Flipcart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printalllinks {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/webhp?authuser=1");
		driver.manage().window().maximize();
		
		 List<WebElement> listalltag =driver.findElements(By.tagName("a"));
		 System.out.println(listalltag.size());
		 
		 for(int i=0;i<listalltag.size();i++)
		 {
			System.out.println(listalltag.get(i).getText()); 
		 }

	}

}

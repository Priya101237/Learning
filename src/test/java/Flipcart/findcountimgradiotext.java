package Flipcart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findcountimgradiotext {

	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
	   List<WebElement> radiocount=	driver.findElements(By.xpath("//input[@type='radio']"));
	   System.out.println(radiocount.size());
	   
	   List<WebElement> img=	driver.findElements(By.xpath("//img"));
	   System.out.println(img.size());
	   
	   
	   
	 
		

	}

}

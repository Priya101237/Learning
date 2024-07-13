package mousehandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class slidedragdrop {

	public static void main(String[] args) throws InterruptedException  {

		 ChromeDriver driver=new ChromeDriver();

		    driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

		    driver.manage().window().maximize();

		    Actions act=new Actions (driver);

		//    horizontal dropdown =only changes x value , y value is constant

	         WebElement minslider=  driver.findElement(By.xpath("//span[1]"));
	         System.out.println("current location of minslider :"+minslider.getLocation());//59,250
	         act.dragAndDropBy(minslider, 49, 250).perform();
	         System.out.println("location of minslider after moving: " +minslider.getLocation());


	         WebElement maxslider=  driver.findElement(By.xpath("//span[2]"));
	         System.out.println("curent location of max slider :" +maxslider.getLocation()); //544 ,250
	         act.dragAndDropBy(maxslider, -104, 250).perform();
	        System.out.println("location of maxslider after moving :" +maxslider.getLocation());








	}
}
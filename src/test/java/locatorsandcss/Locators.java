package locatorsandcss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();

		/*
		//Search Box

	     driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");

	     //Search Button

	     driver.findElement(By.name("submit_search")).click();

	     //Link Text and partial link Text

	   // driver.findElement(By.linkText("Printed Chiffon Dress")).click();
	   driver.findElement(By.partialLinkText("Printed Chiffon")).click();
	   */

	   /*
	    findelelement()
	    findelements ()-multiple- classname
	    lengh- array->a.lenth
	    length()-String =s.length()
	    size()- list,set,haspmap

	    */
	   //numbers of sliders
	List<WebElement>  sliders = driver.findElements(By.className("homeslider-description"));
	System.out.println("Numbers of sliders:"+sliders.size());

	//number of images
    List<WebElement>images =driver.findElements(By.tagName("img"));
    System.out.println("Numbers of images:"+images.size());

    //Total Numbers of links
    List<WebElement> Links=  driver.findElements(By.tagName("a"));
    System.out.println("Total Number of links :"+Links.size());

	}
}

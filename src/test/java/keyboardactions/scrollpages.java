package keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollpages {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =new ChromeDriver();
	  // driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	   driver.get("https://www.worldometers.info/geography/how-many-countries-are-there-in-the-world/");

	    driver.manage().window().maximize();

	   JavascriptExecutor js=driver;

	   //scroll down page by by pixel

	  js.executeScript("window.scrollBy(0,3000)", " ");
	  System.out.println(js.executeScript("return window.pageYOoffset; "));


	   //scroll downthe page till the element is present

	WebElement tongacountry=   driver.findElement(By.xpath("//a[normalize-space()='Tonga']"));
	js.executeScript("arguments[0].scrollIntoView();", tongacountry);
	System.out.println(js.executeScript("return window.pageYOoffset;"));

	   //scroll down till end of the page/document

	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	 System.out.println(js.executeScript("return window.pageYOoffset;"));

	 Thread.sleep(3000);

	 //go back to initial position

	 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");





}
}

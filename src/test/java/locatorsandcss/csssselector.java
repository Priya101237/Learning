





















































package locatorsandcss;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class csssselector {

	public static void main(String[] args) {

		/*
		 tag &id=#
		 tag&class -.
		 tag &attribute[]
		 tag&class attribute .[]
		 *
		 *
		 */
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();


		//Tag&Id   #
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
	    //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");


		//Tag&Class  .
	//	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
	//	driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");


		//Tag&Attribute      []
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("MacBook");



		//Tag class Attribute .[]

	//	driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MacBook");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("MacBook");



	}

}

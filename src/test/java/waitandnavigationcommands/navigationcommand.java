package waitandnavigationcommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigationcommand {

	public static void main(String[] args) throws InterruptedException {

     ChromeDriver driver=new ChromeDriver();



		//driver.get("https://www.amazon.in/");

		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());

		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());//amazon

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());//flipcart

		driver.navigate().refresh();






	}

}

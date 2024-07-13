package XpathCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {

		/*
		 * XPath - Address of an element
		 * 2 Types- Absolute Xpath-Full Xpath
		 * /html/body/header/div/div/div[1]/div/a/img
		 * Relative Xpath - Partial Xpath
		 * //*[@id="logo"]/a/img
		 *
		 */

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

	String productname= driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
	System.out.println(productname);


	}

}

package keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class interactelementwithjs {

	public static void main(String[] args) {

	//	WebDriver driver =new ChromeDriver();

		ChromeDriver driver =new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");

	    driver.manage().window().maximize();

	   JavascriptExecutor js=driver;  //use this method for chromedriver

	//   JavascriptExecutor js=(JavascriptExecutor)driver;    //use this method for webdriver

	   //text box
	 WebElement namebox=  driver.findElement(By.id("name"));
	 js.executeScript("arguments[0].setAttribute('value','priya')", namebox);

	 //radio button

	 WebElement maleradiobuon=  driver.findElement(By.id("male"));
	 js.executeScript("arguments[0].click();", maleradiobuon);

	 //checkbox

	 WebElement sundaycheckbox=  driver.findElement(By.id("sunday"));
	 js.executeScript("arguments[0].click();", sundaycheckbox);


	//submit button

	 driver.switchTo().frame(0);

	 WebElement submitbutton=  driver.findElement(By.id("FSsubmit"));
	 js.executeScript("arguments[0].click();", submitbutton);

}
}

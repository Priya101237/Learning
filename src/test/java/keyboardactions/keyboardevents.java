package keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardevents {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
	    driver.get("https://text-compare.com/");
	    driver.manage().window().maximize();

	    Actions act = new Actions(driver);

	   driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to learn Automation");

	   //clt+a

	   act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

	   //clt+c

	   act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

	   //tab
	   act.keyDown(Keys.TAB).keyUp(Keys.TAB);
	 //  act.sendKeys(Keys.TAB).perform(); //only if want to press single then prefer this method

	   //clt+v

	   act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
}
}

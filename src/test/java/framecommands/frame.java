package framecommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();

	//	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");

			driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().window().maximize();

		/*

		driver.findElement(By.id("name")).sendKeys("Hello");
		driver.switchTo().frame(driver.findElement(By.id("frm1"))); //frame1
	    Select slct=new Select( driver.findElement(By.id("course")));
	    Thread.sleep(3000);
	    slct.selectByVisibleText("Java");
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("Helloworld");

	    */
		 driver.findElement(By.id("name")).sendKeys("Hello");
	    driver.switchTo().frame(driver.findElement(By.id("frm3")));
	    driver.switchTo().frame(driver.findElement(By.id("frm1")));
	    Select slcts=new Select( driver.findElement(By.id("course")));
	    Thread.sleep(3000);
	    slcts.selectByVisibleText("Java");
	    driver.switchTo().parentFrame();
	    driver.findElement(By.id("name")).sendKeys("frame3");
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("MainWebPage");




	}

}

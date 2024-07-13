package framecommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class framepractice {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");

	    driver.manage().window().maximize();

	    //frame1

	     driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_1.html']")));

	    driver.findElement(By.name("mytext1")).sendKeys("766");

	    driver.switchTo().defaultContent();

	    //frame2

	  driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_2.html']")));
	  driver.findElement(By.name("mytext2")).sendKeys("536");
	  driver.switchTo().defaultContent();

	  //frame4

	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_4.html']")));
	driver.findElement(By.name("mytext4")).sendKeys("222");
	driver.switchTo().defaultContent();

	  //frame3

	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
	driver.findElement(By.name("mytext3")).sendKeys("52345");
	driver.switchTo().defaultContent();

	//inner fram3
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div.AB7Lab")).click();//doubt
	driver.switchTo().defaultContent();


	}

}

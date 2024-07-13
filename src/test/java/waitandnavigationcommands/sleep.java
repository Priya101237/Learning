package waitandnavigationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sleep {

	public static void main(String[] args) throws InterruptedException {

     ChromeDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	    Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");

	}

}

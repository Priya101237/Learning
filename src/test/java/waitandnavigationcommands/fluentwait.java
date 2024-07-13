package waitandnavigationcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentwait {

	public static void main(String[] args) throws InterruptedException {

     ChromeDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		//declaration


		FluentWait mywait = new FluentWait(driver);
        mywait.withTimeout(Duration.ofSeconds(30));
	    mywait.pollingEvery(Duration.ofSeconds(5));
	    mywait.ignoring(NoSuchElementException.class);

		   //usage


	WebElement username=  (WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	username.sendKeys("admin");

	}

}

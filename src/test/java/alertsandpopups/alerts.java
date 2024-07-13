package alertsandpopups;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alerts {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();

		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

	     Alert alertwindow=	mywait.until(ExpectedConditions.alertIsPresent());

	     System.out.println(alertwindow.getText());


	  //   Alert alertwindow=	driver.switchTo().alert();

	 // alertwindow.accept();//windowis closing ok button
	     alertwindow.dismiss();//window is closing using close button













    }











	}



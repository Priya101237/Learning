package mousehandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class locationofelement {

	public static void main(String[] args) throws InterruptedException  {

		 ChromeDriver driver=new ChromeDriver();

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		    WebElement logo= driver.findElement(By.xpath("//img[@alt='company-branding']"));
		    driver.manage().window().maximize();
		    System.out.println("After maximizing window :" +logo.getLocation());

		    driver.manage().window().minimize();
		    System.out.println("After minimize window :" +logo.getLocation());

		    driver.manage().window().fullscreen();
		    System.out.println("After fullscreen window :" +logo.getLocation());

		    Point p=new Point(100 ,100);
		    driver.manage().window().setPosition(p);
		    System.out.println("After seting window 100*100 :" +logo.getLocation());


		    p=new Point(50 ,50);
		    driver.manage().window().setPosition(p);
		    System.out.println("After seting window 50*50 :" +logo.getLocation());









	}
}
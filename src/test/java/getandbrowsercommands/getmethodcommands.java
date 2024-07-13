package getandbrowsercommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethodcommands {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		System.out.println("Title of the page "+driver.getTitle());

		System.out.println("Current URL "+driver.getCurrentUrl());

		//System.out.println("page source "+driver.getPageSource());

		String ps =driver.getPageSource();
		System.out.println(ps);
		System.out.println(ps.contains("html"));

		Thread.sleep(3000);

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();//open new browser

		System.out.println(driver.getWindowHandle());

		Set<String >windowid = driver.getWindowHandles();

		for(String winid:windowid) {

			System.out.println(windowid);
		}





	}

}

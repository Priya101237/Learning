package brokenlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
        WebElement ts= driver.findElement(By.id("age"));
        ts.getAttribute("Title");
        System.out.println(ts);
         
		

	}

}

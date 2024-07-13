package mousehandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class doubleclick {

	public static void main(String[] args) throws InterruptedException  {

		 ChromeDriver driver=new ChromeDriver();

		    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

		    driver.manage().window().maximize();

		    driver.switchTo().frame("iframeResult");

	WebElement	f1= driver.findElement(By.xpath("//input[@id='field1']"));
	f1.clear();
	f1.sendKeys("Welcome");

     WebElement button=	driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

     Actions act = new Actions(driver);
     act.doubleClick(button).perform();

     WebElement	f2  = driver.findElement(By.xpath("//input[@id='field2']"));

     Thread.sleep(3000);

   String copiedtext=  f2.getAttribute("value");

   System.out.println("copied text is " +copiedtext );


	}
}
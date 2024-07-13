package mousehandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class practicedraganddrop {

	public static void main(String[] args) throws InterruptedException  {

		 ChromeDriver driver=new ChromeDriver();
         driver.get("https://demo.guru99.com/test/drag_drop.html");

         driver.manage().window().maximize();
         Actions act=new Actions(driver);
        WebElement amountheader=    driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]")); //5000 -4

        WebElement amountcreditside= driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
        act.dragAndDrop(amountheader, amountcreditside).build().perform();







	}
}
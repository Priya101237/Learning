package getandbrowsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommands {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Thread.sleep(5000);

      //  driver.close();//single browser

        driver.quit();//all browser windows







	}

}

package framecommands;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlebrowserwindow {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

	   driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

	   //approaces of handling windows

	   Set <String> windowid=driver.getWindowHandles();
	   /*
		List <String> windowidlist=new ArrayList(windowid);

		String parentwindow =windowidlist.get(0);
		String childwindow =windowidlist.get(1);

		//swictch to childwindow

		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();//contact sales

		//switch to parent window

		driver.switchTo().window(parentwindow);
		driver.findElement(By.name("username")).sendKeys("ADMIN");

		*/

	   //Approach2

	   /*

	   for(String windid:windowid)
	   {
		 String title =driver.switchTo().window(windid).getTitle();

		 if(title.equals("OrangeHRM HR Software | OrangeHRM"))
		 {
			 driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		 }
	   }


	   //approach3 -closing specific broswer based on pur choice

	//   1-x;2=y;3=z;4=a

	   for(String windid:windowid)
	   {
		 String title =driver.switchTo().window(windid).getTitle();

		 if(title.equals("x") | title.equals("y") |title.equals("z"))
		 {
			 driver.close();
		 }
	   }
	   */

	   //closing the parent window

	   /*

	   for(String windid :windowid)
	   {
		 String title=  driver.switchTo().window(windid).getTitle();

		 if(title.equals("OrangeHRM"))
		 {
			 driver.close();

		 }
	   }

	   */
	   //closing only childwindow

	   for(String windid :windowid)
	   {
		 String title=  driver.switchTo().window(windid).getTitle();

		 if(title.equals("OrangeHRM HR Software | OrangeHRM"))
		 {
			 driver.close();

		 }
	   }



	}

}

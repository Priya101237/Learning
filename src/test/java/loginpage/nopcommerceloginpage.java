package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopcommerceloginpage {

	public static void main(String[] args) throws InterruptedException {

		/*
		 *Launch Browser
		 *OPen Url
		 *Un=admin
		 *Password-admin123
		 *click-login
		 *Verify the title of dashboard page
		 *close browser
		 *
		 */

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
	     WebElement Emailbox= driver.findElement(By.id("Email"));
	     Emailbox.clear();
	     Emailbox.sendKeys("admin@yourstore.com");

	   WebElement Passwordbox=  driver.findElement(By.id("Password"));
	   Passwordbox.clear();
	   Passwordbox.sendKeys("admin");

	   driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
	 //  Thread.sleep(5000);
	/*
	String act_title=   driver.getTitle();
	String exp_title ="Dashboard";
	if(act_title.equals(exp_title)) {
		System.out.println("Passed");
	}
	else
	{
		System.out.println("No");
	}

	*/
	   String act_title="nopCommerce";


    act_title= driver.findElement(By.xpath("/html/body/div[3]/aside/a/img[1]")).getText();

  String exp_title="nopCommerce";

  if(act_title.equals(exp_title)) {
	  System.out.println("Test Passed");
  }
  else
  {
	  System.out.println("Test Failed");
  }







	}


}

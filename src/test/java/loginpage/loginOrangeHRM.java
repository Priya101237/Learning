package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

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

public class loginOrangeHRM {

	public static void main(String[] args) throws InterruptedException {

	//	System.setProperty("Weddriver.chrome.driver","C:\\Eclips Java\\Learning\\Drivers\\chromedriver.exe" );

		//Launch Browser
    //	WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		//Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		//username
     //   WebElement txtusername	=driver.findElement(By.name("username"));
	//	txtusername.sendKeys("Admin");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		//Login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	//	Thread.sleep(5000);
		/*
		//Verify the dashboard page
	String act_title=	driver.getTitle();
	String exp_title="OrangeHRM";

	if(act_title.equals(exp_title))
	{
		System.out.println("Test passed");
	}
	else
	{
		System.out.println("Failed");
	}

	*/

		//Validate the page after successful login

		String 	act_title ="";
	try {
	 	act_title =driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	}
	catch(NoSuchElementException q) {
		//act_title="";

	}
	String exp_title="Dashboard";

	if(act_title.equals(exp_title))
	{
		System.out.println("Test Passed");
	}

	else
	{
		System.out.println("Test Failed");
	}

//	driver.close();;
	}

}

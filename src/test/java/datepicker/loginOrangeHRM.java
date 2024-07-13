package datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

		ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		//Login button
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		//Pim click



	   driver.findElement(By.xpath("//span[normalize-space()='Performance']")).click();


	   //Employee name

	   driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--focus']//input[@placeholder='Type for hints...']")).sendKeys("Priya");
	   driver.findElement(By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click(); //click dropdown

	   List<WebElement>  options=driver.findElements(By.xpath("//div[@role='listbox']//span"));

	   for(WebElement opt :options)
	   {
		  // System.out.println(opt.getText());

		   if(opt.getText().equals("Chief Technical Officer"))
		   {
			   opt.click();
			   break;
		   }
	   }

	   //click sub unit

	 List<WebElement>  Options2 =driver.findElements(By.xpath("//div[@role='listbox']//span"));

	 for(WebElement opt2:Options2 )
	 {
		 if(opt2.getText().equals("Engineering"))
		 {
			 opt2.click();
			 break;
		 }
	 }


	 //click include

   List<WebElement>	options3= driver.findElements(By.xpath("//div[@role='listbox']//span"));

   for(WebElement opt3 :options3)
   {
	   if(opt3.getText().equals("Current Employees Only"))
	   {
		   opt3.click();
		   break;
	   }
   }

   //click review status

 List<WebElement>	options4= driver.findElements(By.xpath("//div[@role='listbox']//span"));

   for(WebElement opt4 :options4)
   {
	   if(opt4.getText().equals("Activated"))
	   {
		   opt4.click();
		   break;
	   }
   }

   //select date format --from date

 WebElement fromdate=  driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]"));
 fromdate.clear();
 fromdate.sendKeys("2024-02-03");

 //approach2

  driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]")).click();

  String year ="2024";
  String month = "October";
  String date="24";

  while(true)
  {
	  String yr="";
  }








	}

}

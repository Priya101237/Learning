package statictable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class paginationtable {

	public static void main(String[] args) throws InterruptedException {

      ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    driver.get("https://demo.opencart.com/admin/");

	    driver.manage().window().maximize();

	 //Username

	WebElement username= driver.findElement(By.id("input-username"));
	username.clear();
	username.sendKeys("demo");

	 //password

   WebElement password= driver.findElement(By.id("input-password"));
   password.clear();
   password.sendKeys("demo");

   // click login

    driver.findElement(By.xpath("//button[@type='submit']")).click();


    //verify page

    Thread.sleep(3000);
  /*  if(driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed());
    {
    	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    } */

    //dialoge box -x button




   if( driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
	;
}

    {
    	driver.findElement(By.xpath("//button[@class='btn-close']")).click();
    }

   //click customers

    driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();

    driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();

  String Text=	driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();	// Showing 1 to 10 of 18253 (1826 Pages)

   int totalpages=Integer.parseInt(Text.substring(Text.indexOf("(")+1, Text.indexOf("pages")-1));
   System.out.println("Total Number of pages " +totalpages);


	for(int p=1;p<=10;p++)
	{
		if(totalpages>=1)
		{
		WebElement activepage=driver.findElement(By.xpath("//u1[@class='pagination']//li//*[text()="+p+"]"));
		System.out.println("Activepage " +activepage);
		activepage.click();
		Thread.sleep(3000);
		}

	int noofrows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
	System.out.println("Total number of rows " +noofrows);

	for(int r=1;r<noofrows;r++)
	{
	WebElement  Customername=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]"));
	 WebElement  CustomerEmail=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]"));
	 WebElement  Status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]"));
	 System.out.println(Customername+ "  " +CustomerEmail+"  "+Status);
	}




	}


	}
}
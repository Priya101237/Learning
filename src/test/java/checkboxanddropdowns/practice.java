package checkboxanddropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("priya");

		driver.findElement(By.id("email")).sendKeys("priya@gmail.com");

		driver.findElement(By.id("phone")).sendKeys("9865230048");

		driver.findElement(By.id("textarea")).sendKeys("priya");


    WebElement	maleradio=	driver.findElement(By.id("male"));

    maleradio.click();

    if(maleradio.isSelected()) {
    	System.out.println(true);
    }

    else {
    	System.out.println(false);
    }



    //select first checkbox

   // driver.findElement(By.id("sunday")).click();

    //click all the elements

  List<WebElement> select=  driver.findElements(By.xpath("//*[@class='form-check-input'][@type='checkbox']"));
 System.out.println("Total number of checkboxes " +select.size());

 //check and uncheck checkboxes



   for(int i=0;i<2;i++)
   {
	  select.get(i).click();
   }

   for(int i=0;i<select.size();i++)
   {


	   if(select.get(i).isSelected()) {
		select.get(i).click();
	}
   }
   /*
   //first click 2 elements

   for(int i=0;i<2;i++) {
	   select.get(i).click();
   }

   */
   /*

  WebElement country= driver.findElement(By.xpath("//select[@id='country']"));

  Select sl=new Select(country);

  sl.selectByVisibleText("China");

  */

   driver.findElement(By.xpath("//select[@id='country']")).click();

 List<WebElement> listcountry= driver.findElements(By.xpath("//select[@id='country']//option"));

   System.out.println("Total number of country " +listcountry.size());



   for(int i=0;i<listcountry.size();i++)
   {
	 // System.out.println(listcountry.get(i).getText());

	 String text= listcountry.get(i).getText();
	 {
		 if(text.equals("China"))
		 {
			 listcountry.get(i).click();
		 }
	 }
   }




	}

}

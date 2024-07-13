package datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class date {

	public static void main(String[] args) throws InterruptedException {

      ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    driver.get("https://jqueryui.com/datepicker/");

	    driver.manage().window().maximize();

	    driver.switchTo().frame(0);

	    //approach 1

	   // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/14/2023"); //mm/dd/yyyy

	    //approach2

	    String yr="2020";
	    String mon="March";
	    String date="10";


	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();

	    while(true)
	    {
	     String Month=	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	     String Year=	driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

	     if(Month.equals(mon) && Year.equals(yr) )
	     {
	    	 break;
	     }

	   //  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next button -Future date

	     driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //past date //previous btton


	    }

      //select date

   List<WebElement> alldates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

	 /* for(  WebElement dt : alldates) //enhanced loop
	{
		if(dt.getText().equals(date))
		{
			dt.click();
		    break;
		}
	} */


    for(int i=0; i<alldates.size();i++)
    {
    	if(alldates.get(i).getText().equals(date))
    	{
    		alldates.get(i).click();
    		break;
    	}
    }

	}
}
package datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dateapplicaiondummy {

	public static void main(String[] args) throws InterruptedException {

      ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(5));

	    driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");

	    driver.manage().window().maximize();

	    driver.findElement(By.xpath("//input[@id='product_551']")).click();

	    driver.findElement(By.id("travname")).sendKeys("Priya");

	    driver.findElement(By.id("travlastname")).sendKeys("P");

	    driver.findElement(By.id("dob")).click();

	    //select by month

	    WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	    Select monthselect= new Select(month);
	    monthselect.selectByVisibleText("Mar");

	    //select by year

	     WebElement Year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	     Select Yearselect=new Select(Year);
	     Yearselect.selectByVisibleText("2024");

	     Thread.sleep(3000);

	 //    driver.findElement(By.xpath("//a[text()='10']")).click();


	     String date="10";

	    List <WebElement> alldates=  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));


	    for(WebElement dt:alldates)
	    {
	    	if(dt.getText().equals(date))
	    	{
	    		dt.click();
	    		break;
	    	}
	    }

	    /*

	    for (int i=0;i<alldates.size();i++)
	    {
	    	if(alldates.get(i).getText().equals(date))
	    	{
	    		alldates.get(i).click();
	    		break;
	    	}
	    }

	    */

	    driver.findElement(By.xpath("//input[@id='sex_1']")).click(); //male
	    driver.findElement(By.id("traveltype_2")).click();
	    driver.findElement(By.id("fromcity")).sendKeys("travel2");
	    driver.findElement(By.id("tocity")).sendKeys("travel2");

	    driver.findElement(By.id("departon")).click();

	    WebElement month1=	driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	    Select monthselect1= new Select(month1);
	    monthselect1.selectByVisibleText("Mar");

	    //select by year

	     WebElement Year1=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	     Select Yearselect1=new Select(Year1);
	     Yearselect1.selectByVisibleText("2024");
	     
	     Thread.sleep(3000);


	     String date1="28";

		    List <WebElement> alldates1=  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));


		    for(WebElement dt:alldates1)
		    {
		    	if(dt.getText().equals(date1))
		    	{
		    		dt.click();
		    		break;
		    	}
		    }

		    driver.findElement(By.id("returndate")).click();

		    WebElement month2=	driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		    Select monthselect2= new Select(month2);
		    monthselect2.selectByVisibleText("Mar");

		    //select by year

		     WebElement Year2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		     Select Yearselect2=new Select(Year2);
		     Yearselect2.selectByVisibleText("2024");

		     String date2="28";

			    List <WebElement> alldates2=  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));


			    for(WebElement dt:alldates2)
			    {
			    	if(dt.getText().equals(date2))
			    	{
			    		dt.click();
			    		break;
			    	}
			    }

            //visa application

			    driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
			    driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Visa extension" +Keys.ENTER);


			driver.findElement(By.xpath("//input[@id='deliverymethod_1']")).click(); //email
			driver.findElement(By.id("billname")).sendKeys("priya");
			driver.findElement(By.id("billing_phone")).sendKeys("98765454234");
			driver.findElement(By.id("billing_email")).sendKeys("priya@gmil.com");

	      //country dropdown		//boostrap dropdown

			driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();
			driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Iran " +Keys.ENTER);



		driver.findElement(By.id("billing_address_1")).sendKeys("256");

		driver.findElement(By.id("billing_address_2")).sendKeys("saravanampatti");

    	driver.findElement(By.id("billing_city")).sendKeys("coimbatore");

       //state

    	driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click();
    	driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Bihar " +Keys.ENTER);

    	driver.findElement(By.id("billing_postcode")).sendKeys("1223243");

    	//place order
    	driver.findElement(By.id("place_order")).click();

        driver.quit();














		}





	}

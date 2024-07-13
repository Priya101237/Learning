package getandbrowsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalCommands {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");

		driver.manage().window().maximize();

      //WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
   //  System.out.println("Display of the logo status " +logo.isDisplayed());

	boolean status=	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	System.out.println(status);

    WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
     searchbox.isDisplayed();
     System.out.println("Display status " +searchbox);
     System.out.println("Enable status "+searchbox.isEnabled());


     //isSelected()

        WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));

        //before selection

        System.out.println("Before Selection....................");
      System.out.println(male_rd.isSelected());//false
      System.out.println(female_rd.isSelected());//false

      //after selection of male radio button

       System.out.println("After  male rd Selection....................");
       male_rd.click();
       System.out.println(male_rd.isSelected());//true
       System.out.println(female_rd.isSelected());//false

       //after selection of female radio button

       System.out.println("After female rd Selection....................");
       female_rd.click();
       System.out.println(male_rd.isSelected());//false
       System.out.println(female_rd.isSelected());//true
	}

}

package checkboxanddropdowns;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handledropdown {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

		driver.manage().window().maximize();

	WebElement selectcountrylist =driver.findElement(By.xpath("//select[@id='country-list']"));

    Select slct=new Select(selectcountrylist);

    //selecting the option from the dropdown

   // slct.selectByVisibleText("USA");

  // slct.selectByValue("4"); //use onlyif the attribute value is present in option tag
   slct.selectByIndex(2);

   //find total options in dropdownlist

 List<WebElement> options= slct.getOptions();

 System.out.println("Total number of options in dropdown " +options.size());

   //print option in console windown
 /*
  for(int i=0;i<options.size();i++)
  {
	 System.out.println(options.get(i).getText());
  }
  */
  //enhanced for loop

  for(WebElement opt :options)
  {
	System.out.println(opt.getText());
  }

 
  
  ArrayList<String> cars = new ArrayList<String>();
  cars.add("Volvo");
  cars.add("BMW");
  cars.add("Ford");
  cars.add("Mazda");
  System.out.println(cars);
	}

}

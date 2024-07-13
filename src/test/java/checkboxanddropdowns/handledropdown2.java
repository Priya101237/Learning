package checkboxanddropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handledropdown2 {

	public static void main(String[] args) {


	   ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		driver.manage().window().maximize();

		//click the drodown

		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();


		//find number of options

        List<WebElement> options =driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));	//u1[contains(@class,'multiselect')]//label

         System.out.println("total number of options "+options.size());

         //list down allthe options
         /*
         for(int i=0;i<options.size();i++)
         {
        	System.out.println(options.get(i).getText());
        	*/


        	//select the options from dropdown
         /*
         for(int i=0;i<options.size();i++)

        {
             String	opt= options.get(i).getText();

              if(opt.equals("Java") || opt.equals("Python")) {

            	 options.get(i).click();
              }



                if( options.get(i).getText().equals("Java"))
        	{
        		options.get(i).click();
        		break;
        	}
               */


         //for using enhanced forloop

         for(WebElement opt:options)
         {
        	String test=opt.getText();

        	 if(test.equals("Java") || test.equals("Python")) {
				opt.click();
			}



         }






	}

}

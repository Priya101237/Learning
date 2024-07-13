package checkboxanddropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlecheckbox {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//select first checkbox
	//	driver.findElement(By.xpath("//input[@id='sunday']")).click();

		//total number of checkboxes

    List<WebElement>checkbox=driver.findElements(By.xpath("//*[@class='form-check-input'][@type='checkbox']"));
    System.out.println("Total number of checkboxes "+checkbox.size());

    //select all the chcekboxes

    /*
    for(int i=0;i<=7;i++)
    {
    	checkbox.get(i).click();
    }


    //select last 2 chcekboxes

    for(int i=5;i<checkbox.size();i++)
    {
    	checkbox.get(i).click();
    }



//select first 2 chcekboxes

    for(int i=0;i<2;i++)
    {
    	checkbox.get(i).click();
    }

     */
      //or
    /*
//select first 2 chcekboxes

    for(int i=0;i<checkbox.size();i++)
    {
    	if(i<2) {
    		checkbox.get(i).click();
    	}


    	*/

    //select allthechcekboxes

    for(int i=0;i<3;i++)
    {
    	checkbox.get(i).click();
    }

    Thread.sleep(3000);
    /*
    //same -unselect

    for(int i=0;i<checkbox.size();i++)
    {
    	if(checkbox.get(i).isSelected())
    	checkbox.get(i).click();
    }
    */

    //enhanced for loop

    for(WebElement chxbox:checkbox)
    {
    	if(chxbox.isSelected()) {
			chxbox.click();
		}
    }



    //










    }











	}



package checkboxanddropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleautosuggestdropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");




	List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d') and @role='presentation']"));//[@role='presentation']

	System.out.println("Number of suggestions " + list.size());

	for(int i=0;i<list.size();i++)
	{
		// System.out.println(list.get(i).getText());

	String text=list.get(i).getText();

     if(text.equals("selenium automation testing")) {

    	 list.get(i).click();
    	 break;
     }
	}














    }











	}



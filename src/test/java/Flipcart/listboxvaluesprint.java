package Flipcart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxvaluesprint {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();

		Select countryList = new Select(driver.findElement(By.id("country-list")));
		countryList.selectByVisibleText("China");
		
		List<WebElement> options=countryList.getOptions();
		
		System.out.println(options.size());
		
		for(int i=0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}

		
		
		
		/*
	    Select statelist= new Select(driver.findElement(By.xpath("//select[@name='state']")));
	    statelist.selectByVisibleText("Hebei");
	    List<WebElement> state =statelist.getOptions();
	    System.out.println(state.size());
	    for(int i=0;i<state.size();i++)
	    {
	    	System.out.println(state.get(i).getText());
	    }*/
		
	}

}

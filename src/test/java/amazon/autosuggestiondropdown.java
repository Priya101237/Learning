package amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosuggestiondropdown {
	
	WebDriver driver;

	public void scenarios(String nameofBrowser) {
		
		
		
		if(nameofBrowser.equals("Chrome"))
		{
			driver =new ChromeDriver();
			
		}
		
		if(nameofBrowser.equals("EdgeDriver"))
		{
			driver =new  EdgeDriver();
		}
		
		if(nameofBrowser.equals("FirefoxDriver"))
		{
			driver =new  FirefoxDriver();
		}
		
		//	ChromeDriver driver =new ChromeDriver();
		driver.get(" https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement d=	 driver.findElement(By.xpath("//textarea[@name='q']"));
	 d.sendKeys("sachin Tendulaker");
	 
	  List<WebElement> autosuggestion =driver.findElements(By.xpath("//div[@id='Alh6id']//ul//li"));
	  
	   int suggestioncount =autosuggestion.size();
	  
	  for(int i=0;i<autosuggestion.size();i++)
	  {
		  System.out.println(autosuggestion.get(i).getText());
	  }
	  
	 // System.out.println(suggestioncount-5);
	  
	
	  autosuggestion.get(suggestioncount-3).click();
	

		
		
		
		
		
		
		
		
	}

}

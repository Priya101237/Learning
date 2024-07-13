package interviewqs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	
	
	WebDriver driver;

 // @Test 
 //@Parameters("browser")
 
 /*
 
  public void scenarios(String nameofBrowser) {
			
		
			
			if(nameofBrowser.equals("Chrome"))
			{
				driver =new ChromeDriver();
				
			}
			
			if(nameofBrowser.equals("Edge"))
			{
				driver =new  EdgeDriver();
			}
			
			if(nameofBrowser.equals("Firefox"))
			{
				driver =new  FirefoxDriver();
			} 
 } */
	
	@Test (invocationCount=3 ,threadPoolSize=2)
	public void scenarios( ) {
			
			ChromeDriver driver= new ChromeDriver();
			driver.get(" https://www.google.com/");
			//driver.manage().window().maximize();
			
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
		  
		
		  autosuggestion.get(suggestioncount-5).click();
		

		}		
  }


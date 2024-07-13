package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookDataprovider {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
    
	public void scenarios(String browsername) {
		
		
	   if(browsername.equals("Chrome"))
	   {
		   driver = new ChromeDriver();
	   }
	   
	   if(browsername.equals("Edge"))
	   {
		   driver = new EdgeDriver();
	   }
	   
	   if(browsername.equals("FireFox"))
	   {
		   driver = new FirefoxDriver();
	   }
		
		
		//ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email =driver.findElement(By.id("email"));
		email .sendKeys("priyasram373@gmail.com");
		email.sendKeys(Keys.CONTROL+"A");
		email.sendKeys(Keys.DELETE);
		email.sendKeys("raju@gail.com");
		
		driver.findElement(By.id("pass")).sendKeys("priya@123");
		

	}

}

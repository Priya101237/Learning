package interview2;

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

public class bubuTest {

WebDriver driver;
	
	@Test()
	@Parameters("browser")
	

		
	public void suggest (String browsername)	
	
	   {
		if(browsername.equals("Chrome"))
		{
			driver =new ChromeDriver();
		}
		
		if(browsername.equals("Edge"))
		{
			driver =new EdgeDriver();
        }
		
		if(browsername.equals("Firefox"))
		{
			driver =new FirefoxDriver();
    }
		
		
		//ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
       WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       searchbox.sendKeys("tomato");
       
       List<WebElement> autosuggestion =driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']//div//div//div[text()='tomato']"));
		
     int count =  autosuggestion.size();
       for(int i=0; i<autosuggestion.size();i++)
       {
    	   System.out.println(autosuggestion.get(i).getText());
       }
       
      autosuggestion.get(count-2).click();
      


  }
}

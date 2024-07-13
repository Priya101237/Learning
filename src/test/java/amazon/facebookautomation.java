package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookautomation {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
	driver.findElement(By.name("firstname")).sendKeys("priya");
	driver.findElement(By.name("lastname")).sendKeys("r");
	driver.findElement(By.name("reg_email__")).sendKeys("9865230041");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Cucumber@373");
	Select date =new Select(driver.findElement(By.id("day")));
	date.selectByVisibleText("8");
	Select month =new Select(driver.findElement(By.id("month")));
	month.selectByVisibleText("May");
	Select year =new Select(driver.findElement(By.id("year")));
	year.selectByVisibleText("2010");
	driver.findElement(By.xpath("//input[@type=\"radio\"][1]")).click();
	
		


		

	}

}

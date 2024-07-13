package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("home & kitchen appliances");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Large Appliances')]")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Godrej 223 L 2 Star Nano Shield Technology, Inverter Frost Free Double Door Refrigerator");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.partialLinkText("Inverter Frost Free Double Door Refrigerator(2023 Model, RF EON 244B RI ST GL, Steel Glow")).click();
		//driver.findElement(By.xpath("//span[text()='223 L 2 Star Nano Shield Technology, Inverter Frost Free Double Door Refrigerator(2023 Model, RF EON 244B RI ST GL, Steel Glow)']")).click();
	//	driver.findElement(By.xpath("//*[@id=\"submit.add-to-cart\"]")).click();
	}

}

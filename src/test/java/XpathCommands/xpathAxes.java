package XpathCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxes {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();

		//firstname
		driver.findElement(By.name("name")).sendKeys("priya");

		//lastname

		driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[1]")).sendKeys("Ram");

		//email

		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("priya@gmail.com");

		//password
		driver.findElement(By.xpath("//label[text()='Password']/following::input[1]")).sendKeys("Priya");

		//re pass
		driver.findElement(By.xpath("//label[text()='Repeat Password']/following-sibling::input")).sendKeys("Priya");

		//click register
		driver.findElement(By.xpath("//*[@type='submit']/ancestor::div[@class='buttons']")).click();
	}

}

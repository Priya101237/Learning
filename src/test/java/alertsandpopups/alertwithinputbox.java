package alertsandpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertwithinputbox {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();

		//https://the-internet.herokuapp.com/basic_auth

		//http://username:password@the-internet.herokuapp.com/basic_auth
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

		driver.manage().window().maximize();

	String text=driver.findElement(By.xpath("//p[contains(text(), 'Congratulations!')]")).getText();

	if(text.contains("Congratulations!"))
	{
		System.out.println("Test Passed");
	}

	else
	{
		System.out.println("Test Failed");
	}





















    }











	}



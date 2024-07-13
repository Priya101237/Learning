package checkboxanddropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceautosuggestiondropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.bing.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("Java");

		Thread.sleep(3000);

	List<WebElement> Text=	driver.findElements(By.xpath("//div[contains(@class,'sa_tm')]//span"));



	System.out.println("Number of suggestions " + Text.size());


	for(int i=0;i<Text.size();i++)
	{
	   System.out.println(Text.get(i).getText());
	}

	}

}

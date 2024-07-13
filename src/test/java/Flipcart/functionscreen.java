package Flipcart;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class functionscreen {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts= driver;
		 WebElement flipcart =driver.findElement(By.xpath("//img[@title='Flipkart']"));
		File src=flipcart.getScreenshotAs(OutputType.FILE);
		File target= new File(" C:\\priya\\Eclips Java\\Learning\\src\\test\\resources\\screenshotts\\flipcart.png");
		FileUtils.copyFile(src,target);
		
			
		
		

	}

}

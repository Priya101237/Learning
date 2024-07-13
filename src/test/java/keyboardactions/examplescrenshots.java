package keyboardactions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examplescrenshots {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver =new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();

	    //capture screenshotof full page

	/* TakesScreenshot ts= driver;
	 File scr=   ts.getScreenshotAs(OutputType.FILE);
	 File target = new File ("C:\\Eclips Java\\Learning\\src\\test\\resources\\screenshotts\\fullpage.png");
	 FileUtils.copyFile(scr, target);

	    //capture specific screen in webpage
	 WebElement featureprodut=   driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	File scr= featureprodut.getScreenshotAs(OutputType.FILE);
	File targetfile =new File("C:\\Eclips Java\\Learning\\src\\test\\resources\\screenshotts\\fullpage.png");
	FileUtils.copyFile(scr, targetfile);	*/

	    //capture logo screnshot of the webpage

	WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
     File Scr=	logo.getScreenshotAs(OutputType.FILE);
     File target = new File ("C:\\priya\\Eclips Java\\Learning\\src\\test\\resources\\screen\\java.png");
     FileUtils.copyFile(Scr, target);

	}

}

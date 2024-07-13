package framecommands;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceBrowserhandles {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    driver.get("https://testautomationpractice.blogspot.com/");

	    driver.manage().window().maximize();

	    driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium"); //Tabs-Searchbox
	    driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();//search box

	    driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
	    Set <String> windowid=driver.getWindowHandles();

	  /*  List <String> windowidlist =new ArrayList(windowid);

	    String parentwindow =windowidlist.get(0);

	    String childwindow =windowidlist.get(1);

	   driver.switchTo().window(childwindow);
	   driver.findElement(By.name("search")).sendKeys("Selenium");

	   driver.switchTo().window(parentwindow);
	   driver.findElement(By.id("name")).sendKeys("priya"); */

	   for(String winid:windowid)
	   {
		 String Title=  driver.switchTo().window(winid).getTitle();

		 if(Title.equals("Selenium - Wikipedia"))
		 {
			 driver.findElement(By.name("search")).sendKeys("Selenium");
		 }
	   }




	   /*


	 List<WebElement> options =driver.findElements(By.id("Wikipedia1_wikipedia-search-results"));
	 System.out.println("number of suggestion " +options.size());

	 for(int i=0;i<options.size();i++)
	 {
		//System.out.println(options.get(i).getText());
		String opt= options.get(i).getText();
		if(opt.equals("Selenium"))
		{
			options.get(i).click();


		}
	 }

	 */










	}

}

package mousehandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class draganddrop {

	public static void main(String[] args) throws InterruptedException  {

		 ChromeDriver driver=new ChromeDriver();

		    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		    driver.manage().window().maximize();

		    Actions act=new Actions (driver);

	         WebElement matridbox=  driver.findElement(By.xpath("//div[@id='box7']")); //matrid

	         WebElement spainbox=  driver.findElement(By.xpath("//div[@id='box107']")); //spain

	         act.dragAndDrop(matridbox, spainbox).perform();

	         //wasington and norway

             WebElement  wasingtonbox=  driver.findElement(By.xpath(" //div[@id='box3']"));

	         WebElement norwaybox=  driver.findElement(By.xpath("//div[@id='box101']"));

	         act.dragAndDrop(wasingtonbox, norwaybox).perform();


            //seoul and norway

             WebElement  seoulbox=  driver.findElement(By.xpath(" //div[@id='box5']"));

	         WebElement unitedstatesbox=  driver.findElement(By.xpath("//div[@id='box103']"));

	         act.dragAndDrop(seoulbox, unitedstatesbox).perform();

	         //rome and denmark

             WebElement  romebox=  driver.findElement(By.xpath(" //div[@id='box6']"));

	         WebElement denmarkbox=  driver.findElement(By.xpath("//div[@id='box104']"));

	         act.dragAndDrop(romebox, denmarkbox).perform();



	}
}
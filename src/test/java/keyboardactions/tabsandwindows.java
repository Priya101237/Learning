package keyboardactions;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabsandwindows {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	 //   driver.switchTo().newWindow(WindowType.TAB);//opens new tab
	    driver.switchTo().newWindow(WindowType.WINDOW); //opens in another window



	    driver.get("https://demo.opencart.com/");



}
}

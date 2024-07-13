package amazon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazonaccountcreation {

	public static void main(String[] args) throws InterruptedException {
		
		//Amazon Account Creation
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
	
		/*
		Select drp = new Select (driver.findElement(By.id("searchDropdownBox")));
		drp.selectByVisibleText("Music"); 
		
		
		/*
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys("priyasram373@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Cucumber@373");
		driver.findElement(By.id("signInSubmit")).click(); */
		
		//Searching a particular car 
		
	
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Car & Motorbike - Car Accessories");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Car & Motorbike']")).click();
	    driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("KOZDIKO Mini Magnetic Car Dashboard Mount Mobile Phone Holder with Metal Body Universal for Cars");
	    WebElement submit =	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    submit.click();
		//driver.findElement(By.xpath("//span[text()='KOZDIKO Mini Magnetic Car Dashboard Mount Mobile Phone Holder with Metal Body Universal for Cars'][@class='a-size-base-plus a-color-base a-text-normal']")).click();
		
		
		//driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[4]")).click();
	     driver.findElement(By.partialLinkText("Mount Mobile Phone Holder with Metal Body Universal for Cars")).click();
		//driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[4]"));
		
		
		Set<String> s =driver.getWindowHandles();
		 ArrayList ar =new ArrayList(s);
		// System.out.println(ar.get(0));
		// System.out.println(ar.get(1));
		 driver.switchTo().window((String)ar.get(1));
		 //quantity
		 Select quantity = new Select(driver.findElement(By.id("quantity")));
		 quantity.selectByIndex(3);
		 
		 WebElement addtocart =driver.findElement(By.xpath(" //input[@id='add-to-cart-button']"));
		 addtocart.click(); 
		 
		 //Searching a particular Home Appliances 
		 
		 /*
		    WebElement searchbox2=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			searchbox2.sendKeys("home & kitchen appliances");
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Large Appliances')]")).click();
			driver.findElement(By.id("twotabsearchtextbox")).clear();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Godrej 223 L 2 Star Nano Shield Technology, Inverter Frost Free Double Door Refrigerator");
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//	driver.findElement(By.xpath("//span[text()='Godrej 223 L 2 Star Nano Shield Technology, Inverter Frost Free Double Door Refrigerator(2023 Model, RF EON 244B RI ST GL, Steel Glow)'][@class='a-size-base-plus a-color-base a-text-normal']")).click();
			
			
		driver.get("https://www.amazon.in/Godrej-Technology-Refrigerator-EON-244B/dp/B0BXSRCPJ1/ref=pd_ci_mcx_mh_mcx_views_0?pd_rd_w=vd4k8&content-id=amzn1.sym.120dbce3-1ee8-4441-9b7e-775b1c676a73%3Aamzn1.symc.ca948091-a64d-450e-86d7-c161ca33337b&pf_rd_p=120dbce3-1ee8-4441-9b7e-775b1c676a73&pf_rd_r=V7M7D260QXE9VX353K0K&pd_rd_wg=8mV6Z&pd_rd_r=777ed0ab-2c73-413b-a1a8-c348bb7b480f&pd_rd_i=B0BXSRCPJ1");
			//WebElement Add= driver.findElement(By.id("add-to-cart-button"));
			
			//Add.click();
			
			Select quantity1 = new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
			 quantity1.selectByIndex(1); 
			 Set<String> s1 =driver.getWindowHandles();
			 ArrayList ar1 =new ArrayList(s1);
			 driver.switchTo().window((String)ar1.get(1));
			 WebElement addtocart1 =driver.findElement(By.xpath(" //input[@id='add-to-cart-button']"));
			 addtocart1.click(); 
			 
			 /*
			 WebElement Add= driver.findElement(By.id("add-to-cart-button"));
				
				Add.click();
			 
			Select quantity1 = new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
			 quantity1.selectByIndex(1); 
			 WebElement Add= driver.findElement(By.id("add-to-cart-button"));
				
				Add.click();
			 
			 driver.findElement(By.id("buy-now-button")).click();
			/* 
			WebElement Add= driver.findElement(By.id("add-to-cart-button"));
			
			Add.click();
			
			
			/*
			 Set<String> s1 =driver.getWindowHandles();
			 ArrayList ar1 =new ArrayList(s1);
			 driver.switchTo().window((String)ar1.get(1));
			 WebElement addtocart1 =driver.findElement(By.xpath(" //input[@id='add-to-cart-button']"));
			 addtocart1.click(); 
			
			
			 
			driver.findElement(By.partialLinkText("Inverter Frost Free Double Door Refrigerator(2023 Model, RF EON 244B RI ST GL, Steel Glow")).click();
			
			Set<String> s1 =driver.getWindowHandles();
			 ArrayList ar1 =new ArrayList(s1);
			 driver.switchTo().window((String)ar1.get(1));
			 //quantity 
			 
			 Select quantity1 = new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
			 quantity1.selectByIndex(1); 
			 WebElement addtocart1 =driver.findElement(By.xpath(" //input[@id='add-to-cart-button']"));
			 addtocart1.click(); 
			
			 /*
			 //Electronics 
			 WebElement searchbox3 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				searchbox3.sendKeys("Electronics – Home audio");
				driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
				driver.findElement(By.xpath("//span[contains(text(),'Hi-Fi & Home Audio Speakers')]")).click();
				driver.findElement(By.id("twotabsearchtextbox")).clear();
				driver.findElement(By.id("twotabsearchtextbox"))
						.sendKeys("“PremiumAV HDMI Male to VGA Female Video Converter Adapter Cable (Black)”");
				driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
				driver.findElement(By.xpath(
						"//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//div[@class='a-section a-spacing-base']"))
						.click();
				/*
				Set<String> s2 =driver.getWindowHandles();
				 ArrayList ar2 =new ArrayList(s2);
				 driver.switchTo().window((String)ar2.get(1));
				 WebElement addtocart3 =driver.findElement(By.xpath(" //input[@id='add-to-cart-button']"));
				 addtocart3.click(); */
		
			
		
		
		
		

	}

}

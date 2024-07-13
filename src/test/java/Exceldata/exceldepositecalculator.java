package Exceldata;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class exceldepositecalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();	
	   String file=System.getProperty("user.dir") +"\\testdata\\fixeddepositecal.xlsx";
	    int rows=  ExcelUtilities.getRowCount(file, "Sheet1");
	   
	  for( int i=1;i<=rows; i++)
	  {
		  
		  //read data from excel
		 String principle= ExcelUtilities.getCellData(file, "Sheet1", i, 0);
		 String Rteinterest= ExcelUtilities.getCellData(file, "Sheet1", i, 1);
		 String per1= ExcelUtilities.getCellData(file, "Sheet1", i, 2);
		 String per2= ExcelUtilities.getCellData(file, "Sheet1", i, 3);
		 String fre= ExcelUtilities.getCellData(file, "Sheet1", i, 4);
		 String exp_value= ExcelUtilities.getCellData(file, "Sheet1", i, 5);
		 
		 //pass data into the app
		 
		    driver.findElement(By.id("principal")).sendKeys(principle);
		    driver.findElement(By.id("interest")).sendKeys(Rteinterest);
		    driver.findElement(By.id("tenure")).sendKeys(per1);
		    
		    Select days =new Select(driver.findElement(By.id("tenurePeriod")));
		    days.selectByVisibleText(per2);
		    
             Select freq =new Select(driver.findElement(By.id("frequency")));
		    freq.selectByVisibleText(fre);
		    
		    JavascriptExecutor js=driver;
		WebElement  Calculatebutton= driver.findElement(By.xpath("//div[@class='cal_div']//a[1]"));
		js.executeScript("arguments[0].click()",Calculatebutton );
		  
		    
		    //validation &update results in excel
		    
		  String actual_value= driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
		  
		  if(Double.parseDouble(exp_value) ==Double.parseDouble(actual_value))
		  {
			  System.out.println("Test Passed");
			  ExcelUtilities.setCellData(file, "Sheet1", i, 7, "passed");
			  ExcelUtilities.fillGreencolor(file, "Sheet1", i, 7);
		  }
		    
		  else  
		  {
			  System.out.println("Test failed");
			  ExcelUtilities.setCellData(file, "Sheet1", i, 7, "failed");
			  ExcelUtilities.fillRedcolor(file, "Sheet1", i, 7);
			  
		  }
		  
		  Thread.sleep(3000);
		  
		  WebElement clearbutton=  driver.findElement(By.xpath("//div[@class='PT25']//a[2]"));
		  js.executeScript("arguments[0] .click()", clearbutton);
		  
		 
	  }
	   
	   
	   
	   

	}

	
	}



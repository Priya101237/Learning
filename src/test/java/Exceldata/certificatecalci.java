package Exceldata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class certificatecalci {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		
	  String file=	System.getProperty("user.dir")+"\\testdata\\Copy of certificatecalci.xlsx";
	 int rows=  practiceutilities.getRowCount(file,"Sheet1");
	 
	 for( int i=1;i<=rows; i++)
	 {
		String InitialDepositeamount= practiceutilities.getCellData(file, "Sheet1",i, 0);
		String InterestRate= practiceutilities.getCellData(file, "Sheet1",i, 1);
		String LengthMonths= practiceutilities.getCellData(file, "Sheet1",i, 2);
		//String Compounding= practiceutilities.getCellData(file, "Sheet1",i, 3);
		String exp_value= practiceutilities.getCellData(file, "Sheet1",i, 3);
		
	WebElement initial=	driver.findElement(By.xpath("//input[@id='mat-input-0']"));
	initial.clear();
	initial.sendKeys(InitialDepositeamount);
	
	WebElement intrate=	driver.findElement(By.id("mat-input-1"));
	intrate.clear();
	intrate.sendKeys(InterestRate);
	
	WebElement months=driver.findElement(By.id("mat-input-2"));
	months.clear();
	months.sendKeys(LengthMonths);
	
	/*
	
	Thread.sleep(3000);
	
	List<WebElement>  cmp =driver.findElements(By.xpath("//div[@role='listbox'] [@id='mat-select-0-panel']//mat-option"));
	System.out.println("Number of list :" + cmp.size());
	
	for(int j=0; j<cmp.size();j++)
	{
		System.out.println(cmp.get(i).getText()); */
	
	
         driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
         
         /*
	
	        JavascriptExecutor js=driver;
			WebElement letsrunthebutton= driver.findElement(By.xpath("//div[@class='mdc-button__ripple']"));
			js.executeScript("arguments[0].click()",letsrunthebutton ); */
			
		    
		    //validation &update results in excel
		    
		  String actual_value= driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
		  
		  if(exp_value.equals(actual_value))
		  {
			  System.out.println("Test Passed");
			  ExcelUtilities.setCellData(file, "Sheet1", i, 5, "passed");
			  ExcelUtilities.fillGreencolor(file, "Sheet1", i, 5);
		  }
		    
		  else  
		  {
			  System.out.println("Test failed");
			  ExcelUtilities.setCellData(file, "Sheet1", i, 5, "failed");
			  ExcelUtilities.fillRedcolor(file, "Sheet1", i, 5);
			  
		  }
		  
		 
	  }
	   

	 }
		

	}



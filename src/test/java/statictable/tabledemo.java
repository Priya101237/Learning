package statictable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabledemo {

	public static void main(String[] args) {

      ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    driver.get("https://testautomationpractice.blogspot.com/");

	    driver.manage().window().maximize();

	    //total number of rows

	     int rows=   driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //preferred

	    	// int rows=  driver.findElements(By.tagName("tr")).size(); //prefered only if you have one single table
	      System.out.println("Number of rows " +rows);

	    //total number of colums

	    int cols=  driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	     System.out.println("Number of colums " + cols);

	    //Read specific rows and  colums data

	    String value =driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[2]")).getText();
	    System.out.println(value);
	    //read data from all the rows and colums

	    System.out.println("BookName "  +"Author  "+"Subject  " +"price");

	    for(int r=2;r<=rows;r++)
	    {
	    	for(int c=1;c<=cols;c++)
	    	{
	    	 	String Values= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
	    	 	System.out.print(Values +"   ");
	    	}

	    	System.out.println();
	    }


	    //print book names whose author is Amit

	    for(int r=2;r<=rows;r++)
	    {
	    	String Author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();

	    	if(Author.equals("Amit"))
	    	{
	    		String Bookmark=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
	    		System.out.println(Author+ "    " +Bookmark);
	    	}

	    }


	    //find sum of all price of books

	    int sum=0;

	    for(int r=2;r<=rows;r++)
	    {
	    String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
	    sum=sum+Integer.parseInt(price);
	    }
          System.out.println("sum of book prices " +sum);
	}

}

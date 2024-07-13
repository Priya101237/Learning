package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class brokenlinkexp {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();

		
	java.util.List<WebElement> links=	driver.findElements(By.tagName("a"));
	System.out.println("Total number of liks :" +links.size());

	int brokerlinks=0;

     for(WebElement linkele:links)
     {
    	 /*
    	 String targetlink =linkele.getAttribute("href");
    	 System.out.println(targetlink); */

    	 String hrefattribute =linkele.getAttribute("href");

    	 if(hrefattribute==null || hrefattribute.isEmpty())
    	 {
    		 System.out.println("href attribute value is empty");
    		 continue;
    	 }

    	 URL linkurl=new URL(hrefattribute); //cconvert string -url format

    	 //send reuest to server- open ,connect

    HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection();
    conn.connect();

   if( conn.getResponseCode()>=400)
   {
	   System.out.println(hrefattribute +"  " +"===>Broken Link");
	   brokerlinks++;
   }

   else

   {
	   System.out.println(hrefattribute +"  " +"===>notBroken Link");
   }

     }

     System.out.println("total number of broken links " +brokerlinks);
















     }






	}



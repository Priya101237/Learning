package Exceldata;

import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class datawritingintoexcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\mydata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
	   XSSFSheet sheet =workbook.createSheet();
	   
	   /*
	   
    	XSSFRow row1=sheet.createRow(0);
	   
    	row1.createCell(0).setCellValue("welcome");
    	row1.createCell(1).setCellValue("welcome1");
    	row1.createCell(2).setCellValue("welcome2");
    	
    	XSSFRow row2=sheet.createRow(0);
	   
    	row2.createCell(0).setCellValue("abc");
    	row2.createCell(1).setCellValue("xyz");
    	row2.createCell(2).setCellValue("rtr"); */
	   
	   Scanner sc=new Scanner(System.in);
	   
	   for(int r=0;r<=4;r++)
	 {   
		   
       XSSFRow Currentrow=sheet.createRow(r);
	   
		   for(int c=0;c<2;c++)
		   {
			   //Currentrow.createCell(c).setCellValue("welcome");
			   
			   System.out.println("Enter value:");
			 String value=  sc.next();
			 Currentrow.createCell(c).setCellValue(value);
		   }
	   }
	   
	   
	   
	   
	   
	   
	   
	   workbook.write(file);
	   workbook.close();
       file.close();
       System.out.println("workbook is done !!!");
	}

}

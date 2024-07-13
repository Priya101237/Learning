package Exceldata;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadigExcel {

	public static void main(String[] args) throws IOException {
		
		//Excelfile->workbook->sheet->rows->Cells
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\\\testdata\\\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
	     int numbrofrows=sheet.getLastRowNum();
	     int numberofcells=  sheet.getRow(0).getLastCellNum();
	     
	    System.out.println("total number of rows  "+ numbrofrows);
	    System.out.println("total number of cells "+ numberofcells);
	    
	    for(int r=0 ;r<=numbrofrows;r++)
	    {
	    	XSSFRow currentrow= sheet.getRow(r);
	    	for(int c=0;c<numberofcells;c++)
	    	{
	    		String value=currentrow.getCell(c).toString();
	            System.out.print(value+"   ");
	    	}
	    	
	    	System.out.println();
	    }
	   
	    workbook.close();
	    file.close();
	     
	}

}

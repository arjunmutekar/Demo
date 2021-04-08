package MethodLib;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelSheet {
	
	//1. Create an Excel file
    //  WritableWorkbook myFirstWbook = null;
	
	/****************************************************
	Project Name: BMW

	Method Lib: MethodLib

	Method Name: XL

	Method Description : This Method does the function of extracting and saving "Top speed in in excel sheet ".

	Date of creation : 20-Apr-2020

	Author : Karishma Netake 855410

	****************************************************/
	@Test
    public static void XL(WebDriver driver) throws IOException, RowsExceededException, WriteException {
		FileReader fr2=new FileReader("C:/Users/Karishma/eclipse-workspace/BMW/src/test/java/Objrep/obj.properties");
		Properties obje=new Properties();
		obje.load(fr2);
		String speed= driver.findElement(By.xpath(obje.getProperty("speed"))).getText();
		System.out.println(speed);
		String EXCEL_FILE_LOCATION ="//C://Users//Karishma//eclipse-workspace//BMW//src//test//java//FileUtillities//bmw.xls";
          WritableWorkbook     myFirstWbook = Workbook.createWorkbook(new File(EXCEL_FILE_LOCATION));

          // create an Excel sheet
          WritableSheet excelSheet = myFirstWbook.createSheet("Sheet 1", 0);

          // write to the Excel sheet
         
          Label labl1 = new Label(0,0,"Speed");
  		
  		excelSheet.addCell(labl1);
  		
  		WritableCell lab2=new Label(1,0,speed);
  		excelSheet.addCell(lab2);
  		
  		myFirstWbook.write();
  		myFirstWbook.close();
         
          
  		
    }
	
	
	

}

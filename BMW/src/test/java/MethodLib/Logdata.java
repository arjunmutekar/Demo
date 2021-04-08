package MethodLib;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;

public class Logdata {
	
	/****************************************************
	Project Name: BMW

	Method Lib: MethodLib

	Method Name: Logdata

	Method Description : This Method does the function of extracting and saving "Date and Time" in a text document.

	Date of creation : 20-Apr-2020

	Author : Karishma Netake 855410

	****************************************************/
	
	
	public static void Logdata(WebDriver driver) throws IOException{
		 Calendar c= Calendar.getInstance();
		 System.out.println(c);
		 java.util.Date s= c.getTime();
		 System.out.println(s);
		 String a = bmwMethods.Speed(driver).getText();
		  FileWriter fw= new FileWriter("C:\\Users\\Karishma\\eclipse-workspace\\BMW\\src\\test\\java\\Logdata\\Logdata.txt");
		 fw.write("the execution date and time:" +s);
		 fw.write("Top speed" +a);
		 
		 
			fw.close();
	 }
	

}

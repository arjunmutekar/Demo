package MethodLib;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Speed {
	public static WebElement el = null;
	
	/****************************************************
	Project Name: BMW

	Method Lib: MethodLib

	Method Name: Speed

	Method Description : This Method does the function of retreiving "Top Speed" from the Techincal specifications page.

	Date of creation : 20-Apr-2020

	Author : Karishma Netake 855410

	****************************************************/
	public static WebElement Speed(WebDriver driver) throws IOException 
	{
		FileReader fr2=new FileReader("C:/Users/Karishma/eclipse-workspace/BMW/src/test/java/Objrep/obj.properties");
		Properties obje=new Properties();
		obje.load(fr2);
		el =driver.findElement(By.xpath(obje.getProperty("speed")));
		return el;	
	}

}

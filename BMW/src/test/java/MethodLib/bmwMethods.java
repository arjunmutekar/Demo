package MethodLib;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class bmwMethods {
		
	
public static WebElement el = null;
	
	
	
	public static WebElement models(WebDriver driver) throws IOException
	{
		FileReader fr2=new FileReader("C:/Users/Karishma/eclipse-workspace/BMW/src/test/java/Objrep/obj.properties");
		Properties obje=new Properties();
		obje.load(fr2);
		
	    el = driver.findElement(By.xpath(obje.getProperty("model")));
		
		if(driver.findElement(By.xpath(obje.getProperty("model"))).isDisplayed()) {
			System.out.println("validated");
		}
		else 
		{
			System.out.println("not validated");
		}
		return el;
	}
	
	
	public static WebElement Seven(WebDriver driver) throws IOException
	{
		FileReader fr2=new FileReader("C:/Users/Karishma/eclipse-workspace/BMW/src/test/java/Objrep/obj.properties");
		Properties obje=new Properties();
		obje.load(fr2);
		 el = driver.findElement(By.xpath(obje.getProperty("seven")));
		return el;
	}
	public static WebElement Series(WebDriver driver) throws IOException
	 {
		FileReader fr2=new FileReader("C:/Users/Karishma/eclipse-workspace/BMW/src/test/java/Objrep/obj.properties");
		Properties obje=new Properties();
		obje.load(fr2);
		// TODO Auto-generated method stub
		el =driver.findElement(By.xpath(obje.getProperty("series")));
		return el;
		
	}
	
	public static WebElement findmore(WebDriver driver) throws IOException 
	{
		FileReader fr2=new FileReader("C:/Users/Karishma/eclipse-workspace/BMW/src/test/java/Objrep/obj.properties");
		Properties obje=new Properties();
		obje.load(fr2);
		el =driver.findElement(By.xpath(obje.getProperty("fmore")));
		return el;	
	}
	
	public static WebElement Technical(WebDriver driver) throws IOException 
	{
		FileReader fr2=new FileReader("C:/Users/Karishma/eclipse-workspace/BMW/src/test/java/Objrep/obj.properties");
		Properties obje=new Properties();
		obje.load(fr2);
		el =driver.findElement(By.xpath(obje.getProperty("technical")));
		
		if(driver.findElement(By.xpath(obje.getProperty("technical"))).isDisplayed()) {
			System.out.println("validated");
		}
		else 
		{
			System.out.println("not validated");
		}
		return el;
		
	}
	
	public static WebElement Speed(WebDriver driver) throws IOException 
	{
		FileReader fr2=new FileReader("C:/Users/Karishma/eclipse-workspace/BMW/src/test/java/Objrep/obj.properties");
		Properties obje=new Properties();
		obje.load(fr2);
		el =driver.findElement(By.xpath(obje.getProperty("speed")));
		return el;	
	}
	
	public static void Assert(WebDriver driver) throws InterruptedException, IOException
	{
		  String actSpeed =  bmwMethods.Speed(driver).getText();
		  int actualSpeed =  Integer.parseInt(actSpeed);
	  		
		  Assert.assertFalse(actualSpeed<=500,"requirements don't meet");
	  		
	}
	
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
	public static void Close(WebDriver driver) 
	{
		driver.close();
		driver.quit();
	}
	
}

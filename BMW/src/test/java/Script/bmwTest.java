package Script;

import org.testng.annotations.Test;

import java.awt.Image;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import MethodLib.Assert;
import MethodLib.ExcelSheet;
import MethodLib.Logdata;
import MethodLib.Models;

import MethodLib.Seven;
import MethodLib.Speed;
import MethodLib.Technical;

import MethodLib.Imageclk;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/****************************************************
Project Name: BMW

Script Name: bmwTest

Script Description: 

Author : Karishma netake 855410

Date of creation : 20-Apr-2020

Function Lib Name and path: MethodLib (Path:C:\Users\Karishma\eclipse-workspace\BMW\src\test\java\MethodLib)

****************************************************/

@Test
public class bmwTest {
  public void bmwrun() throws IOException, InterruptedException, RowsExceededException, WriteException {
	  
	  System.setProperty("webdriver.gecko.driver", "C:./driver/geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	   
	   FileReader fr2=new FileReader("C:/Users/Karishma/eclipse-workspace/BMW/src/test/java/Objrep/obj.properties");
		Properties obje=new Properties();
		obje.load(fr2);
	   driver.get(obje.getProperty("url"));
	   
	   Models.models(driver).click();
	   
	   File scrsh1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrsh1,new File("C:\\Users\\Karishma\\eclipse-workspace\\BMW\\src\\test\\java\\FileUtillities\\Screenshot1.png"));
		
		Seven.Seven(driver).click();
	   File scrsh2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrsh2,new File("C:\\Users\\Karishma\\eclipse-workspace\\BMW\\src\\test\\java\\FileUtillities\\Screenshot2.png"));
		
		
		
		Imageclk.img(driver).click();
	   File scrsh4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrsh4,new File("C:\\Users\\Karishma\\eclipse-workspace\\BMW\\src\\test\\java\\FileUtillities\\Screenshot4.png"));
		
		Technical.Technical(driver).click();
	   File scrsh5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrsh5,new File("C:\\Users\\Karishma\\eclipse-workspace\\BMW\\src\\test\\java\\FileUtillities\\Screenshot5.png"));
	   
		String a = Speed.Speed(driver).getText();
	   System.out.println(a);
	   
	   
	   Logdata.Logdata(driver);
	   ExcelSheet.XL(driver);
		driver.close();
		
   	 }
  
 
  
  
  public void Assertmethod() throws IOException, InterruptedException {
	  WebDriver driver=new FirefoxDriver();
	  Assert.Assert(driver);
	
	
  }
     
}

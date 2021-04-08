package MethodLib;

import static org.testng.AssertJUnit.assertFalse;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Assert {
	
	/****************************************************
	Project Name: BMW

	Method Lib: MethodLib

	Method Name: Assert

	Method Description : This Method does the function of comparing "Actual speed with the given speed" using assert.

	Date of creation : 20-Apr-2020

	Author : Karishma Netake 855410

	****************************************************/
	
	public static void Assert(WebDriver driver) throws InterruptedException, IOException
	{
		  String actSpeed =  Speed.Speed(driver).getText();
		  int actualSpeed =  Integer.parseInt(actSpeed);
	  		
		  Assert.assertFalse(actualSpeed<=500,"requirements don't meet");
	  		
	}

	private static void assertFalse(boolean b, String string) {
		// TODO Auto-generated method stub
		
	}

}

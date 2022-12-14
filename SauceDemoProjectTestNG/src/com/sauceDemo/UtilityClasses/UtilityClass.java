package com.sauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		Date date = new Date();
		DateFormat d = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String newDate =d.format(date);
		

		TakesScreenshot t = (TakesScreenshot)driver;
		
		File sourceFile = t.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\ScreenShot\\"+newDate+"LoginPage.jpg");
		FileHandler.copy(sourceFile, destFile);
		
		
		
	}

}

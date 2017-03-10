package com.indeed.tests;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Utility {
	
	public static String captureScreenshot(WebDriver driver,String screenshotName)
	{
	 
	try 
	{
	TakesScreenshot ts=(TakesScreenshot)driver;
	 
	File source=ts.getScreenshotAs(OutputType.FILE);
	
	String dest = "D:\\Work\\Workspace\\selenium\\screenshots\\"+screenshotName+".png";
	File destination  = new File(dest);
	 
	FileUtils.copyFile(source, destination);
	
	return dest;
	} 
	catch (Exception e)
	{
	 
	System.out.println("Exception while taking screenshot "+e.getMessage());
	return e.getMessage();
	} 
	}

}
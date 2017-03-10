package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingStrategies {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaga60\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.indeed.co.uk/");
	      Thread.sleep(2000);
	      
	      //By ID
	      //driver.findElement(By.id("what")).sendKeys("selenium");
	      
	     // Thread.sleep(2000);
	      //By Name
	      //driver.findElement(By.name("l")).clear();
	      //driver.findElement(By.name("l")).sendKeys("London");
	      
	     // Thread.sleep(2000);
	      //By link text
	      //driver.findElement(By.linkText("Upload your CV")).click();
	      
	      //By partial link text
	      //driver.findElement(By.partialLinkText("Post Job")).click();
	      
	      //By xpath
	    // String src = driver.findElement(By.xpath("//img[@title='Indeed job search']")).getAttribute("src");
	      //System.out.println(src);
	      
	      //By css selector
		    // String src = driver.findElement(By.cssSelector("input.input_submit")).getAttribute("value");
		     // System.out.println(src);
	      
	      //Find all elements by tag name
	      System.out.println(driver.findElements(By.tagName("a")).size());
	      
	    //Find all elements by class name
	      System.out.println(driver.findElements(By.className("input_text")).size());
	      
	      //Click on first link
	      driver.findElement(By.tagName("a")).click();
	      
	 
	}

}

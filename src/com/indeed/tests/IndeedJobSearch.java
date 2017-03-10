package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IndeedJobSearch {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
      DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
      ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
      //System.setProperty("webdriver.ie.driver", "F:\\selenium\\IEDriverServer.exe");
      //WebDriver driver = new InternetExplorerDriver(ieCapabilities);
      
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaga60\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.indeed.co.uk/");
      Thread.sleep(2000);
      
      driver.findElement(By.id("what")).sendKeys("selenium");
      driver.findElement(By.id("where")).clear();
      driver.findElement(By.id("where")).sendKeys("London");
      driver.findElement(By.id("fj")).click();
      
      System.out.println(driver.getTitle());
      System.out.println(driver.findElement(By.id("searchCount")).getText());
      
	}

}

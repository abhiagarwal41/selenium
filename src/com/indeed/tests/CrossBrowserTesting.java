package com.indeed.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	
	@Test 
	// Here this parameters we will take from testng xml
	@Parameters("Browser")
	public  void verifyTitle(String browser) {
	 
	if(browser.equalsIgnoreCase("firefox")){
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\aaga60\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
	 driver=new FirefoxDriver();
	 
	}
	else if(browser.equalsIgnoreCase("chrome")){
	 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaga60\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
    driver=new ChromeDriver();
	
	}
	 
	//driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());
	 
	driver.quit();
	
	}

}

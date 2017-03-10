package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtility {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url){
		
		switch(browserName){
		
		case "chrome": 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaga60\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		
		case "firefox":
			driver = new FirefoxDriver();
			
		case "ie":
			driver = new InternetExplorerDriver();
			
		}
		
		driver.get(url);
		driver.manage().window().maximize();
			
		return driver;
	}

}

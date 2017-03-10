package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageObjectModelDemo {

	@Test
	public void verifyValidLogin()
	{
    
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaga60\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://demosite.center/wordpress/wp-login.php");
	 
	LoginPage login=new LoginPage(driver);
	 
	 
	 
	login.loginToWordpress("admin","Demo123");
	 
	 
	driver.quit();
	 
	}
	
}

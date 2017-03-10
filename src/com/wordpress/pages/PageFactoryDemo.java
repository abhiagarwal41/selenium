package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utility.BrowserUtility;


public class PageFactoryDemo {
	
	/*@Test
	public void checkValidUser()
	{

	// This will launch browser and specific url 
	//WebDriver driver=BrowserUtility.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaga60\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		 
	driver.manage().window().maximize();
		 
	driver.get("http://demosite.center/wordpress/wp-login.php");
		
	// Created Page Object using Page Factory
	LoginPageFactory login_page=PageFactory.initElements(driver, LoginPageFactory.class);

	// Call the method
	login_page.login_wordpress("admin", "demo123");
	
	driver.quit();

	}*/
	
	@Test
	public void checkNewPost()
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaga60\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		 
	driver.manage().window().maximize();
		 
	driver.get("http://demosite.center/wordpress/wp-login.php");
	
	LoginPageFactory login_page=PageFactory.initElements(driver, LoginPageFactory.class);

	// Call the method
	login_page.login_wordpress("admin", "demo123");
		
	// Created Page Object using Page Factory
	DashboardFactory dashboard_page=PageFactory.initElements(driver, DashboardFactory.class);

	// Call the method
	dashboard_page.createPost("dummy title", "dummy body");
	String message = dashboard_page.getMessage();
	Assert.assertEquals(message.trim(), "Post published. View post");
	driver.quit();

	}


}

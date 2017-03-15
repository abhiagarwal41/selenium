package com.indeed.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.ConfigReader;
import com.wordpress.pages.LoginPage;

public class DataDrivenTesting {
	
	WebDriver driver;
	ConfigReader reader; 
	
	@BeforeMethod
	public void setup(){
		reader = new ConfigReader();
		System.setProperty("webdriver.chrome.driver", reader.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "getData")
	public void doLogin(String username, String password){
		 
		driver.get(reader.getAppUrl());
		 
		LoginPage login=new LoginPage(driver);
		  
		login.loginToWordpress(username,password);
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "user unable to login");
		System.out.println("successful login");
	}
	
	@AfterMethod
	public void QuitTC(){
	// close browser after execution
	driver.quit();
	}
	
	@DataProvider
	public Object[][] getData(){
		ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\aaga60\\workspace\\selenium\\TestData\\testdata.xlsx");
		int rowCount = config.getRowCount(0);
		Object[][] data =  new Object[rowCount][2];
		for(int i=1;i<=rowCount;i++){
			data[i-1][0]=config.getData(0, i, 0);
			data[i-1][1]=config.getData(0, i, 1);
		}
		
		return data;
	}

}

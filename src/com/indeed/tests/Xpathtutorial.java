package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Xpathtutorial {
	
	/*@Test
	public void checkElementsBasic(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaga60\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://demosite.center/wordpress/wp-login.php");
	      Assert.assertTrue(driver.findElement(By.xpath("//input[@class='input' and @type='password']")).isDisplayed());
	      Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@type,'passw')]")).isDisplayed());
	      Assert.assertTrue(driver.findElement(By.xpath("//label[contains(text(),'Password')]")).isDisplayed());
	      
	      driver.quit();
	}*/
	
	@Test
	public void checkElementsAdvanced(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaga60\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://google.com");
	      System.out.println(driver.findElements(By.tagName("a")).size());
	      System.out.println(driver.findElements(By.xpath("//div[@id='_eEe']/a")).size());
	      System.out.println(driver.findElements(By.xpath("//div[@id='_eEe']//following::a")).size());
	      Assert.assertTrue(driver.findElement(By.xpath("//div[@id='_eEe']//following::a[2]")).isDisplayed());
	      System.out.println(driver.findElement(By.xpath("//div[@id='_eEe']//following::a[1]")).getAttribute("data-ved"));
	 
	      //refer xpath axes
	      
	      driver.get("http://demosite.center/wordpress/wp-login.php");
	      System.out.println(driver.findElement(By.xpath("//*[@id='wp-submit']//preceding::input[1]")).getAttribute("value"));
	      driver.quit();
	      
	      
	}


}

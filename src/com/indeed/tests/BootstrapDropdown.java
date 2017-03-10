package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BootstrapDropdown {

 @Test
 public void fetchDropdownValues(){
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaga60\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
     List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
     for(WebElement element:menus){
    	 System.out.println(element.getAttribute("innerHTML"));
     }
     driver.quit();
 }
 
 @Test
 public void fetchRadioButtons(){
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaga60\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
     List<WebElement> menus = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
     for(WebElement element:menus){
    	 System.out.println(element.getAttribute("value"));
     }
     driver.quit();
 }

}

package com.indeed.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaga60\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	      driver.findElement(By.name("proceed")).click();
	      
	      Alert alert = driver.switchTo().alert();
	      System.out.println(alert.getText());
	      Thread.sleep(2000);
	      alert.accept();
	      
	      driver.switchTo().defaultContent();

	}

}

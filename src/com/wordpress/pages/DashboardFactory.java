package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardFactory {
	
	WebDriver driver;


	public DashboardFactory(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='menu-posts']")
	@CacheLookup
	WebElement posts;
	
	@FindBy(how=How.XPATH,using=".//a[@href='post-new.php' and @tabindex='1']")
	@CacheLookup
	WebElement add_new;
	
	@FindBy(how=How.XPATH,using=".//*[@id='title']")
	@CacheLookup
	WebElement title;
	
	@FindBy(how=How.XPATH,using=".//*[@id='content_ifr']")
	@CacheLookup
	WebElement body;
	
	@FindBy(how=How.XPATH,using=".//*[@id='publish']")
	@CacheLookup
	WebElement publish_button;
	
	@FindBy(how=How.XPATH,using=".//*[@id='message']")
	@CacheLookup
	WebElement message;
	
	public void createPost(String _title, String _body){
		posts.click();
		add_new.click();
		title.sendKeys(_title);
		body.sendKeys(_body);
		publish_button.click();
	}
	
	public String getMessage(){
		return message.getText();
	}

}

package com.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(com.listeners.ListenerDemo.class) -> one way to add listener , another is to add at suite level in testng xml
public class DemoTestClass {
   
	@Test
	public void firstTest(){
		Assert.assertTrue(true);
	}
	
	@Test
	public void secondTest(){
		Assert.fail();
	}
}

package com.indeed.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestNGtutorial {

	

	/**
	 * @param args
	 */
	@BeforeSuite
	   public void beforeSuite(){
		   //open browser etc
		   System.out.println("before suite");
	   }
	   
	   @AfterSuite
	   public void afterSuite(){
		   //open browser etc
		   System.out.println("after suite");
	   }
	
	   @BeforeTest
	   public void beforeTest(){
		   //open browser etc
		   System.out.println("before test");
	   }
	   
	   @AfterTest
	   public void afterTest(){
		   //open browser etc
		   System.out.println("after test");
	   }
	   
	   @BeforeMethod
	   public void beforeMethod(){
		   System.out.println("xxxxxxxxxx");
	   }
	   
	   @AfterMethod
	   public void afterMethod(){
		   System.out.println("xxxxxxxxxx");
	   }
	
		
		@Test(priority=1)
		public void doLogin(){
			System.out.println("Login test done");
			//throw new SkipException("reason to skip this test"); //adding this line skips this test case
		}
		
		@Test(priority=2,dependsOnMethods={"doLogin"})  //dependency ensures if login test is skipped, then logout will also be skipped
		public void doLogout(){
			System.out.println("Logout test done");
		}
		
		@Test(priority=3)
		public void checkTwoValues(){
			System.out.println("checkTwoValues");
			int actual = 10;
			int expected = 10;
			Assert.assertEquals(actual, expected);
		}
		
		@Test(priority=4)
		public void checkTrue(){
			System.out.println("checkTrue");
			int a = 10;
			int b = 12;
			Assert.assertTrue(a>b, "Condition failed");
		}
		
		@Test(priority=5)
		public void compulsoryFail(){
			System.out.println("compulsoryFail");
			Assert.fail("test failed");
		}
		
		@Test(priority=6)
		public void softAssertExample(){
			SoftAssert softAssert  = new SoftAssert();
			softAssert.assertEquals("a", "c");
			System.out.println("method continues even after failing"); //If Assert was used, s.o.p line would not execute
			softAssert.assertAll();

		}
		
		

	

}

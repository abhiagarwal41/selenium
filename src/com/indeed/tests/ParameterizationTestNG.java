package com.indeed.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTestNG {
	
	
	@Test(dataProvider = "getData")
	public void doLogin(String username, String password, String browser){
		System.out.println("Login test done for "+username+" "+password+" "+browser);
	}
	
	@DataProvider(parallel=true) //setting parallel true is optional which results in parallel execution
	public Object[][] getData(){
		Object[][] data =  new Object[2][3];
		data[0][0] = "user1";
		data[0][1] = "pass1";
		data[0][2] = "mozilla";
		
		data[1][0] = "user2";
		data[1][1] = "pass2";
		data[1][2] = "chrome";
		
		return data;
	}

}

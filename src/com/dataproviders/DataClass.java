package com.dataproviders;

import org.testng.annotations.DataProvider;

import com.indeed.tests.ExcelDataConfig;

public class DataClass {
	
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

package com.indeed.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDemo {
	
	@Test
	public void readExcelBasicApachePOI() throws Exception{
		
		File file = new File("C:\\Users\\aaga60\\Downloads\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		
		for(int i = 1;i<=rowCount;i++){
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
			System.out.println(sheet.getRow(i).getCell(1).getStringCellValue());
		}
		workbook.close();
		
	}
	
	@Test
	public void writeExcelBasicApachePOI() throws Exception{
		
		File file = new File("C:\\Users\\aaga60\\Downloads\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		sheet.getRow(1).createCell(2).setCellValue("Pass");
		sheet.getRow(2).createCell(2).setCellValue("Fail");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
	}
	
	@Test
	public void readExcelUserLibrary(){
		ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\aaga60\\Downloads\\testdata.xlsx");
		System.out.println(config.getData(0, 0, 0));
	}

}

package com.indeed.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	public ExcelDataConfig(String excelPath) {
		// TODO Auto-generated constructor stub
		try {
			File file = new File(excelPath);
			FileInputStream fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
	
	public String getData(int sheetIndex, int row, int column){
		
		sheet = workbook.getSheetAt(sheetIndex);
		return sheet.getRow(row).getCell(column).getStringCellValue();
	}
	
    public int getRowCount(int sheetIndex){
		
		return workbook.getSheetAt(sheetIndex).getLastRowNum();
	}

}

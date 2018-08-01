package com.actitime.genericlib;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {
	String excelPath="./TestData/apacheTestData.xlsx";
    String propertyFilePath="./TestData/TestData.properties";
	public Properties getPropertiesFileObj()throws Throwable{	
		FileInputStream fis=new FileInputStream(propertyFilePath);
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj;
	}
public String getExcelData(String sheetName,int rowNum,int culNum) throws Throwable{
	FileInputStream fis=new FileInputStream(excelPath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh= wb.getSheet(sheetName);
	Row row=sh.getRow(rowNum);
	String data=row.getCell(culNum).getStringCellValue();
	
	return data;
	
}
public void setExcelData(String sheetName,int rowNum,int colNum,String Data) throws Throwable {
	FileInputStream fis=new FileInputStream(excelPath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row row=sh.getRow(rowNum);
	Cell cel=row.createCell(colNum);
	cel.setCellValue(Data);
	FileOutputStream fos=new FileOutputStream(excelPath);
	wb.write(fos);
	wb.close();
}













}

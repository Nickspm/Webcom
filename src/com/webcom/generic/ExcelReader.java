package com.webcom.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public static String getCellValue(String path,String sheet,int row,int colloum){
	String value = "";
	try {
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		value = wb.getSheet(sheet).getRow(row).getCell(colloum).getStringCellValue();
	} catch (Exception e) {
		e.printStackTrace();
	} 
	return value;
	} 
public static int getRowCount(String path,String sheet){
	int row = 0;
	Workbook wb;
	try {
		wb = WorkbookFactory.create(new FileInputStream(path));
		row = wb.getSheet(sheet).getLastRowNum();
	} catch (Exception e) {
	
}
 return row;
}
}

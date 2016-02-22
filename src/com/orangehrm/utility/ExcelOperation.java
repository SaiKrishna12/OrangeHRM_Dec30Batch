package com.orangehrm.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {
	
	public int getRowCount(String path,int sheetno) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(sheetno);
		int rowCount=ws.getLastRowNum();
		return rowCount;
	}
	
	public Row getRow(String path,int sheetno,int rowno) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(sheetno);
		Row r=ws.getRow(rowno);
		return r;
		
	}
	
	public String getCellData(String path,int sheetno,int rowno,int colno) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(sheetno);
		String data=ws.getRow(rowno).getCell(colno).getStringCellValue();
		return data;
	}
	
	
	
	
	

}

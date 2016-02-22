package com.orangehrm.baseclass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pom.AddEmployeePage;
import com.orangehrm.pom.Menu;

public class AddEmployee  extends Constants{
	
	@Test
	public void addEmpTest() throws IOException
	{
		String runMode=eo.getCellData(dataEngine,0,2 ,2);
		if(runMode.equals("N"))
		{
			throw new SkipException("AddEmp test case skipped");
		}
		else
		{
		AddEmployeePage aep=PageFactory.initElements(driver,AddEmployeePage.class);
		Menu menu=PageFactory.initElements(driver,Menu.class);
		
		int rowCount=eo.getRowCount(empList,0);
		for(int i=1;i<=rowCount;i++)
		{
			menu.pim();
			Sleeper.sleepTightInSeconds(10);
			Row r=eo.getRow(empList,0,i);
			aep.addEmployee(r);
		}
		}
	}

}

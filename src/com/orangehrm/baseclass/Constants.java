package com.orangehrm.baseclass;

import org.openqa.selenium.WebDriver;

import com.orangehrm.utility.ExcelOperation;
import com.orangehrm.utility.Screenshots;

public class Constants {
	
	static WebDriver driver=null;
	ExcelOperation eo=new ExcelOperation();
	Screenshots sc=new Screenshots();
	String empList="E:\\Dec30Batch\\OrangeHRM\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
	String scrShotPath="E:\\Dec30Batch\\OrangeHRM\\src\\com\\orangehrm\\screenshots";
	String dataEngine="E:\\Dec30Batch\\OrangeHRM\\src\\com\\orangehrm\\excelfiles\\DataEngine.xlsx";
	
}

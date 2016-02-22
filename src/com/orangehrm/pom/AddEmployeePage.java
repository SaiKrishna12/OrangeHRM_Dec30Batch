package com.orangehrm.pom;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePage {
	@FindBy(linkText="Add Employee")
	WebElement addEmp;
	@FindBy(id="firstName")
	WebElement firstName;
	@FindBy(id="middleName")
	WebElement middleName;
	@FindBy(id="lastName")
	WebElement lastName;
	@FindBy(id="employeeId")
	WebElement employeeId;
	@FindBy(id="chkLogin")
	WebElement chkLogin;
	@FindBy(id="user_name")
	WebElement user_name;
	@FindBy(id="user_password")
	WebElement user_password;
	@FindBy(id="re_password")
	WebElement re_password;
	@FindBy(id="status")
	WebElement status;
	@FindBy(id="btnSave")
	WebElement btnSave;
	public void addEmployee(Row r)
	{
		addEmp.click();
		Sleeper.sleepTightInSeconds(4);
		firstName.sendKeys(r.getCell(0).getStringCellValue());
		middleName.sendKeys(r.getCell(1).getStringCellValue());
		lastName.sendKeys(r.getCell(2).getStringCellValue());
		employeeId.sendKeys(r.getCell(3).getStringCellValue());
		if(r.getCell(4).getStringCellValue().equals("Y"))
		{
			if(!chkLogin.isSelected())
			{
				chkLogin.click();
			}
			user_name.sendKeys(r.getCell(5).getStringCellValue());
			user_password.sendKeys(r.getCell(6).getStringCellValue());
			re_password.sendKeys(r.getCell(7).getStringCellValue());
			status.sendKeys(r.getCell(8).getStringCellValue());
		}
		else
		{
			if(chkLogin.isSelected())
			{
				chkLogin.click();
			}
		}
		btnSave.click();
		
	}
	
	
	
	
	
	
	
	

}

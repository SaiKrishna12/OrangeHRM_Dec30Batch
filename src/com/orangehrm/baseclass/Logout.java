package com.orangehrm.baseclass;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pom.Menu;

public class Logout  extends Constants{
	
	@Test
	public void logoutTest() throws IOException
	{
		String runMode=eo.getCellData(dataEngine,0,4 ,2);
		if(runMode.equals("N"))
		{
			throw new SkipException("Logout test case skipped");
		}
		Menu menu=PageFactory.initElements(driver,Menu.class);
		menu.logout();
	}

}

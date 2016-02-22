package com.orangehrm.baseclass;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orangehrm.pom.LoginPage;

public class Login extends Constants{
	@Parameters("browser")
	@Test
	public void loginTest(String b) throws IOException
	{
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://opensource.demo.orangehrm.com/");
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		String runMode=eo.getCellData(dataEngine,0,1 ,2);
		if(runMode.equals("N"))
		{
			throw new SkipException("Login test case skipped");
		}
		lp.loginPanel("Admin","admin");
	}

}

package com.orangehrm.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class Menu {
	@FindBy(id="welcome")
	WebElement welcome;
	@FindBy(linkText="About")
	WebElement about;
	@FindBy(linkText="Logout")
	WebElement logout;
	public void logout()
	{
		Sleeper.sleepTightInSeconds(10);
		welcome.click();
		Sleeper.sleepTightInSeconds(5);
		logout.click();
	}
	public void about()
	{
		welcome.click();
		about.click();
	}
	
	
	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']/b")
	WebElement admin;
	public void admin()
	{
		admin.click();
	}
	
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")
	WebElement pim;
	public void pim()
	{
		pim.click();
	}
	@FindBy(xpath="//*[@id='menu_leave_viewLeaveModule']/b")
	WebElement leave;
	public void leave()
	{
		leave.click();
	}
	
	@FindBy(xpath="//*[@id='menu_time_viewTimeModule']/b")
	WebElement time;
	public void time()
	{
		time.click();
	}
	@FindBy(xpath="//*[@id='menu_recruitment_viewRecruitmentModule']/b")
	WebElement recruitment;
	public void recruitment()
	{
		recruitment.click();
	}
	@FindBy(xpath="//*[@id='menu__Performance']/b")
	WebElement performance;
	public void performance()
	{
		performance.click();
	}
	@FindBy(xpath="//*[@id='menu_dashboard_index']/b")
	WebElement dashboard;
	public void dashboard()
	{
		dashboard.click();
	}

}

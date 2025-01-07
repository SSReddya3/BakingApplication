package com.obs.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.obs.base.BasePage;
import com.obs.common.StandardWaitTimes;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.DeleteUserAccountPage;

public class DeleteUserAccount extends BasePage {
	
	
	
	
	@Test
	public void Deleteuseraccount() throws IOException, InterruptedException {
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		
		DeleteUserAccountPage delete=new DeleteUserAccountPage(driver, test);
		delete.Click_on_accountManagement();
		delete.Click_on_manage_account();
		delete.Click_on_Actionbutton();
		delete.Click_on_deletebutton();
		
		//clicking on action button
		//page.ClickonActionDropdown();
		
		
	}

}

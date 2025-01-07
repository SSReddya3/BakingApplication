package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.UpdateUserAccountPage;

public class UpdateUserAccount extends BasePage{
	@Test
	public void UpdateUserAccount() throws IOException, InterruptedException {
		
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		UpdateUserAccountPage update=new UpdateUserAccountPage(driver, test);
		update.Click_on_accountmanagement();
		update.Click_on_manageAccount();
		update.Click_on_Actionbutton();
		update.Click_on_Editbutton();
		update.Update_Anyone_field();
		update.Click_on_savebutton();
	}

}

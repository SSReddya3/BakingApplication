package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.CreateUserAccount;

public class BannnerMessageForCreateAccount extends BasePage {
	String emailId = "onlinetestinghelp5675456@gmail.com";
	String userPwd = "123456";
	@Test
	public void Validate_BannerMessage_for_Create_New_Account() throws IOException, InterruptedException {
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		
		CreateUserAccount newuser=new CreateUserAccount(driver, test);
		newuser.Create_New_Account();
		newuser.Validate_Banner_Message();
		
	}
}

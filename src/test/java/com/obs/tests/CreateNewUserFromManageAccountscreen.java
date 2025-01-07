package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.CreateNewUserFromManageAccountScreenPage;
import com.obs.pages.CreateUserAccount;

public class CreateNewUserFromManageAccountscreen extends BasePage{
	String emailId = "onlinetestinghelp7264455@gmail.com";
	String userPwd = "123456";
	@Test
	public void Create_New_User_From_ManageAccount() throws InterruptedException, IOException {
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		
		CreateNewUserFromManageAccountScreenPage create=new CreateNewUserFromManageAccountScreenPage(driver,test);
		create.ClickonAccountmanagement();
		create.ClickonManageAccount();
		create.ClickonCreateButon();
		create.Create_NewAccount();
		
		CreateUserAccount newuser=new CreateUserAccount(driver, test);
		newuser.LogoutOption();
//		newuser.userLogin(emailId, userPwd);
		create.userLoginn(emailId, emailId);
		
	}

}

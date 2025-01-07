package com.obs.tests;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.AdminHomePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.AdminWithdrawAmountPage;
import com.obs.pages.CreateUserAccount;

import com.obs.pages.NewAccountPage;
import com.obs.pages.UserHomePage;
import com.obs.pages.UserLoginPage;
import com.obs.utilities.RandomNumber;


public class CreateNewAccount extends BasePage{
	
	String url,userName,Password;
	long accountNumber = RandomNumber.getRandomNumber();
	String emailId = "onlinetestinghelp"+accountNumber+"@gmail.com";
	String userPwd = "123456";
	@Test
	public void CreateNewAccount() throws IOException, InterruptedException{
		String emailId = "onlinetestinghelp5675456@gmail.com";
		String userPwd = "123456";
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		
		
		CreateUserAccount newuser=new CreateUserAccount(driver, test);
		newuser.Create_New_Account();
		newuser.LogoutOption();
		newuser.userLogin(emailId, userPwd);
		

//		
//		
//		//Click on New Account
////				HashMap<String,String> testData = new HashMap<String,String>();
////				testData.put("accountNumber", String.valueOf(accountNumber));
////				testData.put("FirstName", "Venkat");
////				testData.put("middleName", "Krishna");
////				testData.put("lastName", "VK");
////				testData.put("email", emailId);
////				testData.put("password", userPwd);
////				testData.put("pin", "1234");
////				testData.put("balance", "100000");
//				
//				NewAccountPage newAccount = new NewAccountPage(driver, test);
//				//newAccount.NewUserCreation(testData);
//				adminHomePage.logout();
//				
//				//User Login
//				login.gotoUserLogin();
//				UserLoginPage userPage = new UserLoginPage(driver, test);
//				userPage.userLogin(emailId, userPwd);
//				
//				//Verify welcome text
//				UserHomePage userHome = new UserHomePage(driver, test);
//				userHome.verifyWelcomeText();
//				userHome.logout();
//				
//		
	}
}

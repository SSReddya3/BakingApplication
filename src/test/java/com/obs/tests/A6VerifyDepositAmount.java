package com.obs.tests;

import java.io.IOException;
import java.util.HashMap;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.obs.base.BasePage;
import com.obs.pages.AdminHomePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.NewAccountPage;
import com.obs.pages.TransactionsPage;
import com.obs.pages.UserHomePage;
import com.obs.pages.UserLoginPage;
import com.obs.utilities.RandomNumber;
import com.obs.utilities.ReadProperties;

import com.obs.pages.DepositAmountpage;
import com.obs.tests.A4VerifyUserLogin;

public class A6VerifyDepositAmount extends BasePage{

	String url,userName,Password;
	long accountNumber = RandomNumber.getRandomNumber();
	String emailId = "onlinetestinghelp"+accountNumber+"@gmail.com";
	String userPwd = "123456";
	

	@Test
	public void A6verifyDepositAmount() throws IOException, InterruptedException {
		

		
		AdminLoginPage login = new AdminLoginPage(driver, test);
		login.verifyLogin();
		
		AdminHomePage adminHomePage = new AdminHomePage(driver,test);
		adminHomePage.verifyHomePageText();
		
		
		DepositAmountpage Depositpage= new DepositAmountpage(driver, test);

		TransactionsPage transactions = new TransactionsPage(driver, test);
		transactions.clickOnTransaction();
		transactions.clickonDeposit();
	
		Depositpage.DepositAmountToanAccount();
		
		//user clicks on transaction dropdown
		transactions.clickOnTransaction();
		
		//user clciks on Account management dropdown
		adminHomePage.clickOnAccMgmt();
		
		//EditUserAccountPage Edit= new EditUserAccountPage(driver, test);
		//user clicks on manage account
		Depositpage.Click_on_manage_account();
		
		
		//user search with account number.
		Depositpage.UsersearchAccountNumber();
		
		//user clicks on Actions dropdown
		Depositpage.ClickonAction();
		
		
		//user selects Edit option
		Depositpage.Click_on_Edit();
		
		
		//validate user email
		Depositpage.VerifyUserEmail();
		
		//user clicks on logout
		adminHomePage.logout();
		
		//user clicks on userlogin hyperlink
		login.gotoUserLogin();
		
		//user enters email and password then clciks on login button
		Depositpage.EnterUserCredentials();
		
		//user validates welcom text
		UserHomePage userHome = new UserHomePage(driver, test);
		userHome.verifyWelcomeText();
		
		Depositpage.Validate_CurrentBalanceBefore_deposit();
		//validate user current balance
		Depositpage.ValidateUserCurrentbalanceAfterdeposit();
		
		
		

	}
	
}

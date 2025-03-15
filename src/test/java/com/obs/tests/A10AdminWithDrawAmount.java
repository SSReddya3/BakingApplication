package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.AdminHomePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.TransactionsPage;
import com.obs.utilities.RandomNumber;
import com.obs.pages.AdminWithdrawAmountPage;
import com.obs.pages.CreateUserAccount;
import com.obs.pages.DepositAmountpage;
public class A10AdminWithDrawAmount extends BasePage {
	String url,userName,Password;
	long accountNumber = RandomNumber.getRandomNumber();
	String emailId = "onlinetestinghelp"+accountNumber+"@gmail.com";
	String userPwd = "123456";
	@Test
	public void A9AdminWithDrawAmount() throws IOException, InterruptedException {
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		
		//user click on transactions
		TransactionsPage transactions = new TransactionsPage(driver, test);
		//user clicks on transactions dropdown
		transactions.clickOnTransaction();
		
		AdminWithdrawAmountPage Withdraw= new AdminWithdrawAmountPage(driver, test);
		
		Withdraw.ClickonWithdrawOption();
		//user withdraw amount from an account
		Withdraw.WithdrawAmountfromAnaccount();
		
		transactions.clickOnTransaction();
		
		Withdraw.ClickonAccountmanagementDP();
		Withdraw.ClickonmanageAccount();
		Withdraw.SearchAccountNumber();
		Withdraw.ValidateCurrentBalance();
		
		DepositAmountpage Depositpage= new DepositAmountpage(driver, test);
		Depositpage.ClickonAction();
		Depositpage.Click_on_Edit();
		Depositpage.VerifyUserEmail();
		
		AdminHomePage adminHomePage = new AdminHomePage(driver,test);
		adminHomePage.logout();
		
		
		AdminLoginPage login1 = new AdminLoginPage(driver, test);
		login1.gotoUserLogin();
		
		Withdraw.EnterUsersCredentials();
		Withdraw.VerifyCurrentBalanceAfterWithdraw();
	}
	
}

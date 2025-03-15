package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.AdminHomePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.AdminWithdrawAmountPage;
import com.obs.pages.BannerMessageforWithdrawAmountPage;
import com.obs.pages.DepositAmountpage;
import com.obs.pages.TransactionsPage;

public class A13BannerMessageForWithdrawAmount extends BasePage {
	@Test
public void Validate_BanerMessageForWithdrawAmount() throws IOException, InterruptedException {
		
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

	
	
		BannerMessageforWithdrawAmountPage message= new BannerMessageforWithdrawAmountPage(driver,test);
		message.Validate_Banner_message();
	}
}
	
	
	
	
	
	
	
	
	
	
	


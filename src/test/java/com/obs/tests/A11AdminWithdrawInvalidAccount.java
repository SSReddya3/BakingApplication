package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.AdminWithdrawAmountPage;
import com.obs.pages.TransactionsPage;
import com.obs.pages.AdminWithdrawInvalidAccountPage;

public class A11AdminWithdrawInvalidAccount extends BasePage{
	@Test
	public void Admin_Withdraw_Invalid_Account() throws IOException, InterruptedException {
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		
		
		//user click on transactions
				TransactionsPage transactions = new TransactionsPage(driver, test);
				//user clicks on transactions dropdown
				transactions.clickOnTransaction();
				
				AdminWithdrawAmountPage Withdraw= new AdminWithdrawAmountPage(driver, test);
				
				Withdraw.ClickonWithdrawoptionAndEnterAmount();
				//user withdraw amount from an account
//				AdminWithdrawInvalidAccountPage invalidpage= new AdminWithdrawInvalidAccountPage(driver, test);
//				invalidpage.Withdraw_Amount_withInvalid_Account();
	}

}

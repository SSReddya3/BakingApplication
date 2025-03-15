package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.DepositAmountpage;
import com.obs.pages.TransactionsPage;


public class A5DepositAmount extends BasePage{

	@Test
	public void DepositAmountwithInvalidAccount() throws IOException, InterruptedException {
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		
		TransactionsPage transactions = new TransactionsPage(driver, test);
		
		//user clicks on transactions
		transactions.clickOnTransaction();
		
		//user clciks on deposit option
		transactions.clickonDeposit();
		DepositAmountpage Depositpage= new DepositAmountpage(driver, test);
		
		//user enters invalid account
		transactions.DeposiAamount();
		
	}
}

package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.TransactionsPage;
import com.obs.pages.TransferAmountPage;

public class A9TransferAmountwithInvalidAccount extends BasePage {
	
	@Test
	public void a8TransferAmountwithInvalidAccount() throws IOException, InterruptedException {
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		
		//user click on transactions
		TransactionsPage transactions = new TransactionsPage(driver, test);
		//user clicks on transactions dropdown
		transactions.clickOnTransaction();
		
		TransferAmountPage Transferpage=new TransferAmountPage(driver, test);
		Transferpage.Click_on_Transfer_Option();
		
		Transferpage.Transfer_Amount_To_InvalidAccount();
	}
	

}

package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.*;
import com.obs.pages.TransactionsPage;
import com.obs.pages.BannerMessageForTransferPage;

public class A12BannerMessageForTransfer extends BasePage{
	
	@Test

	public void Validate_BannerMessage_For_Transfer() throws IOException, InterruptedException {
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		
		//TransferAmount transfer =new TransferAmount();
		A8TransferAmount transfer=new A8TransferAmount();
		transfer.A7TransferAmount();
		
		BannerMessageForTransferPage message=new BannerMessageForTransferPage(driver,test);
		message.Validate_Banner_message();
	}

}

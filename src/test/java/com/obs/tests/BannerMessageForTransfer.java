package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.BannerMessageForTransferPage;

public class BannerMessageForTransfer extends BasePage{
	
	@Test

	public void Validate_BannerMessage_For_Transfer() throws IOException, InterruptedException {
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		
		
		TransferAmount transfer=new TransferAmount();
		transfer.TransferAmount();
		
		BannerMessageForTransferPage message=new BannerMessageForTransferPage(driver,test);
		message.Validate_Banner_message();
	}

}

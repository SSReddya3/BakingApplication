package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.BannerMessageforWithdrawAmountPage;

public class BannerMessageforWithdrawAmount extends BasePage{

	@Test
	public void Validate_BanerMessageForWithdrawAmount() throws IOException, InterruptedException {
		
		AdminWithDrawAmount withdraw= new AdminWithDrawAmount();
		withdraw.AdminWithDrawAmount();
		BannerMessageforWithdrawAmountPage message= new BannerMessageforWithdrawAmountPage(driver,test);
		message.Validate_Banner_message();
	}
}

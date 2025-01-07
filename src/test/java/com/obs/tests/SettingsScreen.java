package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.SettingsScreenPage;

public class SettingsScreen extends BasePage{
	@Test
	public void Verify_System_Information() throws IOException, InterruptedException {
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		
		SettingsScreenPage settings=new SettingsScreenPage(driver,test);
		settings.Click_on_Settings();
		settings.Validate_All_the_fields_in_System_informationscreen();
		settings.Update_Anyone_of_the_field();
	}

}

package com.obs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obs.base.BasePage;
import com.obs.pages.AdminLoginPage;
import com.obs.pages.CreateAnnouncementsPage;

public class DeleteAnnouncements extends BasePage{
	@Test
	public void Delete_Announcement() throws IOException, InterruptedException {
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.verifyLogin();
		
		CreateAnnouncementsPage announce=new CreateAnnouncementsPage(driver, test);
		announce.Delete_Announcement();
	}
}

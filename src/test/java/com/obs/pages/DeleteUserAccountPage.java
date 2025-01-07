package com.obs.pages;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.obs.common.StandardWaitTimes;

public class DeleteUserAccountPage {
	Logger log = (Logger) LogManager.getLogger(TransactionsPage.class);
	WebDriver driver;
	ExtentTest test;
	
	

	public DeleteUserAccountPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//p[normalize-space()='Account Management']")
	WebElement AcctMangemt;
	
	@FindBy(xpath="//p[normalize-space()='Manage Account']")
	WebElement Mangeacct;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement Action;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']//a[@class='dropdown-item delete_data'][normalize-space()='Delete']")
	WebElement delete;
	
	@FindBy(xpath="//button[@id='confirm']")
	WebElement Confirmbutton;
	
	public void Click_on_accountManagement() {
		try {
		AcctMangemt.click();
		Assert.assertTrue(true, "Successfully clicked on Account management dropdown");
		test.log(Status.PASS, "Successfully clicked on Account management dropdown");
		log.info("Successfully clicked on Account management dropdown");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Click_on_manage_account() {
		try {
		Mangeacct.click();
		Assert.assertTrue(true, "Successfully clicked on Manage account");
		test.log(Status.PASS, "Successfully clicked on Manage account");
		log.info("Successfully clicked on Manage account");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Click_on_Actionbutton() {
		try {
		Action.click();
		Assert.assertTrue(true, "Successfully clicked on Actions dropdown");
		test.log(Status.PASS, "Successfully clicked on Actions dropdown");
		log.info("Successfully clicked on Actions dropdown");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Click_on_deletebutton() {
		try {
		delete.click();
		Assert.assertTrue(true, "Successfully clicked on delete button");
		test.log(Status.PASS, "Successfully clicked on delete button");
		log.info("Successfully clicked on delete button");
		Confirmbutton.click();
		Assert.assertTrue(true, "Account successfully deleted.");
		test.log(Status.PASS, "SAccount successfully deleted.");
		log.info("Account successfully deleted.");
//		Alert alert=driver.switchTo().alert();
//		alert.dismiss();
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	}
	
	
}

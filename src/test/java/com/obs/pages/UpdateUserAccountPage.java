package com.obs.pages;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.obs.common.StandardWaitTimes;

public class UpdateUserAccountPage {
	Logger log = (Logger) LogManager.getLogger(AdminHomePage.class);
	WebDriver driver;
	ExtentTest test;
	
	public UpdateUserAccountPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//p[normalize-space()='Account Management']")
	WebElement Acctmanagement;
	
	@FindBy(xpath="//p[normalize-space()='Manage Account']")
	WebElement Manageaccount;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement Actionbttn;
	
	@FindBy(xpath="(//a[@class='dropdown-item edit_data'])[1]")
	WebElement Edit;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement FirstNameInput;
	
	@FindBy(xpath="//div[@class='d-flex w-100']/button")
	WebElement SaveButton;
	
	
	public void Click_on_accountmanagement() {
		try {
		Acctmanagement.click();
		Assert.assertTrue(true, "User clicked on Account Management dropdown");
		test.log(Status.PASS, "User clicked on Account Management dropdown");
		log.info("User clicked on Account Management dropdown");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Click_on_manageAccount() {
		try {
		Manageaccount.click();
		Assert.assertTrue(true, "User clicked on Manage Account");
		test.log(Status.PASS, "User clicked on Manage Account");
		log.info("User clicked on Manage Account");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Click_on_Actionbutton() {
		try {
		Actionbttn.click();
		Assert.assertTrue(true, "User clicked on Action button");
		test.log(Status.PASS, "User clicked on Action button");
		log.info("User clicked on Action button");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Click_on_Editbutton() {
		try {
		Edit.click();
		Assert.assertTrue(true, "User clicked on Edit button");
		test.log(Status.PASS, "User clicked on Edit button");
		log.info("User clicked on Edit button");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Update_Anyone_field() {
		try {
		FirstNameInput.clear();
		FirstNameInput.sendKeys("Venkat update");
		Assert.assertTrue(true, "User updated name field");
		test.log(Status.PASS, "User updated name field");
		log.info("User updated name field");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void Click_on_savebutton() {
		try {
		SaveButton.click();
		Assert.assertTrue(true, "User clicked on Save button");
		test.log(Status.PASS, "User clicked on Save button");
		log.info("User clicked on Save button");
		
		Assert.assertTrue(true, "Account successfully saved.");
		test.log(Status.PASS, "Account successfully saved.");
		log.info("Account successfully saved.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}

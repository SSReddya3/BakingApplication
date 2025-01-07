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

public class SettingsScreenPage {
	Logger log = (Logger) LogManager.getLogger(NewAccountPage.class);
	WebDriver driver;
	ExtentTest test;
	
	public SettingsScreenPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//p[normalize-space()='Settings']")
	WebElement Settings;
	
	@FindBy(xpath="//h5[normalize-space()='System Information']")
	WebElement SystemInformationHeader;
	
	@FindBy(xpath="//label[normalize-space()='System Name']")
	WebElement SystemName;

	@FindBy(xpath="//label[normalize-space()='System Short Name']")
	WebElement SystemShortname;
	
	@FindBy(xpath="//label[normalize-space()='About Us']")
	WebElement AboutUs;
	
	@FindBy(xpath="//label[normalize-space()='System Logo']")
	WebElement SystemLogo;
	
	@FindBy(xpath="//label[normalize-space()='Website Cover']")
	WebElement Systemcover;

	@FindBy(xpath="//button[normalize-space()='Update']")
	WebElement updatebutton;
	@FindBy(xpath="//button[normalize-space()='Update']")
	WebElement AboutUsTextbox;
	
	
	public void Click_on_Settings() {
		try {
		Settings.click();
		Assert.assertTrue(true, "User Clicked on Settings");
		test.log(Status.PASS, "User Clicked on Settings");
		log.info("User Clicked on Settings");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Validate_All_the_fields_in_System_informationscreen() {
		try {
		SystemInformationHeader.isDisplayed();
		SystemName.isDisplayed();
		SystemShortname.isDisplayed();
		AboutUs.isDisplayed();
		SystemLogo.isDisplayed();
		Systemcover.isDisplayed();
		updatebutton.isDisplayed();
		Assert.assertTrue(true, "User validated all the fields");
		test.log(Status.PASS, "User validated all the fields");
		log.info("User validated all the fields");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void Update_Anyone_of_the_field() {
		try {
		AboutUsTextbox.sendKeys("Sample About Updated");
		Assert.assertTrue(true, "User Successfully updated System Information");
		test.log(Status.PASS, "User Successfully updated System Information");
		log.info("User Successfully updated System Information");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}

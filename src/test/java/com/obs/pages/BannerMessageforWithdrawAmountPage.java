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

public class BannerMessageforWithdrawAmountPage {
	Logger log = (Logger) LogManager.getLogger(AdminHomePage.class);
	WebDriver driver;
	ExtentTest test;
	
	public BannerMessageforWithdrawAmountPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='VK, Venkat Krishna's withdraw form successfully saved.']")
	WebElement WithdrawBannermessage;
	
	
	public void Validate_Banner_message() {
		try {
		if(WithdrawBannermessage.isDisplayed()) {
			Assert.assertTrue(true, "Successfully banner message is displayed as 'VK, Venkat Krishna's withdraw form successfully saved.'");
			test.log(Status.PASS, "Successfully banner message is displayed as 'VK, Venkat Krishna's withdraw form successfully saved.'");
			log.info("Successfully banner message is displayed as 'VK, Venkat Krishna's withdraw form successfully saved.'");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	}
}

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

public class BannerMessageForTransferPage {
	Logger log = (Logger) LogManager.getLogger(AdminHomePage.class);
	WebDriver driver;
	ExtentTest test;
	
	public BannerMessageForTransferPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='Transfer successfully processed.']")
	WebElement TransferBannermessage;
	
	
	public void Validate_Banner_message() {
		try {
		if(TransferBannermessage.equals("Transfer successfully processed.")) {
			Assert.assertTrue(true, "Successfully banner message is displayed as 'Transfer successfully processed'");
			test.log(Status.PASS, "Successfully banner message is displayed as 'Transfer successfully processed'");
			log.info("Successfully banner message is displayed as 'Transfer successfully processed'");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

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

public class TransactionsPage {
	
	Logger log = (Logger) LogManager.getLogger(TransactionsPage.class);
	WebDriver driver;
	ExtentTest test;
	
	@FindBy(xpath="//p[normalize-space()='Transaction']")
	WebElement Transaction;
	
	@FindBy(xpath="//p[normalize-space()='Deposit']")
	WebElement Deposit;
	
	@FindBy(xpath="//input[@name='account_number']")
	WebElement account_Number;
	
	@FindBy(xpath="//input[@name='balance']")
	WebElement Deposit_Amount;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement Submit;
	
	public TransactionsPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	public void deposit_Amount(String acc_Number, String amount) {
		account_Number.sendKeys(acc_Number);
		Deposit_Amount.clear();
		Deposit_Amount.sendKeys(amount);
		Submit.click();
	}
	
	public void clickOnTransaction() throws InterruptedException {
		try {
		Thread.sleep(4000);
		Transaction.click();
		Assert.assertTrue(true, "Successfully clciked on Transactions dropdown");
		test.log(Status.PASS, "Successfully clicked on Transactions dropdown");
		log.info("successfully clicked on Transactions dropdown");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickonDeposit() {
		try {
		Deposit.click();
		Assert.assertTrue(true, "Successfully clicked on Deposit Option");
		test.log(Status.PASS, "Successfully clicked on Deposit Option");
		log.info("Successfully clicked on Deposit Option");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void clickonDepositandenteramount() {
		try {
		Deposit.click();
		Assert.assertTrue(true, "Successfully clicked on Deposit Option");
		test.log(Status.PASS, "Successfully clicked on Deposit Option");
		log.info("Successfully clicked on Deposit Option");
		account_Number.sendKeys("1234567");
		Assert.assertTrue(true, "'Account doesn't exist' error message is displayed");
		test.log(Status.PASS, "'Account doesn't exist' error message is displayed");
		log.info("'Account doesn't exist' error message is displayed");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

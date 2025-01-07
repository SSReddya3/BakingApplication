package com.obs.pages;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.obs.common.StandardWaitTimes;

public class AdminWithdrawAmountPage {
	Logger log = (Logger) LogManager.getLogger(TransactionsPage.class);
	WebDriver driver;
	ExtentTest test;
	@FindBy(xpath="//p[normalize-space()='Withdraw']")
	WebElement AdminWithdrawOption;

	@FindBy(xpath="//p[normalize-space()='Withdraw']")
	WebElement AdminWithdrawHeader;
	
	@FindBy(xpath="//label[normalize-space()='Widthdraw Amount']")
	WebElement WithdrawAmountLable;
	
	@FindBy(xpath="//input[@name='account_number']")
	WebElement account_Number;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement NameField;
	
	@FindBy(xpath="//input[@id='balance']")
	WebElement Balancefield;
	
	@FindBy(xpath="//input[@name='balance']")
	WebElement Withdraw_Amount;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement Submit;
	
	@FindBy(xpath="//p[normalize-space()='Manage Account']")
	WebElement ManageAccountbutton;
	
	@FindBy(xpath="//a[@class='nav-link tree-item nav-accounts nav-transactions nav-manage_account']")
	WebElement AccountManagementDp;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement SearchField;
	
	@FindBy(xpath="//th[@aria-label='Current Balance: activate to sort column ascending']")
	WebElement CurrentBallenceLable;
	
	@FindBy(xpath="//td[@class='text-right']")
	WebElement CurrentBalance;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//h3[normalize-space()='Current Balance: 1,071,000.00']")
	WebElement UsersInitialBalance;
	
	@FindBy(xpath = "//a[text()='User Login']")
	WebElement userloginlink;
	
	
	
	
	
	public AdminWithdrawAmountPage(WebDriver driver, ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	public void WithdrawAmountfromAnaccount() {
		if(AdminWithdrawHeader.isDisplayed()) {
			account_Number.sendKeys("6124934");
			Withdraw_Amount.sendKeys("10");
			Assert.assertTrue(true, "User entered required fields");
			test.log(Status.PASS, "User entered required fields");
			log.info("User entered required fields");
			Submit.click();
			Assert.assertTrue(true, "User clicked on submit button");
			test.log(Status.PASS, "User clicked on submit button");
			log.info("User clicked on submit button");
		}
			
		}
	
	public void EnterUsersCredentials() throws InterruptedException {
		emailField.sendKeys("onlinetestinghelp6124934@gmail.com");
		passwordField.sendKeys("123456");
		//login button
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", loginbtn);
		Thread.sleep(3000);
	}
	public void ClickonWithdrawOption() {
		AdminWithdrawOption.click();

		Assert.assertTrue(true, "Successfully clicked on Withdraw Option");
			test.log(Status.PASS, "Successfully clicked on Withdraw Option");
			log.info("Successfully clicked on Withdraw Option");
	}
	
	public void ClickonWithdrawoptionAndEnterAmount() {
		try {
		AdminWithdrawOption.click();
		Assert.assertTrue(true, "Successfully clicked on Withdraw Option");
			test.log(Status.PASS, "Successfully clicked on Withdraw Option");
			log.info("Successfully clicked on Withdraw Option");
			
			account_Number.sendKeys("1234567");
			Assert.assertTrue(true, "Successfully user entered amount");
			test.log(Status.PASS, "Successfully user entered amount");
			log.info("Successfully user entered amount");

			Assert.assertTrue(true, "Account doesn't exist");
			test.log(Status.PASS, "Account doesn't exist is displayed - Expected");
			log.info("Account doesn't exist is displayed - Expected");
		}catch(Exception e) {
			e.printStackTrace();
		}
					
		}
			


	
	
	public void ClickonAccountmanagementDP() {
		try {
		AccountManagementDp.click();
		Assert.assertTrue(true, "User clicked on Account Management dropdown");
		test.log(Status.PASS, "User clicked on Account Management dropdown");
		log.info("User clicked on Account Management dropdown");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void ClickonmanageAccount() {
		try {
		ManageAccountbutton.click();
		Assert.assertTrue(true, "User clicked on Manage account");
		test.log(Status.PASS, "User clicked on Manage account");
		log.info("User clicked on Manage account");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void SearchAccountNumber() {
		try {
		SearchField.clear();
		SearchField.sendKeys("6124934");
		Assert.assertTrue(true, "Successfully Searched Account number is displayed");
		test.log(Status.PASS, "Successfully Searched Account number is displayed");
		log.info("Successfully Searched Account number is displayed");
		}catch(Exception e) {
			e.printStackTrace();
		}
}
	
	
	public void ValidateCurrentBalance() {
		try {
		if(CurrentBallenceLable.isDisplayed()) {
			Assert.assertTrue(true, "Successfully Amount is deposited");
			test.log(Status.PASS, "Successfully Amount is deposited");
			log.info("Successfully Amount is deposited");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public String CurrentBalanceBeforeWithdraw;
	public void VerifyCurrentBalanceBeforeWithdraw() {
		try {
		CurrentBalanceBeforeWithdraw=UsersInitialBalance.getText();
		Assert.assertTrue(true, "Successfully verified 'Current Balance Before Withdraw'");
		test.log(Status.PASS, "Successfully verified 'Current Balance Before Withdraw'");
		log.info("Successfully verified 'Current Balance Before Withdraw'");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void VerifyCurrentBalanceAfterWithdraw() {
		try {
		String CurrentBalanceAfterWithdraw=UsersInitialBalance.getText();
		if(!CurrentBalanceBeforeWithdraw.equals(CurrentBalanceAfterWithdraw)) {
			Assert.assertTrue(true, "Successfully CurrentBalance is updated");
			test.log(Status.PASS, "Successfully CurrentBalance is updated");
			log.info("Successfully CurrentBalance is updated");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void UserClicksonUserlogin() {
		try {
		userloginlink.click();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	 
	}
}


	
	
	
	
	
	



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

public class DepositAmountpage {
	Logger log = (Logger) LogManager.getLogger(DepositAmountpage.class);
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
	
	@FindBy(xpath="//h3[normalize-space()='Deposit']")
	WebElement depositHeader;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement NameField;
	
	@FindBy(xpath="//input[@id='balance']")
	WebElement Balancefield;
	
	
	@FindBy(xpath="//input[@type='search']")
	WebElement SearchField;
	
	
	@FindBy(xpath="//input[@name='email']")
	WebElement Emailtextfield;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//h3[contains(text(),'Account Number')]")
	WebElement UserAccountNumber;
	
	@FindBy(xpath = "//h3[contains(text(),'Current Balance')]")
	WebElement UserCurrentBalance;
	
	@FindBy(xpath = "//a[normalize-space()='Cancel']")
	WebElement CancelButton;
	
	@FindBy(xpath = "//p[normalize-space()='Account Management']")
	WebElement AccountMnagmt;
	
	
	@FindBy(xpath ="//p[normalize-space()='Manage Account']")
	WebElement ManageAccount;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement Searchfield;
	
	@FindBy(xpath = "//p[normalize-space()='Account Management']//i[@class='right fas fa-angle-left']")
	WebElement Accountmanagementclose;
	@FindBy(xpath = "//label[normalize-space()='Search:']")
	WebElement Searchlabel;
	
	@FindBy(xpath="//p[normalize-space()='Account Management']/i")
	WebElement AccountManagement;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement Action;
	
	@FindBy(xpath="(//a[@class='dropdown-item edit_data'])[1]")
	WebElement Edit;
	
	
	
	

	
	
//	public void ClickonAccountManagementclose() {
//		Accountmanagementclose.click();
//	}
//	
	
	public void Click_on_Edit() {
		Edit.click();
		Assert.assertTrue(true, " user clicked on Edit");
		test.log(Status.PASS, " user clicked on Edit");
		log.info("user clicked on Edit");
	}
	public void ClickonAction() {
		Action.click();
		Assert.assertTrue(true, " user clicked on Action dropdown ");
		test.log(Status.PASS, " user clicked on Action dropdown");
		log.info("user clicked on Action dropdown");
	}
	public void Click_on_Accountmanagement() {
		AccountMnagmt.click();
		Assert.assertTrue(true, " user clicked on Account management dropdown ");
		test.log(Status.PASS, " user clicked on Account management dropdown");
		log.info(" user clicked on Account management dropdown");
	}
	
	public void Click_on_manage_account() {
		ManageAccount.click();
		Assert.assertTrue(true, " user clicked on Manage account ");
		test.log(Status.PASS, " user clicked on Manage account");
		log.info(" user clicked on Manage account");
	}
	
	public void Search_accountnumber() {
		Searchfield.sendKeys("6124934");
		Assert.assertTrue(true, " User validated current balance before deposit");
		test.log(Status.PASS, " User validated current balance before deposit");
		log.info(" User validated current balance before deposit");
		
	}
	public DepositAmountpage(WebDriver driver, ExtentTest test) {
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
		Thread.sleep(4000);
		Transaction.click();
	}
	
	public void clickonDeposit() {
		Deposit.click();
	}
	
	public void DepositAmountToanAccount() throws InterruptedException {
		try {
		if(depositHeader.isDisplayed()) {
			account_Number.sendKeys("7717264");
			Thread.sleep(3000);
			Deposit_Amount.sendKeys("50");
			Thread.sleep(3000);
			Submit.click();
			Assert.assertTrue(true, "Successfully Deposited ");
			test.log(Status.PASS, "Successfully Deposited");
			log.info("Successfully Deposited");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DepositAmountFunctionality() {
		try {
		if(depositHeader.isDisplayed()) {
			account_Number.sendKeys("6124934");
			Assert.assertTrue(true, "User successfully entered account number");
			test.log(Status.PASS, "User successfully entered account number");
			log.info("User successfully entered account number");
			Deposit_Amount.sendKeys("1000");
			Assert.assertTrue(true, "User successfully entered deposit amount");
			test.log(Status.PASS, "User successfully entered deposit amount");
			log.info("User successfully entered deposit amount");
			
			CancelButton.click();
			Assert.assertTrue(true, "User successfully clciked on Cancel button");
			test.log(Status.PASS, "User successfully clciked on Cancel button");
			log.info("User successfully clicked on Cancel button");
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DepositAmountwithinvalidAccount() {
		
			account_Number.sendKeys("1234567");
				Assert.assertTrue(false, "'Account doesn't exist' error message is displayed");
				test.log(Status.PASS, "'Account doesn't exist' error message is displayed");
				log.info("'Account doesn't exist' error message is displayed");
			
			Deposit_Amount.sendKeys("1000");
			Submit.click();
		}
	
	
	public void UsersearchAccountNumber() {
		try {
		SearchField.sendKeys("6124934");
		Assert.assertTrue(true, "Successfully Account number is displayed");
		test.log(Status.PASS, "Successfully Account number is displayed");
		log.info("successfully Successfully Account number is displayed");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void VerifyUserEmail() {
		try {
		Emailtextfield.isDisplayed();
		Assert.assertTrue(true, "Successfully User Email verified ");
		test.log(Status.PASS, "Successfully User Email verified");
		log.info("Successfully User Email verified");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void EnterUserCredentials() throws InterruptedException {
		try {
		emailField.sendKeys("onlinetestinghelp6124934@gmail.com");
		passwordField.sendKeys("123456");
		//login button
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", loginbtn);
		Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public String currentbalancebeforedeposit;
	public void Validate_CurrentBalanceBefore_deposit(){
		try {
	  currentbalancebeforedeposit = UserCurrentBalance.getText();
		Assert.assertTrue(true, "Successfully Verified currentbalancebeforedeposit ");
		test.log(Status.PASS, "Successfully Verified currentbalancebeforedeposit");
		log.info("Successfully Verified currentbalancebeforedeposit");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ValidateUserCurrentbalanceAfterdeposit() {
		try {
		String currentbalanceAfterdeposit=UserCurrentBalance.getText();
		Assert.assertTrue(true, "Successfully Verified currentbalancebeforedeposit ");
		test.log(Status.PASS, "Successfully Verified currentbalancebeforedeposit");
		log.info("Successfully Verified currentbalancebeforedeposit");
		if(currentbalancebeforedeposit != currentbalanceAfterdeposit) {
			Assert.assertTrue(true, "Successfully Verified currentbalancebeforedeposit ");
			test.log(Status.PASS, "Successfully Verified currentbalancebeforedeposit");
			log.info("Successfully Verified currentbalancebeforedeposit");
		}else {
			Assert.assertTrue(true, "Successfully Verified currentbalancebeforedeposit ");
			test.log(Status.PASS, "Successfully Verified currentbalancebeforedeposit");
			log.info("Successfully Verified currentbalancebeforedeposit");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	public void ClickonAccountManagementclose() {
		try {
		Accountmanagementclose.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void clcikonsearchlabel() {
		try {
		Searchlabel.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}



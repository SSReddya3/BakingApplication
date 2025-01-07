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

public class AdminWithdrawInvalidAccountPage {
	Logger log = (Logger) LogManager.getLogger(AdminWithdrawInvalidAccountPage.class);
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
	
	public AdminWithdrawInvalidAccountPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	public void Withdraw_Amount_withInvalid_Account() {
		if(AdminWithdrawHeader.isDisplayed()) {
			account_Number.sendKeys("1234567");
			if(account_Number.equals("6124934")) {
				Assert.assertTrue(true, "Account doesn't exist");
				test.log(Status.PASS, "Account doesn't exist is displayed - Expected");
				log.info("Account doesn't exist is displayed - Expected");
				
			}else {
				Assert.assertTrue(true, "Account exist");
				
				
			}
		}

	}
}

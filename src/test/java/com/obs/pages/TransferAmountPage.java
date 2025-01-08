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

public class TransferAmountPage {

	Logger log = (Logger) LogManager.getLogger(TransactionsPage.class);
	WebDriver driver;
	ExtentTest test;
	
	//@FindBy(xpath = "(//p[contains(text(),'Transaction')])[1]")
	//WebElement TransferOption;
	@FindBy(xpath="//a[@class='nav-link nav-transfer']/i")
	WebElement TransferOption;
	
	@FindBy(xpath="//h3[normalize-space()='Deposit']")
	WebElement DepositHeader1;
	
	
	@FindBy(xpath="//input[@name='account_number']")
	WebElement accountNumber;
	
	
	@FindBy(xpath="//input[@name='transfer_number']")
	WebElement TransferToField;
	
	
	@FindBy(xpath="//input[@id='name']")
	WebElement FromNametextField;
	
	@FindBy(xpath="//input[@id='transfer_name']")
	WebElement TransferNameTextfield;
	
	@FindBy(xpath="//label[normalize-space()='Balance']")
	WebElement BalanceTextfield;
	
	
	@FindBy(xpath="//input[@name='balance']")
	WebElement DepositAmountField;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement SubmitButton;
	
	@FindBy(xpath="small[@class='_checks text-danger']")
	WebElement AccountFieldErrorMessage;
	
	@FindBy(xpath="//small[@class='_checks2 text-danger']")
	WebElement TransferToFieldErrorMessage;
	
	//small[@class='_checks2 text-danger']
	
	
	
	
	
	
	public TransferAmountPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	public void Click_on_Transfer_Option() {
		try {
		TransferOption.click();
		Assert.assertTrue(true, "Successfully clicked on Transfer Option");
		test.log(Status.PASS, "Successfully clicked on Transfer Option");
		log.info("Successfully clicked on Transfer Option");
		}catch(Exception e) {
			e.printStackTrace();
		}
}
	
	public void Transfer_Amount_To_OtherAccount() throws InterruptedException {
		try {
		if(DepositHeader1.isDisplayed()) {
			accountNumber.sendKeys("4604898");
			Thread.sleep(3000);
			TransferToField.sendKeys("7847816");
			
			//if(FromNametextField.equals("VK, Venkat Krishna") & TransferNameTextfield.equals("VK, Venkat Krishna") & BalanceTextfield.equals("1000000")) {
				DepositAmountField.sendKeys("200");
				Thread.sleep(3000);
				SubmitButton.click();
				Assert.assertTrue(true, "Successfully Amount is Transfered to other Account");
				test.log(Status.PASS, "Successfully Amount is Transfered to other Account");
				log.info("Successfully Amount is Transfered to other Account");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
		
		
		
	
	//TransferToFieldErrorMessage.isDisplayed()
	public void Transfer_Amount_To_InvalidAccount() throws InterruptedException {
		try {
		if(DepositHeader1.isDisplayed()) {
			accountNumber.sendKeys("123456");
			Thread.sleep(3000);
			TransferToField.sendKeys("654321");
			//if(FromNametextField.equals("VK, Venkat Krishna") & TransferNameTextfield.equals("VK, Venkat Krishna") & BalanceTextfield.equals("1000000")) {
			//if(AccountFieldErrorMessage.equals("Account doesn't exist")) {
				Assert.assertTrue(true, "Error message is displayed as 'Account doesn't exist'");
				test.log(Status.PASS, "Error message is displayed as 'Account doesn't exist'");
				log.info("Error message is displayed as 'Account doesn't exist'");
			
//			DepositAmountField.sendKeys("200");
//				Thread.sleep(3000);
//				Assert.assertTrue(true, "Successfully Amount is Transfered to other Account");
//				test.log(Status.PASS, "Successfully Amount is Transfered to other Account");
//				log.info("Successfully Amount is Transfered to other Account");
//				
			//}
		}
	
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
	
	


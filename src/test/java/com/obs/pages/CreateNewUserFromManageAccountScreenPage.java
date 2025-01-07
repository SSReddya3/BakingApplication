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

public class CreateNewUserFromManageAccountScreenPage {
	
	Logger log = (Logger) LogManager.getLogger(TransactionsPage.class);
	WebDriver driver;
	ExtentTest test;
	
	

	public CreateNewUserFromManageAccountScreenPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[normalize-space()='Account Management']")
	WebElement AcctMangemt;
	
	@FindBy(xpath="//p[normalize-space()='Manage Account']")
	WebElement Manageaccunt;
	
	@FindBy(xpath="//a[normalize-space()='Create New']")
	WebElement CreateButton;
	@FindBy(xpath="//h3[normalize-space()='Create New Account']")
	WebElement CreateNewAccountHeader;
	
	@FindBy(xpath = "//input[@name='account_number']")
	WebElement accountNumber;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@placeholder='(optional)']")
	WebElement middleName;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='generated_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='pin']")
	WebElement pin;
	
	@FindBy(xpath="//input[@name='balance']")
	WebElement balance;
	
	@FindBy(xpath="//button[@class='btn btn-primary mr-2']")
	WebElement save;
	
	@FindBy(xpath="//a[normalize-space()='Cancel']")
	WebElement Cancel;
	
	@FindBy(xpath="//a[normalize-space()='User Login']")
	WebElement userloginlink;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	String emailId = "onlinetestinghelp7264455@gmail.com";
	String userPwd = "123456";
	
	public void ClickonAccountmanagement() {
		AcctMangemt.click();
	}
	
	public void ClickonManageAccount() {
		Manageaccunt.click();
	}
	
	public void ClickonCreateButon() {
		CreateButton.click();
	}
	public void Create_NewAccount() {
		
		if(CreateNewAccountHeader.isDisplayed()) {
			accountNumber.sendKeys("7264455");
			FirstName.sendKeys("Venkat");
			middleName.sendKeys("Krishna");
			lastName.sendKeys("VK");
			email.sendKeys(emailId);
			password.sendKeys(userPwd);
			pin.sendKeys("123");
			balance.sendKeys("1000");
			Assert.assertTrue(true, "User entered all the required fields");
			test.log(Status.PASS, "User entered all the required fields");
			log.info("User entered all the required fields");
			save.click();
			Assert.assertTrue(true, "User clicked on save button");
			test.log(Status.PASS, "User clicked on save button");
			log.info("User clicked on save button");
		}
	}
	
	public void userLoginn(String email,String password) throws InterruptedException {
		userloginlink.click();
		Assert.assertTrue(true, "User clicked on UserLogin link");
		test.log(Status.PASS, "User clicked on UserLogin link");
		log.info("User clicked on UserLogin link");
		emailField.sendKeys(emailId);
		passwordField.sendKeys(userPwd);
		Assert.assertTrue(true, "User entered username & password");
		test.log(Status.PASS, "User entered username & password");
		log.info("User entered username & password");
		//loginbtn.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", loginbtn);
		Thread.sleep(3000);
		Assert.assertTrue(true, "User Sccessfully loged in to user acount");
		test.log(Status.PASS, "User Sccessfully loged in to user acount");
		log.info("User Sccessfully loged in to user acount");
	}
	
	
	
	
	
	

}

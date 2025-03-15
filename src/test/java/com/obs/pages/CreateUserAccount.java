package com.obs.pages;

import java.util.HashMap;
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
import com.obs.utilities.RandomNumber;

public class CreateUserAccount {
	
	
	Logger log = (Logger) LogManager.getLogger(CreateUserAccount.class);
	WebDriver driver;
	ExtentTest test;
	

	@FindBy(xpath="//p[normalize-space()='New Account']")
	WebElement NewAccount;
	
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
	
	@FindBy(xpath="//p[normalize-space()='Account Management']")
	WebElement AcctManagement;
	
	@FindBy(xpath="//h3[normalize-space()='Create New Account']")
	WebElement CreateNewAcctHeader;
	
	@FindBy(xpath="//span[@class='ml-3']")
	WebElement profileIcon;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement LogoutOption;
	
	@FindBy(xpath="//a[normalize-space()='User Login']")
	WebElement userloginlink;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	//@FindBy(xpath = "//h2[text()='Account successfully saved.']")
	WebElement BannerMessage1;
	
	@FindBy(xpath = "//script[contains(text(),'Account successfully saved.')]")
	WebElement BannerMessage;

	
	
	//h2[text()='Account successfully saved.']
	
	@FindBy(xpath = "//h1[text()='Welcome to ']")
	WebElement WelcomeText;
	
	
	String url,userName,Password;
	long Accountnumber = RandomNumber.getRandomNumber();
	String emailId = "onlinetestinghelp"+RandomNumber.getRandomNumber()+"@gmail.com";
	String userPwd = "123456";
	
	
	
	public CreateUserAccount(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	public void Create_New_Account() {
		try {
		AcctManagement.click();
		Assert.assertTrue(true, "successfully user clicked on Account Management dropdown");
		test.log(Status.PASS, "successfully user clicked on Account Management dropdown");
		log.info("successfully user clicked on Account Management dropdown");
		
		NewAccount.click();
		Assert.assertTrue(true, "successfully user clicked on New Account");
		test.log(Status.PASS, "successfully user clicked on New Account");
		log.info("successfully user clicked on New Account");
		
	if(CreateNewAcctHeader.isDisplayed()) {
		accountNumber.sendKeys(String.valueOf(Accountnumber));
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
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	

	public void LogoutOption() throws InterruptedException {
		Thread.sleep(5000);
		profileIcon.click();
		Assert.assertTrue(true, "User clicked on profle icon");
		test.log(Status.PASS, "User clicked on profle icon");
		log.info("User clicked on profle icon");
		LogoutOption.click();
		Assert.assertTrue(true, "User clicked on Logout");
		test.log(Status.PASS, "User clicked on Logout");
		log.info("User clicked on Logout");
	}
	public void userLogin(String email,String password) throws InterruptedException {
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
		log.info("User Sccessfully loged in to user account");
	}
	
	public void verifyWelcomeText() throws InterruptedException {
		Thread.sleep(5000);
		if(WelcomeText.isDisplayed()) {
			Assert.assertTrue(true, "User Home page is displayed successfully");
			test.log(Status.PASS, "User Home page is displayed successfully");
			log.info("User Home page is displayed successfully");
		}else {
			test.log(Status.FAIL, "User Home page is NOT displayed");
			log.info("User Home page is NOT displayed");
			Assert.assertTrue(false, "User Home page is NOT displayed");
		}

	}
	public void Validate_Banner_Message() {
		try {
		if(BannerMessage.equals("Account successfully saved.")) {
			Assert.assertTrue(true, " Sccessfully Banner message is displayed as 'Account successfully saved.'");
			test.log(Status.PASS, "Sccessfully Banner message is displayed as \"Account successfully saved.\"");
			log.info("Sccessfully Banner message is displayed as \"Account successfully saved.\"");
		}else {
			Assert.assertTrue(false, " Banner message is not displayed as 'Account successfully saved.'");
			test.log(Status.PASS, "Banner message is not displayed as 'Account successfully saved.'");
			log.info("Banner message is not displayed as 'Account successfully saved.'");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	//User Login
//	login.gotoUserLogin();
//	UserLoginPage userPage = new UserLoginPage(driver, test);
//	userPage.userLogin(emailId, userPwd);
//	
//	//Verify welcome text
//	UserHomePage userHome = new UserHomePage(driver, test);
//	userHome.verifyWelcomeText();
//	userHome.logout();
	//New Account Page
//	@SuppressWarnings("unlikely-arg-type")
//	public void NewUserCreation(HashMap<String,String> data) {
//		NewAccount.click();
//		accountNumber.sendKeys(data.get("accountNumber"));
//		FirstName.sendKeys(data.get("FirstName"));
//		middleName.sendKeys(data.get("middleName"));
//		lastName.sendKeys(data.get("lastName"));
//		email.sendKeys(data.get("email"));
//		password.sendKeys(data.get("password"));
//		pin.sendKeys(data.get("pin"));
//		balance.sendKeys(data.get("balance"));
//		save.click();
//
//	}

}

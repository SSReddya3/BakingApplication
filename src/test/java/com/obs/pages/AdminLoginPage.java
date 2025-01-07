package com.obs.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.obs.common.StandardWaitTimes;
import com.obs.tests.LoginTest;
import com.obs.utilities.ReadProperties;

public class AdminLoginPage  {
	
	Logger log = (Logger) LogManager.getLogger(AdminLoginPage.class);
	
	WebDriver driver;
	ExtentTest test;
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SignIn;
	
//	@FindBy(xpath = "//a[normalize-space()='Go to Website']")
//	WebElement goToWebSite;
	
	@FindBy(xpath = "//a[text()='User Login']")
	WebElement goToWebSite;
	
	public AdminLoginPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	public void login(String UN, String Pwd) {
		try {
			test.log(Status.PASS, "Verifying admin user login");
			log.info("Verifying admin user login");
			UserName.sendKeys(UN);
			Password.sendKeys(Pwd);
			
			SignIn.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gotoUserLogin() {
		try {
		test.log(Status.PASS, "Verifying gotoWebSite Link");
		log.info("Verifying gotoWebSite Link");
		goToWebSite.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void launchApp(String URL) {
		try {
		test.log(Status.PASS, "Verifying open admin user login");
		log.info("Verifying open admin user login");
		driver.get(URL);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void verifyLogin() throws IOException, InterruptedException {

		//Verify admin login
		String url,userName,Password;
		
		url = ReadProperties.readProp("AdminURL");
		userName = ReadProperties.readProp("AdminUN");
		Password = ReadProperties.readProp("AdminPwd");
		
		AdminLoginPage login = new AdminLoginPage(driver,test);
		login.launchApp(url);
		login.login(userName, Password);
		
		AdminHomePage adminHomePage = new AdminHomePage(driver,test);
		adminHomePage.verifyHomePageText();
		//adminHomePage.logout();
		
	}

}

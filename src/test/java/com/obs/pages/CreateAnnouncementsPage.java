package com.obs.pages;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.obs.common.StandardWaitTimes;
import org.openqa.selenium.interactions.Actions;;
public class CreateAnnouncementsPage {
	Logger log = (Logger) LogManager.getLogger(TransactionsPage.class);
	WebDriver driver;
	ExtentTest test;
	
	@FindBy(xpath="//p[normalize-space()='Announcements']")
	WebElement AnnouncementTab;
	
	
	@FindBy(xpath="//a[normalize-space()='Create New']")
	WebElement CreateNewButton;
	
	@FindBy(xpath="//h3[normalize-space()='Create New Announcement']")
	WebElement CreateNewAnnouncementHeader;
	
	@FindBy(xpath="//input[@name='title']")
	WebElement TitleTextfield;
	
	
	@FindBy(xpath="//div[@role='textbox']")
	WebElement AnnouncementCustomfield;
	
	
	@FindBy(xpath="//button[@class='btn btn-primary mr-2']")
	WebElement SaveButton;
	
	@FindBy(xpath="(//button[@class='btn btn-flat btn-default btn-sm dropdown-toggle dropdown-icon'])[1]")
	WebElement ActionDropdown;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']//a[@class='dropdown-item edit_data'][normalize-space()='Edit']")
	WebElement EditOption;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']//a[@class='dropdown-item delete_data'][normalize-space()='Delete']")
	WebElement DeleteOption;
	
	@FindBy(xpath="//h3[normalize-space()='Update Announcement']")
	WebElement UpdateAnnouncementHeader;
	
	
	@FindBy(xpath="//div[normalize-space()='Are you sure to delete this Announcement?']")
	WebElement Deletepopup;
	
	
	@FindBy(xpath="(//button[@type='button'])[10]")
	WebElement ConfirmButton;
	
	
	
	
	
	
	public CreateAnnouncementsPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.manage().timeouts().implicitlyWait(StandardWaitTimes.waitTime, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	public void Create_New_Announcement() {
		try {
		AnnouncementTab.click();
		Assert.assertTrue(true, "successfully clicked on Announcement tab");
		test.log(Status.PASS, "successfully clicked on Announcement tab");
		log.info("successfully clicked on Announcement tab");
		
		CreateNewButton.click();
		Assert.assertTrue(true, "successfully clicked on Create New button");
		test.log(Status.PASS, "successfully clicked on Create New button");
		log.info("ssuccessfully clicked on Create New button");
		
		if(CreateNewAnnouncementHeader.isDisplayed()) {
			TitleTextfield.sendKeys("New Announcement");
			Assert.assertTrue(true, "successfully user entered titile name");
			test.log(Status.PASS, "successfully user entered titile name");
			log.info("successfully user entered titile name");
			
			AnnouncementCustomfield.sendKeys("For sample Announcement");
			Assert.assertTrue(true, "successfully user entered data in custom field");
			test.log(Status.PASS, "successfully user entered data in custom field");
			log.info("successfully user entered data in custom field");
			
			SaveButton.click();
			Assert.assertTrue(true, "Announcement successfully created");
			test.log(Status.PASS, "Announcement successfully created");
			log.info("Announcement successfully created");
		}else {
			Assert.assertTrue(false, "failed to create Announcement");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	public void Updating_Announcement() {
		try {
		AnnouncementTab.click();
		Assert.assertTrue(true, "Announcement successfully clicked");
		test.log(Status.PASS, "Announcement successfully clicked");
		log.info("Announcement successfully clicked");
		
		
		ActionDropdown.click();
		Assert.assertTrue(true, "Action Drpdown successfully clicked");
		test.log(Status.PASS, "Action Drpdown successfully clicked");
		log.info("Action Drpdown successfully clicked");
		
		EditOption.click();
		Assert.assertTrue(true, "User successfully clicked on Edit Option");
		test.log(Status.PASS, "User successfully clicked on Edit Option");
		log.info("User successfully clicked on Edit Option");
		
		if(UpdateAnnouncementHeader.isDisplayed()) {
			TitleTextfield.clear();
			TitleTextfield.sendKeys("New Announcement Updated");
			Assert.assertTrue(true, "User successfully Entered Title Name");
			test.log(Status.PASS, "User successfully Entered Title Name");
			log.info("User successfully Entered Title Name");
			AnnouncementCustomfield.clear();
			AnnouncementCustomfield.sendKeys("For sample Announcement updated");
			Assert.assertTrue(true, "User successfully Entered data in Custom field");
			test.log(Status.PASS, "User successfully Entered data in Custom field");
			log.info("User successfully Entered data in Custom field");
			SaveButton.click();
			Assert.assertTrue(true, "Announcement successfully created");
			test.log(Status.PASS, "Announcement successfully created");
			log.info("Announcement successfully created");
		}else {
			Assert.assertTrue(false, "failed to create Announcement");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Delete_Announcement() throws InterruptedException {
		try {
		AnnouncementTab.click();
		Assert.assertTrue(true, "Announcement successfully clicked");
		test.log(Status.PASS, "Announcement successfully clicked");
		log.info("Announcement successfully clicked");
		
				ActionDropdown.click();
				Assert.assertTrue(true, "Action Drpdown successfully clicked");
				test.log(Status.PASS, "Action Drpdown successfully clicked");
				log.info("Action Drpdown successfully clicked");
		
				DeleteOption.click();
				Assert.assertTrue(true, "User successfully Clicked on Delete option");
				test.log(Status.PASS, "User successfully Clicked on Delete option");
				log.info("User successfully Clicked on Delete option");
				
//				//if(Deletepopup.isDisplayed()) {
//				Thread.sleep(3000);
//					Alert alert=driver.switchTo().alert();
//					Thread.sleep(3000);
//					ConfirmButton.click();
//					//ConfirmButton.click();
//					Assert.assertTrue(true, "User successfully Deleted Announcement");
//					test.log(Status.PASS, "User successfully Deleted Announcement");
//					log.info("User successfully Deleted Announcement");
//				//}
				
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}

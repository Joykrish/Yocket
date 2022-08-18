package com.CollageFinder.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.CollageFinder.Commands.ActionDriver;
import Com.CollageFinder.Configeration.BrowserSettings;

public class UniversityAndCollageFinder extends BrowserSettings {
	ActionDriver ad;

	@FindBy(xpath = "(//button[@class='w-full sm:w-auto px-4 py-1 sm:px-10 text-xl text-white bg-orange-400 border border-transparent rounded-md shadow-sm hover:bg-orange-500 focus:outline-none'])[2]")
	private WebElement btnMaster;

	@FindBy(xpath = "(//div[@class='vs__actions'])[1]")
	private WebElement inputSelectCounty;

	@FindBy(xpath = "(//div[@class='vs__actions'])[2]")
	private WebElement inputSelectMajor;

	@FindBy(xpath = "//ul[@id=\"vs1__listbox\"]")
	private WebElement listCounty;

	@FindBy(xpath = "//ul[@id=\"vs2__listbox\"]")
	private WebElement listMajor;

	@FindBy(xpath = "//input[@placeholder='Select Country']")
	private WebElement typeCounty;

	@FindBy(xpath = "//input[@placeholder='Select Major']")
	private WebElement typeMajor;

	@FindBy(xpath = "//button[contains(text(), 'Next')]")
	private WebElement btnNext;

	@FindBy(xpath = "(//span[text()='Required field'])[1]")
	private WebElement countryMandatory;

	@FindBy(xpath = "(//span[text()='Required field'])[2]")
	private WebElement majorMandatory;
	
	@FindBy(xpath = "(//span[text()='Required field'])[3]")
	private WebElement scoreMandatory;

	@FindBy(xpath = "//input[@placeholder='Select College']")
	private WebElement inputSelectcollagename;

	@FindBy(xpath = "//ul[@id=\"vs4__listbox\"]")
	private WebElement listcollagename;

	@FindBy(xpath = "//ul[@id=\"vs6__listbox\"]")
	private WebElement MajorCourselist;

	@FindBy(xpath = "//input[@id='marks']")
	private WebElement inputMarks;

	@FindBy(xpath = "//div[contains(text(),'TOEFL')]")
	private WebElement selectEnglishTest;

	@FindBy(xpath = "//input[@id='toefl_overall_score']")
	private WebElement enterscore;

	@FindBy(xpath = "//div[contains(text(),'GMAT')]")
	private WebElement selectAptitudetest;

	@FindBy(xpath = "//input[@id='total_gmat_score']")
	private WebElement inputAptitudescore;

	@FindBy(xpath = "//input[@id='work_exp']")
	private WebElement inputworkexp;

	@FindBy(xpath = "//input[@id='project']")
	private WebElement inputprojectwork;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement FindUniversity;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	private WebElement btnLogin;

	@FindBy(xpath = "//input[@id='mobileInput']")
	private WebElement txtmopbilebumber;

	@FindBy(xpath = "//button[contains(text(),'Request Code')]")
	private WebElement btnRequestCode;
	
	@FindBy(xpath = "//button[contains(text(),'Verify and Proceed')]")
	private WebElement btnVerify;
	
	@FindBy(xpath = "(//span[text()='Shortlist '])[1]")
	private WebElement btnShortlist;
	
	
	@FindBy(xpath = "//button[contains(text(),'Shortlist & Join Group')]")
	private WebElement btnShortlistjoingroup;
	
	
	@FindBy(xpath = " //p[contains(text(),'Course shortlisted and you’re added to cerighton | 2022')]")
	private WebElement courseshortlistedmessage;
	
	
	
	
	

	
	

	public UniversityAndCollageFinder() {
		PageFactory.initElements(driver, this);
	}

	public void selectMaster() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Select Master");
		ad = new ActionDriver();
		ad.click(driver, btnMaster, "Clicked on Master Successfully");
	}

	public void selectCountry() throws IOException, InterruptedException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Select country");
		ad = new ActionDriver();
		ad.click(driver, inputSelectCounty, "Clicked on Master Successfully");
		Thread.sleep(1000);
		ad.typenew(typeCounty, "United States", "typed successfully into country ");
		ad.click(driver, listCounty, "selected successfully");

		// String list=ad.GetText(listCounty, "list captured successfully");
		// System.out.println(list);

	}

	public void SelectMajor() throws IOException, InterruptedException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Select country");
		ad = new ActionDriver();
		ad.click(driver, inputSelectMajor, "Clicked on Master Successfully");
		Thread.sleep(1000);
		ad.typenew(typeMajor, "data science", "typed successfully into major ");
		Thread.sleep(10000);
		ad.click(driver, listMajor, "selected the major successfully");

	}

	public void clickNext() throws IOException {

		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Click Next Button");
		ad = new ActionDriver();
		ad.click(driver, btnNext, "Clicked on  Next Button Successfully");

	}

	public String readCountryMandatory() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Read message that country is mandaory");
		ad = new ActionDriver();
		String Countrymessagebox = ad.GetText(countryMandatory, "Message of Country is mandatory is read successfully");

		return Countrymessagebox;

	}

	public String readMajorMandatory() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Read message that Major is mandaory");
		
		ad = new ActionDriver();
		String Majormessagebox = ad.GetText(majorMandatory, "Message of Country is mandatory is read successfully");

		return Majormessagebox;

	}
	
	public String readscoreMandatory() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Read message that Score is mandaory");
		ad = new ActionDriver();
		String Scoremessagebox = ad.GetText(scoreMandatory, "Message of Country is mandatory is read successfully");
		return Scoremessagebox;
	}

	public void selectCollagename() throws IOException, InterruptedException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Select Collage name");
		ad = new ActionDriver();
		ad.click(driver, inputSelectcollagename, "Clicked on Collage Successfully");
		Thread.sleep(1000);
		ad.typenew(inputSelectcollagename, "apex", "typed successfully into major ");
		Thread.sleep(10000);
		ad.click(driver, listcollagename, "selected the Collage  successfully");

	}

	public void selectMajorCourse() throws IOException, InterruptedException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Select Major Course name");
		ad = new ActionDriver();
		ad.click(driver, typeMajor, "Clicked on Major Course Successfully");
		Thread.sleep(1000);
		ad.typenew(typeMajor, "accounting", "typed successfully into major course successfully ");
		Thread.sleep(10000);
		ad.click(driver, MajorCourselist, "selected the Collage  successfully");

	}

	public void enterScore() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Select enter score");
		ad = new ActionDriver();
		ad.typenew(inputMarks, "7", "Marked entered successfully");

	}

	public void selectEnglishTest() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Select enter score");
		ad = new ActionDriver();
		ad.click(driver, selectEnglishTest, "English test selected Successfully");

	}

	public void entertoffleScore() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Enter score");
		ad = new ActionDriver();
		ad.typenew(enterscore, "100", "score entered successfully");

	}

	public void selectAptitudetest() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Enter score");
		ad = new ActionDriver();
		ad.click(driver, selectAptitudetest, "Aptitude test selected successfully");

	}

	public void enterAptitudetestscore() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Enter Aptitude test score");
		ad = new ActionDriver();
		ad.typenew(inputAptitudescore, "700", "Aptitude score entered successfully");

	}

	public void enterexperience() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Enter Experience");
		ad = new ActionDriver();
		ad.typenew(inputworkexp, "10", "Experience entered successfully");

	}

	public void enterprojectcount() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Enter Project Count");
		ad = new ActionDriver();
		ad.typenew(inputprojectwork, "4", "Project count entered successfully");

	}

	public void clickFindUniversities() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Click on Find University");
		ad = new ActionDriver();
		ad.click(driver, FindUniversity, "Clicked on Find University");

	}

	public void login() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Click on Login button");
		ad = new ActionDriver();
		ad.click(driver, btnLogin, "Clicked on login button successfully");
	}

	public void enterMobilebumber() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Enter Mobile Number");
		ad = new ActionDriver();
		ad.typenew(txtmopbilebumber, "7738520461", "Entered mobile Number Successfully");
	}

	public void clickRequestCode() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Click Request Code");
		ad = new ActionDriver();
		ad.click(driver, btnRequestCode, "Clicked RequestCode");

	}
	
	public void verifyOTP() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Verify OTP");
		ad = new ActionDriver();
		ad.click(driver, btnVerify, "Clicked on Verify Button Successfully");
		
	}
	
	

	public void SortbyCost() {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Sort By Cost");
		ad = new ActionDriver();

		Select dropdownsort = new Select(driver.findElement(By.xpath(
				"//select[@class='text-md bg-transparent font-semibold border border-appBackground focus:border-appBackground cursor-pointer']")));
		dropdownsort.selectByVisibleText("Cost");
	}

	public void shortlistFirstUni() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Clicked on Shortlist button");
		ad = new ActionDriver();
		ad.click(driver, btnShortlist, "First University Shortlisted Successfully");

		
	}
	
	public void shortlistandJoinGroup() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("Shortlist and Join Group");
		ad = new ActionDriver();
		ad.click(driver, btnShortlistjoingroup, "Clicked on Shortlist and joined group btn Successfully");
		
	}
	
	public String ShorlistedMessage() throws IOException {
		BrowserSettings.childTest = BrowserSettings.parentTest.createNode("ReadConfirmation Message");
		ad = new ActionDriver();
		String ConfirmationMessage=ad.GetText(courseshortlistedmessage, "shortlisted Message read successfully");
		return ConfirmationMessage;
	}
}

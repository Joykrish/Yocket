package com.CollageFinder.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CollageFinder.PageObjects.LauchWebsite;
import com.CollageFinder.PageObjects.OpenCollageFinder;
import com.CollageFinder.PageObjects.UniversityAndCollageFinder;

import Com.CollageFinder.Configeration.BrowserSettings;

public class VerifyMandatory extends BrowserSettings {
@Test(priority=1)
  public void verifyMandatoryCountry() throws IOException, InterruptedException {
	
	  OpenCollageFinder CF=new OpenCollageFinder();
	  LauchWebsite LW=new LauchWebsite();
	  UniversityAndCollageFinder UCF=new UniversityAndCollageFinder();
	  LW.openWebsite();
	  Thread.sleep(10000);
	  CF.openCollageFinder();
	  Thread.sleep(1000);
	  UCF.selectMaster();
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  Assert.assertEquals(UCF.readCountryMandatory(), "Required field");
	  
	 
	  
  }
 @Test(priority=2)
  public void verifyMandatoryMajor() throws IOException, InterruptedException {
	 
	  OpenCollageFinder CF=new OpenCollageFinder();
	  LauchWebsite LW=new LauchWebsite();
	  UniversityAndCollageFinder UCF=new UniversityAndCollageFinder();
	  LW.openWebsite();
	  Thread.sleep(10000);
	  CF.openCollageFinder();
	  UCF.selectMaster();
	  UCF.clickNext();
	  Thread.sleep(1000);
	  Assert.assertEquals(UCF.readMajorMandatory(), "Required field");
	 
	  
  }
 @Test(priority=3)
  public void verifyMandatoryCollagelist() throws IOException, InterruptedException {
	 
	  OpenCollageFinder CF=new OpenCollageFinder();
	  LauchWebsite LW=new LauchWebsite();
	  UniversityAndCollageFinder UCF=new UniversityAndCollageFinder();
		/*
		 * LW.openWebsite(); Thread.sleep(1000); CF.openCollageFinder();
		 * Thread.sleep(1000); UCF.selectMaster(); Thread.sleep(1000);
		 */
	  UCF.selectCountry();
	  Thread.sleep(1000);
	  UCF.SelectMajor();
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  Assert.assertEquals(UCF.readCountryMandatory(), "Required field");
	  
	  
  }
 @Test(priority=4)
 public void verifyMandatoryMajorCourses() throws InterruptedException, IOException {
	 
	  OpenCollageFinder CF=new OpenCollageFinder();
	  LauchWebsite LW=new LauchWebsite();
	  UniversityAndCollageFinder UCF=new UniversityAndCollageFinder();
		/*
		 * LW.openWebsite(); Thread.sleep(1000); CF.openCollageFinder();
		 * Thread.sleep(1000); UCF.selectMaster(); Thread.sleep(1000);
		 * UCF.selectCountry(); Thread.sleep(1000); UCF.SelectMajor();
		 */
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  Assert.assertEquals(UCF.readMajorMandatory(), "Required field");
	  
	 
 }
 
@Test(priority=5)
  public void verifyScoreMandatory() throws InterruptedException, IOException {
	
	  OpenCollageFinder CF=new OpenCollageFinder();
	  LauchWebsite LW=new LauchWebsite();
	  UniversityAndCollageFinder UCF=new UniversityAndCollageFinder();
		/*
		 * LW.openWebsite(); Thread.sleep(1000); CF.openCollageFinder();
		 * Thread.sleep(1000); UCF.selectMaster(); Thread.sleep(1000);
		 * UCF.selectCountry(); Thread.sleep(1000); UCF.SelectMajor();
		 */
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  Assert.assertEquals(UCF.readscoreMandatory(), "Required field");
	 
	  
  }
  
}

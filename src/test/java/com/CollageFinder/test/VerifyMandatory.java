package com.CollageFinder.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CollageFinder.PageObjects.LauchWebsite;
import com.CollageFinder.PageObjects.OpenCollageFinder;
import com.CollageFinder.PageObjects.UniversityAndCollageFinder;

import Com.CollageFinder.Configeration.BrowserSettings;

public class VerifyMandatory extends BrowserSettings {
@Test
  public void verifyMandatoryCountry() throws IOException, InterruptedException {
	Thread.sleep(10000);
	  OpenCollageFinder CF=new OpenCollageFinder();
	  LauchWebsite LW=new LauchWebsite();
	  UniversityAndCollageFinder UCF=new UniversityAndCollageFinder();
	  LW.openWebsite();
	  Thread.sleep(1000);
	  CF.openCollageFinder();
	  Thread.sleep(1000);
	  UCF.selectMaster();
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  Assert.assertEquals(UCF.readCountryMandatory(), "Required field");
	  
	 
	  
  }
 @Test
  public void verifyMandatoryMajor() throws IOException, InterruptedException {
	 Thread.sleep(10000);
	  OpenCollageFinder CF=new OpenCollageFinder();
	  LauchWebsite LW=new LauchWebsite();
	  UniversityAndCollageFinder UCF=new UniversityAndCollageFinder();
	  LW.openWebsite();
	  Thread.sleep(1000);
	  CF.openCollageFinder();
	  UCF.selectMaster();
	  UCF.clickNext();
	  Thread.sleep(1000);
	  Assert.assertEquals(UCF.readMajorMandatory(), "Required field");
	 
	  
  }
 @Test
  public void verifyMandatoryCollagelist() throws IOException, InterruptedException {
	 Thread.sleep(10000);
	  OpenCollageFinder CF=new OpenCollageFinder();
	  LauchWebsite LW=new LauchWebsite();
	  UniversityAndCollageFinder UCF=new UniversityAndCollageFinder();
	  LW.openWebsite();
	  Thread.sleep(1000);
	  CF.openCollageFinder();
	  Thread.sleep(1000);
	  UCF.selectMaster();
	  Thread.sleep(1000);
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
 @Test
 public void verifyMandatoryMajorCourses() throws InterruptedException, IOException {
	 Thread.sleep(10000);
	  OpenCollageFinder CF=new OpenCollageFinder();
	  LauchWebsite LW=new LauchWebsite();
	  UniversityAndCollageFinder UCF=new UniversityAndCollageFinder();
	  LW.openWebsite();
	  Thread.sleep(1000);
	  CF.openCollageFinder();
	  Thread.sleep(1000);
	  UCF.selectMaster();
	  Thread.sleep(1000);
	  UCF.selectCountry();
	  Thread.sleep(1000);
	  UCF.SelectMajor();
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  Assert.assertEquals(UCF.readMajorMandatory(), "Required field");
	  
	 
 }
 
@Test 
  public void verifyScoreMandatory() throws InterruptedException, IOException {
	 Thread.sleep(10000);
	  OpenCollageFinder CF=new OpenCollageFinder();
	  LauchWebsite LW=new LauchWebsite();
	  UniversityAndCollageFinder UCF=new UniversityAndCollageFinder();
	  LW.openWebsite();
	  Thread.sleep(1000);
	  CF.openCollageFinder();
	  Thread.sleep(1000);
	  UCF.selectMaster();
	  Thread.sleep(1000);
	  UCF.selectCountry();
	  Thread.sleep(1000);
	  UCF.SelectMajor();
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  Assert.assertEquals(UCF.readscoreMandatory(), "Required field");
	 
	  
  }
  
}

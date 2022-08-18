package com.CollageFinder.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CollageFinder.PageObjects.LauchWebsite;
import com.CollageFinder.PageObjects.OpenCollageFinder;
import com.CollageFinder.PageObjects.UniversityAndCollageFinder;

import Com.CollageFinder.Configeration.BrowserSettings;

public class VerifyCFandUFflow extends BrowserSettings {
  @Test
  public void verifyCollagefinderUniFinder() throws IOException, InterruptedException {
	  
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
	  UCF.SelectMajor();
	  UCF.clickNext();
	  UCF.selectCollagename();
	  UCF.selectMajorCourse();
	  UCF.enterScore();
	  UCF.clickNext();
	  Thread.sleep(1000);
	  UCF.selectEnglishTest();
	  Thread.sleep(1000);
	  UCF.entertoffleScore();
	  Thread.sleep(1000);
	  UCF.selectAptitudetest();
	  UCF.enterAptitudetestscore();
	  Thread.sleep(1000);
	  UCF.clickNext();
	  Thread.sleep(1000);
	  UCF.enterexperience();
	  UCF.enterprojectcount();
	  UCF.clickFindUniversities();
	  Thread.sleep(1000);
	  UCF.login();
	  Thread.sleep(1000);
	  UCF.enterMobilebumber();
	  UCF.clickRequestCode();
	  Thread.sleep(30000);
	  UCF.verifyOTP();
	  Thread.sleep(10000);
	  UCF.SortbyCost();
	  Thread.sleep(1000);
	  UCF.shortlistFirstUni();
	  Thread.sleep(1000);
	  UCF.shortlistandJoinGroup();
	  Thread.sleep(1000);
	  Assert.assertEquals(UCF.ShorlistedMessage(),"Course shortlisted and you’re added to cerighton | 2022");
	  
  }
}

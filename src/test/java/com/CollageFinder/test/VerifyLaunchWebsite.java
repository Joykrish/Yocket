package com.CollageFinder.test;

import org.testng.annotations.Test;
import com.CollageFinder.PageObjects.*;

import Com.CollageFinder.Configeration.BrowserSettings;



public class VerifyLaunchWebsite extends  BrowserSettings {
  @Test
  public void verifyLaunchWebsite() {
	  LauchWebsite lw=new LauchWebsite();
	  lw.openWebsite();
  }
}

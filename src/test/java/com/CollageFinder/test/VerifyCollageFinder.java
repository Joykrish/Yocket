package com.CollageFinder.test;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

import com.CollageFinder.PageObjects.LauchWebsite;
import com.CollageFinder.PageObjects.OpenCollageFinder;

import Com.CollageFinder.Configeration.BrowserSettings;

public class VerifyCollageFinder extends BrowserSettings {
  @Test
  public void verifyOpenCollageFinder() throws IOException, InterruptedException {
	  
	  OpenCollageFinder CF=new OpenCollageFinder();
	  LauchWebsite LW=new LauchWebsite();
	  Thread.sleep(10000);
	  LW.openWebsite();
	  CF.openCollageFinder();
  }
}

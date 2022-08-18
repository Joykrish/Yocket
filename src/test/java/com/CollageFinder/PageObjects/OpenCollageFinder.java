package com.CollageFinder.PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CollageFinder.Commands.ActionDriver;
import Com.CollageFinder.Configeration.BrowserSettings;

public class OpenCollageFinder extends BrowserSettings{
	
	 ActionDriver ad; 
	@FindBy(xpath = "//span[text()='College Finder']")
	private WebElement linkCollageFinder;
	
	public OpenCollageFinder() {
		PageFactory.initElements(driver, this);
	}
	
	public void openCollageFinder() throws IOException {
		BrowserSettings.childTest=BrowserSettings.parentTest.createNode("Open Collage Finder");
		ad=new ActionDriver();
		ad.click(driver, linkCollageFinder, "Clicked On Collage Finder");
		
	}
	
	

}

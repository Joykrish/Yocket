package com.CollageFinder.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Com.CollageFinder.Configeration.BrowserSettings;

public class LauchWebsite extends BrowserSettings {
	
	public  LauchWebsite() {
		PageFactory.initElements(driver, this);
	}

	public void openWebsite() {
		driver.get("https://yocket.com/");
		
	}
}

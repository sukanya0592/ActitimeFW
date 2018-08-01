package com.actitime.ObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {
	@FindBy(linkText="project&Customer")
	private WebElement proAndcustlink;
	public void navigateToProjectAndcustPage() {
		proAndcustlink.click();	
	}

}

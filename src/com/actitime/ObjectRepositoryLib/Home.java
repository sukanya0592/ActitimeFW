package com.actitime.ObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
@FindBy(xpath="//div[text()='Task']/..")
private WebElement taskImg;
@FindBy(xpath="//div[text()='users']/..")
private WebElement userImg;
public void navigateToTaskPage() {
	taskImg.click();
	
}
public void navigateTouserPage() {
	userImg.click();
}

}

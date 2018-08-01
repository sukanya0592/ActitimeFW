package com.actitime.ObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
@FindBy(name="username")
private WebElement usernameEdt;
@FindBy(name="pwd")
private WebElement passwordEdt;


@FindBy(id="LoginButton")
private WebElement LoginButton ;
//------------------------
public WebElement getUsernameEdt() {
	return usernameEdt;
	}
public WebElement passwordEdt() {
	return passwordEdt;
	}
public WebElement getLoginButton() {
	return LoginButton;
	}
//reusable buisness Lib/Action
public void login(String username,String password) {
	usernameEdt.sendKeys(username);
	passwordEdt.sendKeys(password);
	LoginButton.click();
}}
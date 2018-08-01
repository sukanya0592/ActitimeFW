package com.actitime.ObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatCustomer {
@FindBy(name="name")
private WebElement CustomerNameEdt;
@FindBy(name="description")
private WebElement CustomerDescEdt;
@FindBy(name="CreatCustomerSubmit")
private WebElement CreatCustomerBtn;
//overloaded btn
public void CreatCustomer(String CustomerName) {
	CustomerNameEdt.sendKeys(CustomerName);	
	CreatCustomerBtn.click();
	
}
public void CreatCustomer(String CustomerName,String desc) {
	CustomerNameEdt.sendKeys(CustomerName);	
	CustomerDescEdt.sendKeys(desc);
	CreatCustomerBtn.click();
}
}

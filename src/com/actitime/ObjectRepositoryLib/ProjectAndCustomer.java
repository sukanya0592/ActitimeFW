package com.actitime.ObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomer {
	@FindBy(xpath="//input[@value='Creat New Customer']")
	private WebElement creatCustomerBtn;
	@FindBy(xpath="//span[@class='succesmsg']")
	private WebElement sucMsg;
	public void navigateCreatNewCustomerPage()
	{
		creatCustomerBtn.click();
		
	}

	public WebElement getsucMsg()
	{
     return sucMsg;
		
	}


}

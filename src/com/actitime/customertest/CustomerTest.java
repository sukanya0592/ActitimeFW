package com.actitime.customertest;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.ObjectRepositoryLib.CreatCustomer;
import com.actitime.ObjectRepositoryLib.Home;
import com.actitime.ObjectRepositoryLib.OpenTask;
import com.actitime.ObjectRepositoryLib.ProjectAndCustomer;
import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileUtils;

public class CustomerTest extends BaseClass {
	@Test
	public void creatCustomerTest() throws Throwable
	{
		//read the test data
		FileUtils lib=new FileUtils();
		String CustomerName=lib.getExcelData("Sheet1",2,2);
		//navigate to task page
		Home hp=PageFactory.initElements(driver,Home.class);
		hp.navigateToTaskPage();
		//click on project and cutomer link
		OpenTask op=PageFactory.initElements(driver,OpenTask.class);
		op.navigateToProjectAndcustPage();
		//click on create new customer page
		ProjectAndCustomer pandc=PageFactory.initElements(driver, ProjectAndCustomer.class);
		pandc.navigateCreatNewCustomerPage();
		//creat customer
		CreatCustomer cc=PageFactory.initElements(driver,CreatCustomer.class);
		cc.CreatCustomer(CustomerName);
		//identify and varify the msg
		String actmsg=pandc.getsucMsg().getText();
		String expmsg="Successfully created";
		boolean stat=actmsg.contains(expmsg);
		Assert.assertTrue(stat);
		
	//driver.close();	
		
	}

}

package com.actitime.genericlib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.ObjectRepositoryLib.Common;
import com.actitime.ObjectRepositoryLib.Login;

public class BaseClass {
	public static WebDriver driver;
	FileUtils lib=new FileUtils();
	@Parameters("browser")
	@BeforeClass
	public void ConfigBC() throws Throwable
	{
		Properties	pObj =lib.getPropertiesFileObj();
		
		String bName=pObj.getProperty("browser");
		if(bName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(bName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
			driver=new ChromeDriver();
		}
	}
	
	@BeforeMethod
	public void ConfigBM()throws Throwable
	{
		System.out.println("login");
		Properties	pObj =lib.getPropertiesFileObj();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(pObj.getProperty("url"));
		Login lp=PageFactory.initElements(driver,Login.class);
		lp.login(pObj.getProperty("username"),pObj.getProperty("passwaord"));
		}
	@AfterMethod
	public void ConfigAM() {
		System.out.println("Logout");
		Common cp=PageFactory.initElements(driver,Common.class);
		cp.logout();
				}
	@AfterClass
	public void ConfigAC() {
		System.out.println("===closedriver===");
		driver.close();
	}
	
	
	

}

package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListner implements ITestListener {
	@Override
	public void onTestFailure(ITestResult t) {
		String failedtestName=t.getMethod().getMethodName();
		System.out.println("testfail===>"+failedtestName);
		
		EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.driver);
		File SrcFile=eDriver.getScreenshotAs(OutputType.FILE);
		File dstFile=new File("./FrameWorkScreenShot"+failedtestName+"testListener.png");
		try {
			FileUtils.copyFile(SrcFile,dstFile);
			
		}
		catch(IOException e)
		{
			
		}

	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}

package com.webcom.generic;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.IClassListener;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {

	WebDriver driver= BaseTest.driver;
	
	public void onTestStart(ITestResult result) {
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("ValidLoginTest");
		
	}

	public void onTestSuccess(ITestResult result) {
		Log.info("sucessful login");
		
	}

	public void onTestFailure(ITestResult result) {
		try {
			ScreenShot.takeScreenShot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Log.error("Unsuccessfull Login");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

}

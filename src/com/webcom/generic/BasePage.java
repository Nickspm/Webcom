package com.webcom.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.webcom.interfaces.IPages;

public class BasePage implements IPages {
public  WebDriver driver;
	

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyTitle(String eTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Pass: Title is matching", true);
		} catch (Exception e) {
			Reporter.log("Fail: Title is not matching", true);
			Assert.fail();
		}

	}
}

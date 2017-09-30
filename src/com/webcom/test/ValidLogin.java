package com.webcom.test;

import org.testng.annotations.Test;

import com.webcom.generic.BaseTest;
import com.webcom.pages.LoginPage;

public class ValidLogin extends BaseTest {
	@Test(priority =1)
	public void testValidLogin() throws InterruptedException{
		LoginPage l = new LoginPage(driver);
		l.enterUserName(UNAME);
		l.enterPassword(PWD);
		l.clickLogin();
		Thread.sleep(500);

	}
}
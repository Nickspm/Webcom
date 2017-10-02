package com.webcom.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.webcom.interfaces.Itest;
import com.webcom.pages.AvailableSystemspages;
import com.webcom.pages.LoginPage;

public class BaseTest implements Itest  {
	public static WebDriver driver;
	/* AvailableSystemspages AvailableSystems = new AvailableSystemspages(driver); */
	
	
	public BaseTest() {
	
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		this.driver = new ChromeDriver();
	}
	@BeforeClass
	public void login(){
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		LoginPage l = new LoginPage(driver);
		l.enterUserName(UNAME);
		l.enterPassword(PWD);
		l.clickLogin(); 
	}
	@AfterClass
	public void postCondition(){}
	/* @AfterMethod
	public void logout(){
		
		AvailableSystems.clickLogout();
		driver.quit();
		
	}
	@BeforeTest
	public void precondition() {
		AvailableSystems.selectDropdown(AVISYSFILTERTYP, SYSTEMID);
		}
	@AfterTest
	public void postCondition() {
	
	}*/
}

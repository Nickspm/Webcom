package com.webcom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.webcom.generic.BasePage;

public class LoginPage extends BasePage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	}

	@FindBy(id="Label3") private WebElement version;
	@FindBy(xpath= "//h1[.='Welcome to WebCom']")private WebElement welComeMessage;
	@FindBy(id= "Login1_UserName") private WebElement UsernameTB;
	@FindBy(id= "Login1_Password") private WebElement PwdTB;
	@FindBy(id= "Login1_fpassemail") private WebElement forgotPwdLnk;
	@FindBy(id= "Login1_btnSignIn") private WebElement loginBtn;

	public void verifyVersion(){
		Assert.assertEquals(VERSION, version.getText());
	}

	public void verifyTitle(){
		Assert.assertEquals(LOGINTTL, forgotPwdLnk.getText());
	}
	public void verifyForgotPWDLink(){
		Assert.assertEquals(FORGOTPWDTEXT, driver.getTitle());
	}

	public void enterUserName(String userName){
		UsernameTB.sendKeys(userName);
	}
	public void clearUserName(String userName){
		UsernameTB.clear();
	}
	public void enterPassword(String pwd){
		PwdTB.sendKeys(pwd);
	}
	public void clearPassword(String pwd){
		PwdTB.clear();
	}
	public void clickLogin(){
		loginBtn.click();
	}


}

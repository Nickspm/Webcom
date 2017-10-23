package com.webcom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webcom.generic.BasePage;

public class TestSystemPage extends BasePage{

	public TestSystemPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//span[text()='Reports']") private WebElement Reports;
//	@FindBy(linkText="Transaction Report") private WebElement TxnReports;
//	@FindBy(linkText="Transaction Report") private WebElement TxnReports;
//	@FindBy(linkText="Transaction Report") private WebElement TxnReports;
//	@FindBy(linkText="Transaction Report") private WebElement TxnReports;
	

}

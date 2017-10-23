package com.webcom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.webcom.generic.BasePage;

public class Reports extends BasePage {

	public Reports(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	}

}

package com.webcom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.webcom.generic.BasePage;

public class AvailableSystemspages extends BasePage {

	public AvailableSystemspages(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="lbLogOut") private WebElement logoutbtn;
	@FindBy(id="ctl00_cph1_gvAvailableSystems_ctl00_ctl02_ctl00_ddlFieldName") private WebElement changeSystemid;
	@FindBy(id="ctl00_cph1_gvAvailableSystems_ctl00_ctl02_ctl00_ddlFieldName") private WebElement filterDropdown;
	@FindBy(id="ctl00_cph1_gvAvailableSystems_ctl00_ctl02_ctl00_txtSearch") private WebElement systemidTxtBox;
	@FindBy(id="ctl00_cph1_gvAvailableSystems_ctl00_ctl02_ctl00_btnSearch") private WebElement filterBtn;
	@FindBy(xpath=".//*[.='Prannoy Test System']") private WebElement Pts;
	//@FindBy(xpath=".//*[.='Prannoy Test System']") private WebElement Pts;

	
	
	public void selectDropdown(String filtertype, String value){
		Select dropdown = new Select(filterDropdown);
		dropdown.selectByVisibleText(filtertype);
		systemidTxtBox.sendKeys(value);
		filterBtn.click();
		Pts.click();
		
	}
	
	public void clickLogout(){
		logoutbtn.click();
	}
}

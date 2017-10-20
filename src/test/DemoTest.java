package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoTest {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://webcom5-qa.cxmlpg.com");
	driver.findElement(By.id("Login1_UserName")).sendKeys("t_rajatd1@verifone.com");
	driver.findElement(By.id("Login1_Password")).sendKeys("Oct@2017");
	driver.findElement(By.id("Login1_btnSignIn")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("lbLogOut")).click();
	//Select dropdown = new Select(driver.findElement(By.id("ctl00_cph1_gvAvailableSystems_ctl00_ctl02_ctl00_ddlFieldName")));
	//dropdown.selectByVisibleText("System Id");
	//driver.findElement(By.id("ctl00_cph1_gvAvailableSystems_ctl00_ctl02_ctl00_txtSearch")).sendKeys("30004814");
	//driver.findElement(By.id("ctl00_cph1_gvAvailableSystems_ctl00_ctl02_ctl00_btnSearch")).click();
	
	
	
}

}

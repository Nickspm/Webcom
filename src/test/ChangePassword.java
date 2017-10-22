package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangePassword {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webcom5-qa.cxmlpg.com/Default.aspx?id=1");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.findElement(By.id("Login1_UserName")).sendKeys("t_rajatd1@verifone.com");
		driver.findElement(By.id("Login1_Password")).sendKeys("Nov@2017");
	    driver.findElement(By.id("Login1_btnSignIn")).click();
	    driver.findElement(By.xpath("//a[.='t_rajatd1@verifone.com']")).click();
	   Thread.sleep(1000);
	   WebElement frame1 = driver.findElement(By.name("ChgPwrd"));
	  driver.switchTo().frame(frame1);
	    
	driver.findElement(By.xpath(".//*[@id='txtCurrentPwrd']")).sendKeys("Nov@2017");
	driver.quit();

}
	}


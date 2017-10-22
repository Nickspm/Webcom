package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class DemoTest {
	
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
    //Thread.sleep(1000);
//	driver.findElement(By.id("lbLogOut")).click();
    //Thread.sleep(5000);
    Select dropdown = new Select(driver.findElement(By.id("ctl00_cph1_gvAvailableSystems_ctl00_ctl02_ctl00_ddlFieldName")));
   dropdown.selectByVisibleText("System Id");
   driver.findElement(By.id("ctl00_cph1_gvAvailableSystems_ctl00_ctl02_ctl00_txtSearch")).sendKeys("30004106");
   driver.findElement(By.id("ctl00_cph1_gvAvailableSystems_ctl00_ctl02_ctl00_btnSearch")).sendKeys(Keys.ENTER);
  // Thread.sleep(5000);
   driver.findElement(By.xpath("//a[.='Claires Test System']")).click();
   Actions act = new Actions(driver);
   act.moveToElement(driver.findElement(By.xpath("//span[text()='Reports']"))).perform();
   act.moveToElement(driver.findElement(By.linkText("Transaction Report"))).click().perform();
   Select dropdown1 = new Select(driver.findElement(By.id("cph1_ReportSource")));
   dropdown1.selectByVisibleText("Live Store");
   JavascriptExecutor j=(JavascriptExecutor)driver;

   WebElement button=driver.findElement(By.xpath("//a[@id='ctl00_cph1_pickDateFrom_popupButton']"));
   j.executeScript("window.scrollTo(0,"+button.getLocation().x+")");
   button.sendKeys(Keys.ENTER);
   

   //driver.findElement(By.id("ctl00_cph1_pickDateFrom_popupButton")).click();
   WebElement date=driver.findElement(By.xpath("(//a[.='1'])[1]"));
   wait.until(ExpectedConditions.visibilityOf(date));
   j.executeScript("window.scrollTo(0,"+date.getLocation().x+")");
   date.sendKeys(Keys.ENTER);
   //driver.findElement(By.id("ctl00_cph1_pickDateFrom_dateInput")).sendKeys("01/10/2017");
   WebElement submit=driver.findElement(By.id("cph1_btnSave"));
   //driver.findElement(By.id("cph1_btnSave")).click();
   j.executeScript("window.scrollTo(0,"+submit.getLocation().x+")");
   submit.sendKeys(Keys.ENTER);
   Thread.sleep(10000);
   Set<String> A = driver.getWindowHandles(); 
for(String s: A){
   //driver.getWindowHandle().
   driver.switchTo().window(s);	
//	  if(driver.getTitle().equals("Reports"));
//	   break;
	 
	   }
   System.out.println(driver.getTitle());
  List<WebElement> lst = driver.findElements(By.xpath("//td[@class='TxnResult'][6]"));
  List<Integer> intarr = new ArrayList<Integer>();
  for(WebElement e : lst){
	  Integer i =Integer.parseInt(e.getText());
	  intarr.add(i);
  }
//for (Integer a:intarr ){
	//System.out.println(a);
//}
  driver.findElement(By.xpath("//a[.='Capture Method']")).click();
  Thread.sleep(10000);
  List<WebElement> firstClick = driver.findElements(By.xpath("//td[@class='TxnResult'][6]"));
  List<Integer> assending = new ArrayList<Integer>();
  for(WebElement e : firstClick){
	  Integer i =Integer.parseInt(e.getText());
	  assending.add(i);
  }
//for (Integer a:assending ){
//	System.out.println(a);
//}
  List<Integer> clone = new ArrayList<Integer>(assending);
  Collections.sort(clone);
  if(assending.equals(clone)){
	  System.out.println("Numbers are in assending order");
	  Reporter.log("PASS : Numbers are in assending order", true);
  }else{
	  System.out.println("Numbers are not in assending order");
  }
}
}
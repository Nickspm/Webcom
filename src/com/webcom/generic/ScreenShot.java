package com.webcom.generic;

import java.io.File;
import java.io.IOException;






import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.*;

import com.webcom.interfaces.Itest;

public class ScreenShot {

	public static void takeScreenShot(WebDriver driver) throws IOException
	{
	 	TakesScreenshot ts = ((TakesScreenshot)driver);
	 	File src =ts.getScreenshotAs(OutputType.FILE);
	     File des = new File(Itest.FilePath+timestamp()+".png");
	 	FileUtils.copyFile(src, des);
	 	
	}

	private static String timestamp() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}

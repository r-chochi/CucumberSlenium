package com.util;

import java.io.IOException;
import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;


import com.util.TestBase;


public class Testutil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
//	public static String TESTDATA_SHEET_PATH = "/Users/naveenkhunteta/Documents/workspace"
//			+ "/FreeCRMTest/src/main/java/com/crm/qa/testdata/FreeCrmTestData.xlsx";
	
	//Switching frame method
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	
	//To Take screenshot of errors
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

	
}

package com.testautomation.Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtility {

	private static String directoryPath = null;

	public static void initializeDirectory() {
		if (directoryPath == null) {
			String dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
			directoryPath = "screenshots/" + dateFormat;
			File directory = new File(directoryPath);
			if (!directory.exists()) {
				directory.mkdirs();
			}
		}
	}

	public static void takeScreenshot(WebDriver driver, String sname) throws IOException {

		initializeDirectory();

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

		String destinationPath = directoryPath + "/" + sname + ".png";
		File destFile = new File(destinationPath);

		FileUtils.copyFile(srcFile, destFile);
	}
}

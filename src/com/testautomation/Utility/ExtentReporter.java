package com.testautomation.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporter {

    private static ExtentReports extent;
    private static ExtentTest test;

    public static void initialize() {
        String reportPath = "Reports/ExtentReport.html";

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportPath);
        htmlReporter.config().setDocumentTitle("Selenium Test Automation");
        htmlReporter.config().setReportName("Test Automation Report");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    public static void startTest(String testName, String testDescription) {
        test = extent.createTest(testName, testDescription);
    }

    public static void logPass(String message) {
        test.pass(message);
    }

    public static void logFail(String message) {
        test.fail(message);
    }

    public static void logInfo(String message) {
        test.info(message);
    }

    public static void endTest() {
        extent.flush();
    }
}

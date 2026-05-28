package com.testautomation.PageAction;

import java.io.IOException;
import java.nio.file.Paths;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.testautomation.PageLocators.AbmTest_PageLocators;
import com.testautomation.Utility.DriverManager;
import com.testautomation.Utility.ExcelUtils;
import com.testautomation.Utility.ExtentReporter;
import com.testautomation.Utility.ScreenshotUtility;

public class AbmTest_PageAction {

	private WebDriver driver;
	AbmTest_PageLocators loc;
	private CharSequence searchButton;

	public void openUrl(String url) throws IOException {
		ExtentReporter.initialize();
		ExtentReporter.startTest("Open URL Test", "Test to launch browser and open URL");

		System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\Aditya Mandal\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		          "C:\\Users\\Aditya Mandal\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		DriverManager.setDriver(driver);
		loc = new AbmTest_PageLocators(driver);

		driver.get(url);
		driver.manage().window().maximize();

		ScreenshotUtility.takeScreenshot(driver, "Site launched");

		ExtentReporter.logPass("Successfully launched the browser and navigated to the URL.");
		ExtentReporter.endTest();
	}

	public void enterCredentials() throws InterruptedException, IOException {
		ExtentReporter.startTest("Login Test", "Test to enter login credentials");

		ExcelUtils eu = new ExcelUtils();
		String filePath = Paths.get("src", "TestData", "TestData.xlsx").toString();
		String username = eu.readExcel(filePath, 1, 0);
		String password = eu.readExcel(filePath, 1, 1);

		driver.findElement(loc.usernameField).sendKeys(username);
		driver.findElement(loc.passwordField).sendKeys(password);

		ScreenshotUtility.takeScreenshot(driver, "Credentials entered");

		driver.findElement(loc.loginBtn).click();
		Thread.sleep(3000);
		ExtentReporter.endTest();
	}

	public void enterSaucedemoCredentials() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ExtentReporter.startTest("Login Test", "Test to enter Saucedemo login credentials");

		ExcelUtils eu = new ExcelUtils();
		String filePath = Paths.get("src", "TestData", "TestData.xlsx").toString();
		String username = eu.readExcel(filePath, 2, 0);
		String password = eu.readExcel(filePath, 2, 1);

		driver.findElement(loc.saucedemoUsername).sendKeys(username);
		driver.findElement(loc.saucedemoPassword).sendKeys(password);

		ScreenshotUtility.takeScreenshot(driver, "Credentials entered");

		driver.findElement(loc.saucedemoLoginbtn).click();
		Thread.sleep(3000);
	}

	public void validateSaucedemoLogin() throws IOException {
		// TODO Auto-generated method stub
		if (!driver.findElement(loc.products).isDisplayed()) {
			ScreenshotUtility.takeScreenshot(driver, "Login was unsuccessful");
			Assert.fail("Login was unsuccessful");
		}

		ScreenshotUtility.takeScreenshot(driver, "Login was successful");
		ExtentReporter.endTest();
	}

	public void enterasucedemoCredentials() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ExtentReporter.startTest("Login Test", "Test to enter Saucedemo login credentials");

		ExcelUtils eu = new ExcelUtils();
		String filePath = Paths.get("src", "TestData", "TestData.xlsx").toString();
		String username = eu.readExcel(filePath, 3, 0);
		String password = eu.readExcel(filePath, 3, 1);

		driver.findElement(loc.saucedemoUsername).sendKeys(username);
		driver.findElement(loc.saucedemoPassword).sendKeys(password);

		ScreenshotUtility.takeScreenshot(driver, "Credentials entered");

		driver.findElement(loc.saucedemoLoginbtn).click();
		Thread.sleep(3000);
	}

	/*
	 * public void validateunSaucedemoLogin() throws IOException,
	 * InterruptedException { // TODO Auto-generated method stub Thread.sleep(3000);
	 * if (!driver.findElement(loc.errorMessage).isDisplayed()) {
	 * ScreenshotUtility.takeScreenshot(driver, "Locked out message not showing");
	 * Assert.fail("Locked out message not showing"); }
	 * 
	 * ScreenshotUtility.takeScreenshot(driver, "Login was unsuccessful");
	 * ExtentReporter.endTest();
	 * 
	 * }
	 */

	public void selectSortoption() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(loc.sortDropdown));
		select.selectByValue("lohi");
		driver.findElement(loc.addTocart).click();
		Thread.sleep(3000);
		if (!driver.findElement(loc.Removebutton).isDisplayed()) {
			ScreenshotUtility.takeScreenshot(driver, "Remove Button is not displaying");
			Assert.fail("Remove Button is not displaying");
		}
		ScreenshotUtility.takeScreenshot(driver, "Remove button is displaying");
		ExtentReporter.endTest();
	}

	public void enterSmartphoneinSearchbar() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// ExtentReporter.startTest("Login Test", "To enter phone in search bar");

		try {
			WebElement continueShopping = driver.findElement(By.xpath("//*[contains(text(), 'Continue Shopping')]"));
			continueShopping.click();
		} catch (Exception e) {
		}

		ExcelUtils eu = new ExcelUtils();
		String filePath = Paths.get("src", "TestData", "TestData.xlsx").toString();
		String phone = eu.readExcel(filePath, 4, 0);

		driver.findElement(loc.searchBar).sendKeys(phone);
		Thread.sleep(300);
		// driver.findElement(loc.random1).click();
		driver.findElement(loc.searchButton).click();
		// driver.findElement(loc.searchButton).sendKeys(searchButton);
		Thread.sleep(300);
		ScreenshotUtility.takeScreenshot(driver, "results are showing according to search");

	}

	public void selectfirstoneTovlidate() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		driver.findElement(loc.addtoCart).click();
		Thread.sleep(900);
		ScreenshotUtility.takeScreenshot(driver, "click add to cart for first product");

		driver.findElement(loc.GotoCart).click();
		Thread.sleep(800);
		ScreenshotUtility.takeScreenshot(driver, "click go to cart to check");

		if (!driver.findElement(loc.ProceedtoPay).isDisplayed()) {
			ScreenshotUtility.takeScreenshot(driver, "product validation is not successfull");
			Assert.fail("product validation is not successfull");
		}
		ScreenshotUtility.takeScreenshot(driver, "product validation is successfull");
		ExtentReporter.endTest();

	}

	public void enterasucedemoCredentials1() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ExtentReporter.startTest("Login Test", "Test to enter Saucedemo login credentials");

		ExcelUtils eu = new ExcelUtils();
		String filePath = Paths.get("src", "TestData", "TestData.xlsx").toString();
		String username = eu.readExcel(filePath, 3, 0);
		String password = eu.readExcel(filePath, 3, 1);

		driver.findElement(loc.saucedemoUsername).sendKeys(username);
		driver.findElement(loc.saucedemoPassword).sendKeys(password);

		ScreenshotUtility.takeScreenshot(driver, "Credentials entered");

		driver.findElement(loc.saucedemoLoginbtn).click();
		Thread.sleep(3000);

	}

	public void validateunSaucedemoLogin1() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);

		ScreenshotUtility.takeScreenshot(driver, "Login was unsuccessful");
		ExtentReporter.endTest();
	}

	public void sortingTheproduct() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(loc.sortDropdown));
		select.selectByValue("lohi");
		driver.findElement(loc.addTocart).click();
		Thread.sleep(3000);
		if (!driver.findElement(loc.Removebutton).isDisplayed()) {
			ScreenshotUtility.takeScreenshot(driver, "Remove Button is not displaying");
			Assert.fail("Remove Button is not displaying");
		}

		ScreenshotUtility.takeScreenshot(driver, "Remove button is displaying");
		ExtentReporter.endTest();

	}

	public void addingTocart() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		driver.findElement(loc.addTocart1).click();
		Thread.sleep(3000);
		driver.findElement(loc.addTocartButton).click();
		Thread.sleep(3000);
		if (!driver.findElement(loc.Removebutton).isDisplayed()) {
			;
			ScreenshotUtility.takeScreenshot(driver, "Remove Button is not displaying");
			Assert.fail("Remove Button is not displaying");
		}

		ScreenshotUtility.takeScreenshot(driver, "Remove button is displaying");
		driver.findElement(loc.CheckoutButton).click();
		Thread.sleep(3000);
	}

	public void Completepayementprocess() throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ExcelUtils eu = new ExcelUtils();
		String filePath = Paths.get("src", "TestData", "TestData.xlsx").toString();
		String Fname = eu.readExcel(filePath, 1, 2);
		String Lname = eu.readExcel(filePath, 1, 3);
		String ZipPostalcode = eu.readExcel(filePath, 1, 4);

		driver.findElement(loc.Firstname).sendKeys(Fname);
		Thread.sleep(300);
		driver.findElement(loc.Lastname).sendKeys(Lname);
		Thread.sleep(300);
		driver.findElement(loc.ZipPostal).sendKeys(ZipPostalcode);
		Thread.sleep(300);
		driver.findElement(loc.Continuebutton).click();
		Thread.sleep(3000);

		if (!driver.findElement(loc.Totalprice).isDisplayed()) {
			;
			ScreenshotUtility.takeScreenshot(driver, "Totalprice text is not displaying");
			Assert.fail("Remove Button is not displaying");
		}

		ScreenshotUtility.takeScreenshot(driver, "Totalprice text is displaying");
		driver.findElement(loc.Finishbutton).click();
		Thread.sleep(300);

		if (!driver.findElement(loc.orderconfirmation1).isDisplayed()) {
			ScreenshotUtility.takeScreenshot(driver, "Your order is not placed");
			Assert.fail("Remove Button is not displaying");
		}

		if (!driver.findElement(loc.orderconfirmation2).isDisplayed()) {
			ScreenshotUtility.takeScreenshot(driver, "Your order is not placed");
			Assert.fail("Remove Button is not displaying");
		}

		ScreenshotUtility.takeScreenshot(driver, "Your order is placed");
		driver.findElement(loc.BacktoHome).click();
		Thread.sleep(3000);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	/*
	 * public void EnterAmazonSite() throws IOException, InterruptedException { //
	 * TODO Auto-generated method stub ExtentReporter.startTest("Login Test",
	 * "Test to enter Saucedemo login credentials");
	 * 
	 * ExcelUtils eu = new ExcelUtils(); String filePath = Paths.get("src",
	 * "TestData", "TestData.xlsx").toString(); String username =
	 * eu.readExcel(filePath, 2, 0); String password = eu.readExcel(filePath, 2, 1);
	 * 
	 * driver.findElement(loc.saucedemoUsername).sendKeys(username);
	 * driver.findElement(loc.saucedemoPassword).sendKeys(password);
	 * 
	 * ScreenshotUtility.takeScreenshot(driver, "Credentials entered");
	 * 
	 * driver.findElement(loc.saucedemoLoginbtn).click(); Thread.sleep(3000);}
	 */
	 

	
	public void SearchingtheProduct() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		try {
			WebElement amznsearchbar = driver.findElement(By.id("twotabsearchtextbox"));
			amznsearchbar.click();
		} catch (Exception e) {
		}

		ExcelUtils eu = new ExcelUtils();
		String filePath = Paths.get("src", "TestData", "TestData.xlsx").toString();
		String IPhone = eu.readExcel(filePath, 4, 0);

		driver.findElement(loc.amznsearchbar).sendKeys(IPhone);
		Thread.sleep(300);
		// driver.findElement(loc.random1).click();
		driver.findElement(loc.amznsearchbutn).click();
		// driver.findElement(loc.searchButton).sendKeys(searchButton);
		Thread.sleep(300);
		ScreenshotUtility.takeScreenshot(driver, "results are showing according to search");

	}
	
	public void addingQuantitytoProduct() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		driver.findElement(loc.amzn1stoption).click();
		Thread.sleep(3000);
		driver.findElement(loc.amzncartbtn).click();
		Thread.sleep(3000);
		driver.findElement(loc.amzncartbtn2).click();
		Thread.sleep(3000);
		driver.findElement(loc.amznmaincartbtn).click();
		Thread.sleep(3000);
		if (!driver.findElement(loc.cartvalidationpage).isDisplayed()) {
			;
			ScreenshotUtility.takeScreenshot(driver, "Cart Page is not displaying");
			Assert.fail("Cart Page is not displaying");
		}

		ScreenshotUtility.takeScreenshot(driver, "Cart Page is displaying");
		driver.findElement(loc.amznprcdtopay).click();
		Thread.sleep(3000);
	
	}

	public void UsercheckoutProceed() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		if (!driver.findElement(loc.addaddressvalidate).isDisplayed()) {
			;
			ScreenshotUtility.takeScreenshot(driver, " Address is not displaying");
			Assert.fail(" Address is not displaying");
		}
		Thread.sleep(3000);
		driver.findElement(loc.addnewadress).click();
		Thread.sleep(3000);
		driver.findElement(loc.amznFullname).click();
		Thread.sleep(3000);
		driver.findElement(loc.amznmblenmbr).click();
		Thread.sleep(3000);
		driver.findElement(loc.amznzipcode).click();
		Thread.sleep(3000);
		driver.findElement(loc.amznflthse).click();
		Thread.sleep(3000);
		driver.findElement(loc.amznareastreet).click();
		Thread.sleep(3000);
		driver.findElement(loc.amznlandmark).click();
		Thread.sleep(3000);
		driver.findElement(loc.amzncity).click();
		Thread.sleep(3000);
		
		
		ScreenshotUtility.takeScreenshot(driver, "Cart Page is displaying");
		driver.findElement(loc.amznprcdtopay).click();
		Thread.sleep(3000);
	}

	public void successfulllogin() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		ExtentReporter.startTest("Login Test", "Test to enter Amazon login credentials");

		ExcelUtils eu = new ExcelUtils();
		String filePath = Paths.get("src", "TestData", "TestData.xlsx").toString();
		String username = eu.readExcel(filePath, 3, 0);
		String password = eu.readExcel(filePath, 3, 1);

		driver.findElement(loc.amznEmaillgn).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(loc.amzncontinuebtn).click();
		Thread.sleep(3000);
		driver.findElement(loc.amznPaswrdlgn).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(loc.amznsigninbtn).click();
		Thread.sleep(3000);

		if (!driver.findElement(loc.amznacountlginvalidation).isDisplayed()) {
			;
			ScreenshotUtility.takeScreenshot(driver, "Amazon Account login is successfull");
			Assert.fail("Amazon Account login is failed");
		}
	}

	public void CartCountshow() {
		// TODO Auto-generated method stub
		
		
		
		
	}

	public void Ordersuccessfull() {
		// TODO Auto-generated method stub
		
		
	}
}










































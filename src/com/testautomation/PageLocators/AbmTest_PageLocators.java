package com.testautomation.PageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbmTest_PageLocators {

	WebDriver driver = null;

	public AbmTest_PageLocators(WebDriver driver) { 

		this.driver = driver; 
	}

	public By usernameField = By.id("email");
	public By passwordField = By.id("pass");
	public By loginBtn = By.name("login");
	public By saucedemoUsername = By.id("user-name");
	public By saucedemoPassword = By.id("password");
	public By saucedemoLoginbtn = By.id("login-button");
	public By products = By.xpath("//span[text()='Products']");
	public By errorMessage = By.xpath("//input[@id='login-button']/../h3[text()='Epic sadface: ']");
	public By sortDropdown = By.xpath("//select[@class='product_sort_container']");
	public By addTocart = By.xpath("(//button[text()='Add to cart'])[1]");
	public By removeButton = By.xpath("//button[text()='REMOVE']");
	
	
	
	
	
	public By searchBar = By.id("twotabsearchtextbox");
	//public By random1 = By.xpath("(//div/h2[contains(text(),'Appliances')])[1]");
	public By searchButton = By.id("nav-search-submit-button");
	//public By firstProduct = By.xpath("(//h2/span[contains(text(),'iPhone 16 ')])[1]");
	public By addtoCart = By.xpath("(//button[text()='Add to cart'])[1]");
	public By GotoCart = By.xpath("(//span[@class='a-button-inner'])[1]");
	//public By verifyproduct = By.xpath("//span[contains(text(),'iPhone')][1]");
	public By ProceedtoPay = By.xpath("(//input[@class='a-button-input'])[1]");
	
	public By saucedemoUsername1 = By.id("user-name");
	public By saucedemoPassword1 = By.id("password");
	public By saucedemoLoginbtn1 = By.id("login-button");
	public By selectDropdownoption = By.xpath("//select/option[text()='Price (high to low)']");
	public By addTocart1 = By.xpath("(//button[text()='Add to cart'])[1]");
	public By addTocartButton = By.id("shopping_cart_container");
	public By Removebutton = By.xpath("//div/button[text()='Remove']");
	public By CheckoutButton = By.xpath("(//div/button[text()='Checkout'])");
	public By Firstname = By.id("first-name");
	public By Lastname = By.id("last-name");
	public By ZipPostal = By.id("postal-code");
	public By Totalprice = By.xpath ("//div[contains(text(),'Total: $')]");
	public By Continuebutton = By.id("continue");
	public By Finishbutton = By.id("finish");
	public By BacktoHome = By.id("back-to-products");
	public By orderconfirmation1 = By.xpath("//h2[contains(text(),'Thank you')]");
	public By orderconfirmation2 = By.xpath("//div[contains(text(),'Your order')]");
	
			
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public By amznsearchbar = By.id("twotabsearchtextbox");
	public By amznsearchbutn = By.id("nav-search-submit-button");
	
	public By signinbutn = By.xpath("//span[text()='Hello, sign in']");
	public By amznEmaillgn = By.id("ap_email_login");
	public By amzncontinuebtn = By.id("continue-announce");
	public By amznPaswrdlgn = By.id("ap_password");
	public By amznsigninbtn = By.id("signInSubmit");
	public By amznotpsbmt = By.xpath("//span[text()='Submit code']");
	
	public By amzn1stoption = By.xpath("(//a/h2)[1]");
	public By amzncartbtn = By.xpath("(//span[text()='Add to cart'])[2]");
	public By amzncartbtn2 = By.xpath("//span[text()=' Cart ']");
	public By amznmaincartbtn = By.id("nav-cart");
	public By amznprcdtopay = By.id("sc-buy-box-ptc-button");
	public By addnewadress = By.id("add-new-address-desktop-sasp-tango-link");
	public By amznFullname = By.id("address-ui-widgets-enterAddressFullName");
	public By amznmblenmbr = By.id("address-ui-widgets-enterAddressPhoneNumber");
	public By amznzipcode = By.id("address-ui-widgets-enterAddressPostalCode");
	public By amznflthse = By.id("address-ui-widgets-enterAddressLine1");
	public By amznareastreet = By.id("address-ui-widgets-enterAddressLine2");
	public By amznlandmark = By.id("address-ui-widgets-landmark");
	public By amzncity = By.id("address-ui-widgets-enterAddressCity");
	public By amzndropdown = By.xpath("//span[text()='Choose a state']"); //----------------------
	public By amznwbselect = By.xpath("(//a[text()='WEST BENGAL'])[3]");   //------------------------
	public By amzncheckbox = By.id("address-ui-widgets-use-as-my-default");
	public By amznusethisaddrs = By.id("address-ui-widgets-use-as-my-default");
	
	
	public By validateproceedtopay = By.id("nav-checkout-title-header-text");
	public By totalamntvalidate = By.xpath("(//span[@data-shimmer-target=\"ordertotals-amount\"])[3]");
	public By addaddressvalidate = By.xpath("//h4[text()='Add an address']");
	public By cartvalidationpage = By.id("sc-active-items-header");
	public By amznacountlginvalidation = By.xpath("//span[text()='Hello, Adi']");
	
	public By amznquantityblgn = By.xpath("//a/div/span[text()=1]");
	public By amznquantityalgn = By.xpath("//a/div/span[text()=1]");
	
	
	
	}
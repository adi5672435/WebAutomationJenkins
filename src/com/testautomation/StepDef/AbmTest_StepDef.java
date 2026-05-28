package com.testautomation.StepDef;

import java.io.IOException;

import com.testautomation.PageAction.AbmTest_PageAction;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AbmTest_StepDef {

	AbmTest_PageAction appAction = new AbmTest_PageAction();

	/*
	 * @Given("^Open Chrome browser with \"([^\"]*)\"$") public void
	 * Open_Chrome_browser_with(String url) throws IOException {
	 * 
	 * appAction.openUrl(url); }
	 */

	/*
	 * @When("^I enter credentials and login$") public void
	 * I_enter_credentials_and_login() throws InterruptedException, IOException {
	 * 
	 * appAction.enterCredentials(); }
	 */

	/*
	 * @When("^I enter Saucedemo credentials and login$") public void
	 * I_enter_Saucedemo_credentials_and_login1() throws IOException,
	 * InterruptedException {
	 * 
	 * appAction.entersaucedemoCredentials1(); }
	 */
	
	/*
	 * @Then("^I validated login is successful$") public void
	 * I_validate_login_is_successful() throws IOException {
	 * 
	 * appAction.validateSaucedemoLogin1(); }
	 */

	/*
	 * @Then("I select sort option") public void i_select_sort_option() throws
	 * IOException, InterruptedException { // Write code here that turns the phrase
	 * above into concrete actions appAction.selectSortoption(); }
	 */

	/*
	 * @Given("^Open Chrome browser\"([^\"]*)\"$") public void
	 * Open_Chrome_browser(String url) throws IOException {
	 * 
	 * appAction.openUrl(url); }
	 * 
	 * @When("^I enter Smartphones in searchbar$") public void
	 * I_enter_Smartphones_in_searchbar() throws InterruptedException, IOException {
	 * 
	 * appAction.enterSmartphoneinSearchbar();
	 * 
	 * }
	 */

	/*
	 * @Then("I select First one For add to Cart for Validation") public void
	 * i_select_First_one_For_add_to_Cart_for_Validation() throws
	 * InterruptedException, IOException { // Write code here that turns the phrase
	 * above into concrete actions appAction.selectfirstoneTovlidate(); }
	 */
	
//	@Given("^Open Chrome browser\"([^\"]*)\"$")
//	public void Open_Chrome_browser1(String url) throws IOException {
//
//		appAction.openUrl(url);	
//	}


	


	@Given("^Open Chrome browser with \"([^\"]*)\"$")
	public void Open_Chrome_browser_with(String url) throws IOException {

	appAction.openUrl(url);
}

	@When("^I enter Saucedemo credentials and login$")
	public void I_enter_Saucedemo_credentials_and_login1() throws IOException, InterruptedException {

	appAction.enterasucedemoCredentials1();
}

	@And("^I validated login is successful$")
	public void I_validate_login_is_successful() throws IOException, InterruptedException {

	appAction.validateunSaucedemoLogin1();
}

	@And("^select sort option")
	public void select_sort_option() throws InterruptedException, IOException {
		appAction.sortingTheproduct();
	}

	@And("^Add product to cart")
	public void Add_product_to_cart() throws InterruptedException, IOException {
		appAction.addingTocart();
	}

	@Then("Complete the payement process till payement tab")
	public void Complete_the_payement_process_till_payement_tab() throws InterruptedException, IOException {
		appAction.Completepayementprocess();

	}


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@When("^I enter amazon Userpassword and login$")
	public void I_enter_amazon_Userpassword_and_login() throws IOException, InterruptedException {
		
		//appAction.EnterAmazonSite();
		
	}
	
	@And("user searches for product")
	public void user_searches_for_product() throws IOException, InterruptedException {

	appAction.SearchingtheProduct();
	
	}
	
	@And("And adds quantity product to the cart")
	public void And_adds_quantity_product_to_the_cart() throws IOException, InterruptedException {
	
	appAction.addingQuantitytoProduct();
	
	}

	@And("And user proceeds to checkout")
	public void And_user_proceeds_to_checkout() throws IOException, InterruptedException {
	
	appAction.UsercheckoutProceed();
	
	}
	
	@Then ("Then login should be successfull")
	public void Then_login_should_be_successfull() throws IOException, InterruptedException {
		
	appAction.successfulllogin();
	}

	@And ("And cart should have cartcount")
	public void And_cart_should_have_cartcount() throws IOException, InterruptedException {
		
	appAction.CartCountshow();
	}
	
	@And("And order should be successfull")
	public void And_order_should_be_successfull() throws IOException, InterruptedException {
	
	appAction.Ordersuccessfull();
	}
}




















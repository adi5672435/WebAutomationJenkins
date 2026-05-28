@Test
Feature: Validate AbmTest Web Site

@Z_Automation @jan23
Scenario Outline: Login and validate AbmTest
Given Open Chrome browser with "<URL>"
When I enter credentials and login

Examples:
  |URL|
  |https://www.facebook.com/|
  
@Z_Automation @Aug27
Scenario Outline: Login and validate Saucedemo website
Given Open Chrome browser with "<URL>"
When I enter Saucedemo credentials and login
Then I validate login is successful

Examples:
  |URL|
  |https://www.saucedemo.com/v1/|
  
@Z_Automation @Aug30
Scenario Outline: Login with invalidate credentials and validate in Saucedemo website
Given Open Chrome browser with "<URL>"
When I enter Saucedemo credentials with invaild credentials

Then I validate locked out message

Examples:
  |URL|
  |https://www.saucedemo.com/v1/|

@Z_Automation @Aug301
Scenario Outline: verify add to cart
Given Open Chrome browser with "<URL>"
When I enter Saucedemo credentials with login
Then I select sort option

Examples:
  |URL|
  |https://www.saucedemo.com/v1/|
  
@Z_Automation @Oct25
Scenario Outline: verify add to cart
Given Open Chrome browser with "<URL>"
When I enter Smartphones in searchbar
Then I select First one For add to Cart for Validation

Examples:
  |URL|
  |https://www.amazon.in|
  
  
  
  
 
@Z_Automation @Dec29
Scenario Outline: Login, validate Saucedemo website & add a product till Payement tab
Given Open Chrome browser with "<URL>"
When I enter Saucedemo credentials and login
And I validated login is successful
And select sort option
And Add product to cart
Then Complete the payement process till payement tab

Examples:
  |URL|
  |https://www.saucedemo.com/v1/|
  
  
  
@Z_Automation @Mar25
Scenario Outline: Validate end-to-end user flow
Given user launches the application with "<URL>"
When user logs in with "<username>" and "<password>"
And user searches for product "<product>"
And adds "<quantity>" product(s) to the cart
And user proceeds to checkout with "<firstname>", "<lastname>", and "<zipcode>"
Then login should be successfull
And cart should have "<cart_count>" item(s)
And order should be "<order_status>"
  
Examples:
  |URL|
  |https:https://www.amazon.in/|

  
  

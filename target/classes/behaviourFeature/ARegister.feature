Feature: Register Page Functionality
Scenario: Fill Registration Form
Given User is at home page
When User click on the register button on home page
Then User navigate to the register page
When User enter the first name as <"test1">
And User enter the last name as <"last1">
And User enter the email as <"test@gmail.com">
And User enter the phone number as <"1234567890">
And User select the engineer from occupation dropdown
And User select the gender radio button 
And User enter the password as <"Test@123">
And User enter the confirm password as <"Test@123">
And User click on the check box 
And User click on the register button 
Then User navigate to the account successful page
When User click on the login.




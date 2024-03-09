Feature: login funcitionality
Scenario: Login with username and password
Given User is at login page
When User enter the email as <"test@gmail.com">
And User enter the password as <"Test@123">
And User click on the login button 
Then User enters to the application 
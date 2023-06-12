Feature: Login functionality


Scenario: Verify successful login when username and password is correct 
Given User launch site URL
When User enter correct username and password
And User click on login button
Then Vlidate user navigate to home page
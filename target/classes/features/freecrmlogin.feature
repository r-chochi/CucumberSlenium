Feature: Free CRM Application Login Feature


//Scenario: Free CRM Login Test Scenario

#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "rashmi ag" and "test@123"
#Then user clicks on login button
#Then user is on home page

@SmokeTest
Scenario: Free CRM Login Test Scenario

Given user launch the browser
Then User is on the login page
Then user enters username and password
Then validate home page tittle
Then validate logged in username 


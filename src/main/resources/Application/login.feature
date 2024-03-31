Feature: login functionality
Scenario: verify login functionality
Given user should be at login page
When user need to enter the username
And user need to enter the password
And user need to click on login button
Then user should be logged into application

Scenario: Verify the car insurance page
Given user is at insurance portal
And user logged into application
When user clicked on insurance button
And user clicked on the Car insurance button
Then user is at Car insurance page

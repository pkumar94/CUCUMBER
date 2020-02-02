@First
Feature: My account login feature
Description:  log-in to application

#Simple login Without parameters
Scenario: log-in wtih valid username and Password
Given open browser
When Enter url "http://practice.automationtesting.in/"
And click on My Account menu
And Registered username and password
And Click on login button
Then user must sucessfully login to application

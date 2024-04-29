#Author: Sukanya
#Keywords Summary :
#Feature: List of scenarios.
#Given: Some precondition step
#When: Some key actions
#And,But: To enumerate more Given,When,Then steps
#Then: To observe outcomes or validation
#Scenario: Business rule through list of steps with arguments.
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
Feature: Feature to test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given user opens browser
    And Navigates to <total_av_url> and click on login button
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to dashboard
    And close browser
    
  Examples:
   |username|password|total_av_url|
   |koppulasukanya2024@gmail.com|Sukanya2020#|https://www.TotalAV.com/|

  Scenario Outline: Check login with invalid credentials and login fails
    Given user opens browser
    And Navigates to <total_av_url> and click on login button
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to dashboard
    And close browser
   
  Examples:
   |username|password|total_av_url|
   |koppulasukanya2024@gmail.com|testuser123|https://www.TotalAV.com/|

 

 
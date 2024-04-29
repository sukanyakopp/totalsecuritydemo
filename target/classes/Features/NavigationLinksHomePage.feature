#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
Feature: To verify all navigation links on homepage

  Scenario: Verify "Home Page Links"
    Given user open browser
    And navigates to totalAV homepage
    When user selects antiviruspro sublink from product main menu
    Then user navigates to antivirus pro page
    When user selects internetsecurity sublink
    Then user navigates to internetsecurity page
    When user selects antivirus sublink from security main menu
    Then user navigates to antivirus page
    When user selects vpn sublink from security main menu
    Then user navigates to vpn page
    When user selects webshield sublink from security main menu
    Then user navigates to webshield page
    When user selects data breach sublink from security main menu
    Then user navigates to data breach page
    When user selects total password sublink from privacy main menu
    Then user navigates to total password page
    When user selects identity protection sublink from privacy main menu
    Then user navigates to identity protection page
    When user clicks on support link
    Then user navigates to support page
    

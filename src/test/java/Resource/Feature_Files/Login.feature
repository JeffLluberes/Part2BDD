@@TutorialsNinjaLogin
Feature: Login Functionality of TutorialsNinja

  @ValidCredentials
  Scenario: Successful Login with Valid Credentials
    Given User is navigating to login page
    When User enters valid email  "seleniumlluberes@gmail.com"
    And User enters valid password "LLUBERES123"
    And User clicks on Login button
    Then User is directed to Account page

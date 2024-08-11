@TutorialsNinjaLogin
Feature: Login Functionality of TutorialsNinja

  @ValidCredentials
  Scenario: Successful Login with Valid Credentials
    Given User is navigating to login page
    When User enters valid email seleniumlluberes@gmail.com
    And User enters valid password LLUBERES123
    And User clicks on Login button
    Then User is directed to Account page

    @InvalidEmailValidPassword
    Scenario: Unsuccessful login with invalid Email
      Given User is navigating to login page
      When User enters invalid email
      And User enters valid password LLUBERES123
      And User clicks on Login button
      Then User is given an incorrect email password mismatch message

      @ValidEmailInvalidPassword
      Scenario: Unsuccessful login with invalid password
      Given User is navigating to login page
      When User enters valid email seleniumlluberes@gmail.com
      And User enter invalid password lluberes12
      And User clicks on Login button
      Then User is given an incorrect email password mismatch message

        @NoCredentialsInEmailAndPassword
        Scenario: Unsuccessful login with both email and password empty
          Given User is navigating to login page
          When User enters invalid email
          When User enter invalid password '
          And User clicks on Login button
          Then User is given an incorrect email password mismatch message
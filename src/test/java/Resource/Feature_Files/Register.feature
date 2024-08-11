@TutorialNinjaRegistration

  Feature: Registration Functionality of TutorialsNinja

    @AllMandatoryFieldsFilledIn
    Scenario: Register to TutorialsNinja with all fields filled in
      Given User navigating to Registration page
      When User fills in all fields
      |firstname      | Jeff     |
      |lastname       | doe      |
      |telephone      |9087654321|
      |password       |abcd1234  |
      |confirmpassword|abcd1234  |
      And User selects yes to newsletter subscription
      And User clicks on privacy policy check box
      And User clicks on continue button
      Then User gets an account created successfully

      @MissingFirstName
      Scenario: Register to TutorialsNinja with missing first name field
        Given User navigating to Registration page
        When User fills in all fields except for first name
          |lastname       | doe      |
          |telephone      |9087654321|
          |password       |abcd1234  |
          |confirmpassword|abcd1234  |
        And User selects yes to newsletter subscription
        And User clicks on privacy policy check box
        And User clicks on continue button
        Then User gets error message for empty first name field

        @MissingLastName
        Scenario: Register to TutorialsNinja with missing last name field
          Given User navigating to Registration page
          When User fills in all fields except for last name
            |firstname      | Jeff     |
            |telephone      |9087654321|
            |password       |abcd1234  |
            |confirmpassword|abcd1234  |
          And User selects yes to newsletter subscription
          And User clicks on privacy policy check box
          And User clicks on continue button
          Then User gets an error message for empty last name field

          @NavigateToLoginPage
          Scenario: Navigate to login page from register account page
            Given User navigating to Registration page
            And User click on login page link on registration page
            Then User is directed to login page

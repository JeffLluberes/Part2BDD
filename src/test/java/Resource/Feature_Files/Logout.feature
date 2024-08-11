@TutorialsNinjaLogout

  Feature: Logout functionality of TutorialsNinja

    @clickOnLogout
    Scenario: Click on logout button after being successfully logged in
     Given User navigate to the login page
      When User enters correct username emailseleniumlluberes@gmail.com
      And User enters correct passwordLLUBERES123
      And User clicks on Login
      And User clicks on logout link
      Then User is directed to logout page
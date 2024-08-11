@TutorialsNinjaSearchProduct

Feature: Search product funtionality

  @SearchProduct
  Scenario: Search for a valid product
    Given User navigates to homepage to search Product
    When User enters Product name into search box field on Homepage HP LP3065
    And User clicks on search button
    Then User confirms item search is displayed
@TutorialsNinjaAddToCart

  Feature: Add to Cart Functionality of TutorialsNinja

    @AddProductToCart
    Scenario: Confirm product added to cart is correct
      Given User navigates to search to search Product
      When User enters product into Search box field HP LP3065
      And User clicks on search button in search box field
      And User adds product to cart
      Then User will navigate to AddToCart page and confirm Product added
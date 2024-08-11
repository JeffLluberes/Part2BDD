package Step_Definitions;

import Pages.CartPage;
import Pages.SearchProductPage;
import driver_Factory.DriverFactoryCode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class addToCart {


    public WebDriver driver;

    @Given("User navigates to search to search Product")
    public void User_navigates_to_homepage_to_search_Product() {
        driver = DriverFactoryCode.getDriver();
    }
    @When("^User enters product into Search box field(.+)$")
    public void User_enters_product_into_Search_box_field_and_clicks_on_search_icon(String productName){
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        searchProductPage.enterToSearchBoxTextField(productName);
    }
    @And("User clicks on search button in search box field")
    public void User_clicks_on_search_button_in_search_box_field(){
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        searchProductPage.clickOnSearchButton();
    }

    @And("User adds product to cart")
    public void user_Adds_Product_To_Cart(){
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        searchProductPage.clickOnAddToCart();
    }
    @And("User will confirm add to cart")
    public void user_Will_Confirm_Add_to_Cart(){
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        searchProductPage.addProductToCart();

    }
    @Then("User will navigate to AddToCart page and confirm Product added")
    public void User_will_navigate_to_AddToCart_page_and_confirm_Product_added(){
        CartPage cartPage = new CartPage(driver);
        cartPage.clickOnViewItemLink();
        cartPage.clickOnViewCartLink();
        cartPage.productInCartDisplayed();

    }
}

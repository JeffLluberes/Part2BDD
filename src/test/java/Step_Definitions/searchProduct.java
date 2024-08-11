package Step_Definitions;

import Pages.SearchProductPage;
import driver_Factory.DriverFactoryCode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;



public class searchProduct {

    public WebDriver driver;


    @Given("User navigates to homepage to search Product")
    public void user_Navigates_To_Homepage_To_Search_Product(){
        driver = DriverFactoryCode.getDriver();
    }

@When("^User enters Product name into search box field on Homepage (.+)$")
    public void User_enters_Product_name_into_search_box_field_on_Homepage(String productName) {
    SearchProductPage searchProductPage = new SearchProductPage(driver);
    searchProductPage.enterToSearchBoxTextField(productName);
}
    @And("User clicks on search button")
    public void user_Clicks_On_Search_Button(){
    SearchProductPage searchProductPage = new SearchProductPage(driver);
    searchProductPage.clickOnSearchButton();

}
@Then("User confirms item search is displayed")
    public void user_Confirms_Product_Searched_Is_Displayed(){
    SearchProductPage searchProductPage = new SearchProductPage(driver);
    searchProductPage.searchResultsForProductIsDisplayed();
}
}

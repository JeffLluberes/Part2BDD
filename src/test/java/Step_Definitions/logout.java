package Step_Definitions;

import Pages.Homepage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.MyAccountPage;
import driver_Factory.DriverFactoryCode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class logout {

    public WebDriver driver;

    @Given("User navigate to the login page")
    public void User_navigates_to_login_page(){
        driver = DriverFactoryCode.getDriver();
        Homepage homepage = new Homepage(driver);
        homepage.clickMyAccountDropDown();
        homepage.clickloginLink();
    }
    @When("^User enters correct username email(.+)$")
    public void user_Enters_Username(String email){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail(email);
    }
    @And("^User enters correct password(.+)$")
    public void user_Enters_password(String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterPassword(password);
    }
    @And("User clicks on Login")
        public void user_Clicks_On_Login_Button(){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.clickOnLoginButton();
    }
   @And("User clicks on logout link")
    public void user_Clicks_On_Logout_Link(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.clickOnLogoutButtonOnMyAccountPage();
    }
    @Then("User is directed to logout page")
    public void user_Is_Directed_To_Logout_Page(){
        LogoutPage logoutPage = new LogoutPage(driver);
        Assert.assertTrue(logoutPage.successfullyLoggedOutIsDisplayed());
    }
}

package Step_Definitions;

import Pages.Homepage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Utilities.Utils;
import driver_Factory.DriverFactoryCode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login {

public WebDriver driver;

    @Given("User is navigating to login page")
    public void user_Navigates_To_Login_Page() {
        driver = DriverFactoryCode.getDriver();
        Homepage homepage = new Homepage(driver);
        homepage.clickMyAccountDropDown();
        homepage.clickloginLink();
    }

    @When("^User enters valid email (.+)$")
    public void user_Enters_ValidEmail(String emailText) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail(emailText);

    }

    @And("^User enters valid password (.+)$")
    public void user_Enters_ValidPassword(String passwordText){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterPassword(passwordText);
    }

    @And("User enters invalid email")
    public void User_Enters_Invalid_Email() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail(Utils.emailWithDateTimeStamp());
    }
    @And("^User enter invalid password(.+)$")
    public void User_Enters_Invalid_Password(String invalidPassword){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterPassword(invalidPassword);
    }
    @And("User clicks on Login button")
    public void user_Clicks_On_Login_Button(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnLoginButton();
    }
    @Then("User is directed to Account page")
    public void user_Is_Directed_To_Accoumt_Page(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        Assert.assertTrue(myAccountPage.editAccountInfoLinkIsDisplayed());
    }
    @Then("User is given an incorrect email password mismatch message")
    public void User_Is_Given_incorrect_email_password_mismatch_message(){
   LoginPage loginPage = new LoginPage(driver);
  Assert.assertTrue(loginPage.retrieveWarningEmailPasswordMismatchText().contains("Warning: No match for E-Mail Address and/or Password."));
    }
}
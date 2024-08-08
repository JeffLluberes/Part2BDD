package Step_Definitions;

import Hooks.MyHooks;
import Pages.Homepage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import driver_Factory.DriverFactoryCode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

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
}
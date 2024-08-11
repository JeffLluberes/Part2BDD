package Step_Definitions;

import Pages.Homepage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import Utilities.Utils;
import driver_Factory.DriverFactoryCode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class Registration {

    public WebDriver driver;

    @Given("User navigating to Registration page")
    public void user_Navigating_to_Registration_Page() {
        driver = DriverFactoryCode.getDriver();
        Homepage homepage = new Homepage(driver);
        homepage.clickMyAccountDropDown();
        homepage.clickOnRegisterLink();
    }

    @When("User fills in all fields")
    public void user_Fills_All_Fields(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.enterFirstNameIntoFieldBox(dataMap.get("firstname"));
        registrationPage.enterLastNameIntoFieldBox(dataMap.get("lastname"));
        registrationPage.enterEmailIntoFieldBox(Utils.emailWithDateTimeStamp());
        registrationPage.enterTelephoneIntoFieldBox(dataMap.get("telephone"));
        registrationPage.enterPasswordIntoFieldBox(dataMap.get("password"));
        registrationPage.enterConfirmPasswordIntoFieldBox(dataMap.get("confirmpassword"));
    }
    @When("User fills in all fields except for first name")
        public void User_fills_in_all_fields_except_for_first_name(io.cucumber.datatable.DataTable dataTable){
        Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.enterLastNameIntoFieldBox(dataMap.get("lastname"));
        registrationPage.enterEmailIntoFieldBox(Utils.emailWithDateTimeStamp());
        registrationPage.enterTelephoneIntoFieldBox(dataMap.get("telephone"));
        registrationPage.enterPasswordIntoFieldBox(dataMap.get("password"));
        registrationPage.enterConfirmPasswordIntoFieldBox(dataMap.get("confirmpassword"));

    }
    @When("User fills in all fields except for last name")
    public void User_fills_in_all_fields_except_for_last_name(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.enterFirstNameIntoFieldBox(dataMap.get("firstname"));
        registrationPage.enterEmailIntoFieldBox(Utils.emailWithDateTimeStamp());
        registrationPage.enterTelephoneIntoFieldBox(dataMap.get("telephone"));
        registrationPage.enterPasswordIntoFieldBox(dataMap.get("password"));
        registrationPage.enterConfirmPasswordIntoFieldBox(dataMap.get("confirmpassword"));
    }
    @And("User clicks on privacy policy check box")
    public void user_Clicks_on_Privacy_Check_Box() {
    RegistrationPage registrationPage = new RegistrationPage(driver);
    registrationPage.clickOnPrivacyPolicyCheckBox();
    }
    @And("User selects yes to newsletter subscription")
    public void user_Selects_Yes_To_Newsletter_Subscription(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.clickYesToNewsLetter();
    }
    @And("User click on login page link on registration page")
    public void user_Clicks_On_Login_Page_Link_On_Registration_Page() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.clickOnLoginPageLinkAtRegistrationPage();
    }

    @And("User clicks on continue button")
    public void user_Clicks_On_Continue_Button(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.clickOnContinueButton();
    }
    @Then("User gets an account created successfully")
    public void user_Gets_An_Account_Created_Successfully(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.accountCreatedIsDisplayed();
    }
    @Then("User gets error message for empty first name field")
    public void user_Gets_Error_Message_for_Empty_First_Name_Field(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.emptyFirstNameFieldBox();
    }
    @Then("User gets an error message for empty last name field")
    public void user_Gets_Error_Message_for_Empty_Last_Name_Field(){
        RegistrationPage registrationPage =  new RegistrationPage(driver);
        registrationPage.emptyLastNameFieldBox();
    }
    @Then("User is directed to login page")
    public void user_Is_Directed_To_Login_Page(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.returningCustomerIsDiplayed();
    }}
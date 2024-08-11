package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {


    public WebDriver driver;

    @FindBy(xpath = "//a[@class = 'list-group-item']/following::a[@class = 'list-group-item'][text() = 'Logout']")
    private WebElement logoutLink;


    @FindBy(linkText = "Edit your account information")
    private WebElement editAccountInfoLInk;



    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLogoutButtonOnMyAccountPage(){
        logoutLink.click();
    }
        public boolean editAccountInfoLinkIsDisplayed() {
            boolean display = editAccountInfoLInk.isDisplayed();
            return display;

        }
    }


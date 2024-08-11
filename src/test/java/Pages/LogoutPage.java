package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public WebDriver driver;

    @FindBy(linkText = "Logout")
    private WebElement accountLogout;


    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean successfullyLoggedOutIsDisplayed(){
        boolean loggedOut = accountLogout.isDisplayed();
        return loggedOut;
    }
}

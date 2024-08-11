package Hooks;

import Utilities.ConfigReader;
import Utilities.Utils;
import driver_Factory.DriverFactoryCode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Properties;

public class MyHooks {


public WebDriver driver;


    @Before
    public void setup() throws Exception {
        Properties prop = ConfigReader.initializePropertiesFile();
        DriverFactoryCode.initializeBrowser(prop.getProperty("browser"));
        driver = DriverFactoryCode.getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utils.IMPLICIT_WAIT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utils.PAGELOAD_TIMEOUT));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Utils.SCRIPT_TIMEOUT));
        driver.manage().window().maximize();
        driver.get(prop.getProperty("Url"));


    }

    @After
    public void tearDown() {

        driver.quit();
    }
}
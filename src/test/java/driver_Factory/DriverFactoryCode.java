package driver_Factory;



import Hooks.MyHooks;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactoryCode  {

    public static WebDriver driver1;
    public static ChromeOptions options;

    public static void initializeBrowser(String browser) {
        if (browser.equals("Chrome")) {
            options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.EAGER);
            options.addArguments("--start-maximized");
            options.addArguments("--incognito");
            driver1 = new ChromeDriver(options);
        } else if (browser.equals("firefox")) {
            driver1 = new FirefoxDriver();
        } else if (browser.equals("edge")) {
            driver1 = new EdgeDriver();
        }else {
            System.out.println("browser not matching");
        }
    }

    public static WebDriver getDriver() {
        return driver1;
    }
}
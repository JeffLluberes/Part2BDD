package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            dryRun = false,
            monochrome = true,
            features = {"src/test/java/Resource/Feature_Files"},
            glue = {"Step_Definitions", "Hooks"},
            tags = "@TutorialsNinjaLogin or @TutorialNinjaRegistration or @TutorialsNinjaLogout or @TutorialsNinjaSearchProduct or @TutorialsNinjaAddToCart",
            plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json"}
    )

    public class Runner_TestNG extends AbstractTestNGCucumberTests {
    }

//@TutorialsNinjaLogin or @TutorialNinjaRegisteration or @TutorialsNinjaLogout or @TutorialsNinjaSearchProduct or
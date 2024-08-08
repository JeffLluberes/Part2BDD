package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            dryRun = false,
            monochrome = true,
            features = {"src/test/java/Resource/Feature_Files"},
            glue = {"Step_Definitions", "Hooks.MyHooks"},
            tags = "@TutorialsNinjaLogin",
            plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json"}
    )


    public class Runner_TestNG extends AbstractTestNGCucumberTests {
    }


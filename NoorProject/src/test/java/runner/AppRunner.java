package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue={"Utility","stepsDefinitions"},
        plugin = {"pretty",
        		"html:target/site/cucumber-pretty",
        		"json:target/cucumber.json"}
//        dryRun = true,
//        monochrome = false
        )
public class AppRunner {

}

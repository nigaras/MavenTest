package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/cucumber-reports",
                            "json:target/cucumber.json" },
                features = "./src/test/resources/features",
                glue = "stepDefinition",
                tags = "@AddNumbers",
                dryRun = false)


public class CukesRunners {
}

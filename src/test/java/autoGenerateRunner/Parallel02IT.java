import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"/Users/nigara.sawirdin/Documents/MavenTest/src/test/resources/features/AddNumber.feature:12"},
        plugin = {"json:/Users/nigara.sawirdin/Documents/MavenTest/target/cucumber-parallel/json/2.json"},
        monochrome = true,
        glue = {"stepDefinition"})
public class Parallel02IT {
}

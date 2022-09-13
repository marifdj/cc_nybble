
package runners;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/resources/features"},
        glue = {"definitions/RickAndMortyDefinitions.java"},
        plugin = {"pretty",
                "html:target/cucumber-data.html",
                "json:target/cucumber-data.json"
        })
class Runner {
}
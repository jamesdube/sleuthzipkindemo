package eu.luminis.breed.sleuthzipkin.integration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "eu.luminis.breed.sleuthzipkin.integration", plugin = {"pretty", "html:target/cucumber"}, features="src/test" +
        "/resources/")
public class RunTest {

}

package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Feature", //salah target
        glue = "StepDefinition",
        plugin ={"html:target/HTML_report.html"}
)
public class TestRunner {
}
package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Feature",
        glue = "StepDefinition",
        monochrome = true,
        plugin={"pretty", "html:target/cucumber.html"},
        tags="@multipleloginmobile or @multiplefieldsmobile"

)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}

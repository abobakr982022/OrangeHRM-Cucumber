package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\main\\resources\\Feature",
        glue = {"StepDefination"},
        plugin = {"pretty", "html:target/cucumber"},
        tags = "@E2E"

)

public class TestRunners extends AbstractTestNGCucumberTests {
}

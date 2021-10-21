import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,
        plugin = {"pretty",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features = "src/test/resources/feature",
        monochrome = true)
public class CucumberRunnerTest {
}
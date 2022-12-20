import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        glue = "stepdefinition",
        plugin = {"pretty","json:target/cucumber-reports/reports.json",

                "junit:target/cucumber-reports/Cucumber.xml",

                "html:target/cucumber-reports/reports2.html"}
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
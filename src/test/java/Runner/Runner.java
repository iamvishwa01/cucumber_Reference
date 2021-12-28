package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles",glue = "src/test/java/StepDef/LoginStepDef",plugin={"pretty","html:target/cucumber.html"},dryRun = true,monochrome = true)
public class Runner {

}

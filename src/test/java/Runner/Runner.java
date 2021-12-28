package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",glue = "src/test/java/StepDef",plugin={"pretty","html:targe/cucumber.html"})
public class Runner {

}

package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//FeatureFiles/Hooks.feature",glue = "StepDef",

        plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json"},
        // plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json"}, to generate cucumber report in json format
        // plugin={"pretty","html:target/cucumber.html","junit:target/cukes.xml"},
        //

        dryRun = false,
        monochrome = true)
//        strict=true)  if this true it will fail the test cases which are not implemented
//        tags = "@smokeTest")

/*
@RunWith(Cucumber.class)
@CucumberOptions(
        features=".//FeatureFiles/Login.feature", //if you want any specific feature file to run then provide the full path name if not then provide till feature package
        it will execute all the feature files one by one
        glue = "StepDef",   // is map the step defination file to feature file
        plugin={"pretty","html:target/cucumber.html"},
        dryRun = false,monochrome = true)
 */
/*
@RunWith(Cucumber.class)
@CucumberOptions(
        features=".//FeatureFiles/Login.feature", //if you want any specific feature file to run then provide the full path name if not then provide till feature package
        it will execute all the feature files one by one
        glue = "StepDef",   // is map the step defination file to feature file
        plugin={"pretty","html:target/cucumber.html"},
        dryRun = false,
        monochrome = true,
        tags="@smokeTest/@regtest/@sanityTest") // whatever the tag you given in the feature file must be used in tag if you
        want to run only those testcases
 */

public class Runner {

}

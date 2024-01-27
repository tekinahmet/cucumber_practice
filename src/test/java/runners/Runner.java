package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources", //path of the features folder
        glue = "stepdefinitions", //path of the stepdefinitions folder
//        dryRun = true,  // generates missing step defs without running the existing step defs
        dryRun = false,
        tags = "@US002"
)
public class Runner {
}
/*
Runner class is used to run the feature files
And add some report plug ins
Runner class also connects the JAVA(step definitions) and NON-JAVA(feature files) parts
@RunWith(Cucumber.class) is used for making the class Runnable
@CucumberOptions is used for connecting features and step definitions. It is also used for configurations and cucumber report plugins
features is used for path of the features folder
glue is used to give the path of the step definitions folder
dryRun = true  // generates missing step defs without running the existing step defs
dryRun = false must be used to run normally
 */
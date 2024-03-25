package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this class run the feauters file
@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "stapdefinitions",
        features = "src/test/resources/feauters"
        , tags = "@HomeWork3",
        dryRun = true


)
public class runner_HW3 {

}

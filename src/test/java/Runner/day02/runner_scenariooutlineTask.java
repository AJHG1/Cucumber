package Runner.day02;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


// this class run the feauters file
@RunWith(Cucumber.class)
@CucumberOptions(


        glue = "stepdefinitions",
        features = "src/test/resources/feauters/day02/scenariooutlineTask.feature"
        ,
        plugin = {

                "html:cucmber-report/report3.html"
                , "pretty"
        },
        dryRun = true


)
public class runner_scenariooutlineTask {

}



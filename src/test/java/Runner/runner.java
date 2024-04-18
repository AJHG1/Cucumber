package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this class run the feauters file

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "stepdefinitions",
        features = "src/test/resources/feauters",
        tags = "@samsung",
        plugin = {

                "html:cucmber-report/report.html",
                "json:cucmber-report/json/report.json",
                "pretty"
                ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
//        dryRun = true


)
// i have 2 tag
//    1 - @cucmber
//    2 - @samsung
public class runner {


}

package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this class run the feauters file
@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "stapdefinitions",
        features = "src/test/resources/feauters",
        tags = "@HW2"


)
public class runner {
// i have 2 tag
//    1 - @cucmber
//    2 - @samsung
//

}

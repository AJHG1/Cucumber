package stapdefinitions.HomeWork.Day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class HW2 {

//#By using Cucumber framework:
//#Go to https://testpages.eviltester.com/styled/dynamic-buttons-simple.html
//#Click buttons to see message 'All Buttons Clicked!


    WebDriver driver;

    @Given("user gose to google page2")
    public void user_gose_to_google_page() {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @When("user searches Simple Dynamic Buttons")
    public void user_searches_simple_dynamic_buttons() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
    }

    @Then("Click buttons to see message All Buttons Clicked")
    public void click_buttons_to_see_message_all_buttons_clicked() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebElement button = driver.findElement(By.id("button00"));
        button.click();
        button.sendKeys(Keys.TAB, Keys.ENTER);
        button.sendKeys(Keys.TAB, Keys.ENTER);
        button.sendKeys(Keys.TAB, Keys.ENTER);

        Thread.sleep(5000);
        WebElement massage = driver.findElement(By.id("buttonmessage"));
        Assert.assertEquals("All Buttons Clicked", massage.getText());

    }

}

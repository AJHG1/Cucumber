package stapdefinitions.HomeWork.Day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC02_cucumberSearch {

    WebDriver driver;


    @When("user search for cucumber")
    public void user_search_for_cucumber() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys("cucumber" + Keys.ENTER);
    }

    @Then("tests that the page title contains the word cucmber")
    public void tests_that_the_page_title_contains_the_word_cucmber() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.getTitle().contains("cucumber"));

    }

    @Then("close the page")
    public void close_the_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }
}

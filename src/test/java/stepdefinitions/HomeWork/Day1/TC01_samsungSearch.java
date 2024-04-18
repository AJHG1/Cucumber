package stepdefinitions.HomeWork.Day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC01_samsungSearch {

    static WebDriver driver;

    @Given("user gose to google page")
    public void user_gose_to_google_page() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @When("user searches for samsung")
    public void user_searches_for_samsung() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        driver.findElement(By.name("q")).sendKeys("samsung" + Keys.ENTER);
    }

    @Then("tests that the page title contains the word samsung")
    public void tests_that_the_page_title_contains_the_word_samsung() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Assert.assertTrue(driver.getTitle().contains("samsung"));

        driver.close();
    }
}

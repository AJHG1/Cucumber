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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
//        Thread.sleep(4000);
//        WebElement button = driver.findElement(By.id("button00"));
//        button.click();
//        Thread.sleep(5000);
//        WebElement button1 = driver.findElement(By.id("button01"));
//        button1.click();
//        Thread.sleep(5000);
//        WebElement button2 = driver.findElement(By.id("button02"));
//        button2.click();
//        Thread.sleep(5000);
//        WebElement button3 = driver.findElement(By.id("button03"));
//        button3.click();
//        Thread.sleep(5000);
// ----------------------------------------------------------------------
// BY USING WEBDRIVER WITE
// Wait for element with id "button00" to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("button00")));
        button.click();

// Wait for element with id "button01" to be clickable
        WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button01")));
        button1.click();

// Wait for element with id "button02" to be clickable
        WebElement button2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button02")));
        button2.click();

// Wait for element with id "button03" to be clickable
        WebElement button3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button03")));
        button3.click();

//        ---------------------------------------------------------------
        Thread.sleep(5000);
        WebElement massage = driver.findElement(By.id("buttonmessage"));
        Assert.assertEquals("All Buttons Clicked", massage.getText());

    }

}

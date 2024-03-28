package stepdefinitions.HomeWork.Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HW4 {

    public HW4() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Actions actions = new Actions(Driver.getDriver());


    // xpath gor search filed
    @FindBy(xpath = "//*[@id='gh-ac']")
    public WebElement searchfiled;

    //xpath for add to cart button
    @FindBy(xpath = "//*[.='Add to cart']")
    public WebElement item;


    @FindBy(xpath = "//*[@class='ux-call-to-action__cell'][.='Add to cart']")
    public WebElement addcart;

    public void loginFakeClassTOfeacbook() {
        searchfiled.sendKeys("iphone");
        item.click();
        addcart.click();

    }
}


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MainPage extends BaseClass {

    public MainPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id = 'top-links']//a[text() = 'Register']")
    private WebElement registerLink;
//    @FindBy(xpath = "")
//    private WebElement

    public MainPage clickRegisterLink() {
        clickOnElement(registerLink);
        return this;
    }

}

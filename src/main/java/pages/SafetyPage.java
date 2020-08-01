package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SafetyPage extends BaseClass {

    public SafetyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id = 'details-button']")
    private WebElement additionallyButton;
    @FindBy(xpath = "//*[@id = 'proceed-link']")
    private WebElement registerLink;

    public SafetyPage clickAdditionally() {
        clickOnElement(additionallyButton);
        return this;
    }

    public SafetyPage clickRegisterLink() {
        clickOnElement(registerLink);
        return this;
    }

}

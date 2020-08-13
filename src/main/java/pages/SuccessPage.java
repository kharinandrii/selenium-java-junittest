package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SuccessPage extends BaseClass{
    public SuccessPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h1")
    private WebElement successMessage;
    @FindBy(xpath = "//*[text() = 'Continue']")
    private WebElement continueLink;

    public SuccessPage getSuccessMessage(String expectedMessage) {
       String actualResult = successMessage.getText();
        assert actualResult.equals(expectedMessage);
        return this;
    }

    public SuccessPage clickContinueLink() {
        clickOnElement(continueLink);
        return this;
    }
}

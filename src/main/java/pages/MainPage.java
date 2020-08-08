package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseClass {

    public MainPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class = 'dropdown']//*[text() = 'My Account']")
    private WebElement drobDown;
    @FindBy(xpath = "//*[text() = 'Register']")
    private WebElement registerButton;
    @FindBy(xpath = "//*[text() = 'Login']")
    private WebElement loginLink;
    @FindBy(xpath = "//*[text() = 'Logout']")
    private WebElement logoutLink;

    public MainPage openDrobDown() {
        clickOnElement(drobDown);
        return this;
    }
    public MainPage clickOnRegisterButton() {
        clickOnElement(registerButton);
        return this;
    }
    public MainPage clickOnLoginButton() {
        clickOnElement(loginLink);
        return this;
    }
    public MainPage userLogout() {
        clickOnElement(logoutLink);
        return this;
    }

}

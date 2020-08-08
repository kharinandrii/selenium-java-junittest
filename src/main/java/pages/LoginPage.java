package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id = 'input-email']")
    private WebElement loginField;
    @FindBy(xpath = "//*[@id = 'input-password']")
    private WebElement passwordField;

    public LoginPage fillLoginField() {
        String login = hashMap.get("email");
        sendKeysData(loginField, login);
        return this;
    }
    public LoginPage fillPasswordField(String password) {
        sendKeysData(passwordField, password);
        return this;
    }

}

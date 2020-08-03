package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BaseClass {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id = 'input-firstname']")
    private WebElement firstNameField;
    @FindBy(xpath = "//*[@id = 'input-lastname']")
    private WebElement lastNameField;
    @FindBy(xpath = "//*[@id = 'input-email']")
    private WebElement emailField;
    @FindBy(xpath = "//*[@id = 'input-telephone']")
    private WebElement phoneField;
    @FindBy(xpath = "//*[@id = 'input-address-1']")
    private WebElement addressField;
    @FindBy(xpath = "//*[@id = 'input-city']")
    private WebElement cityField;
    @FindBy(xpath = "//*[@id = 'input-postcode']")
    private WebElement postcodeField;
    @FindBy(xpath = "//*[@id = 'input-zone']")
    private WebElement regionSelect;
    @FindBy(xpath = "//*[@id = 'input-password']")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@id='input-confirm']")
    private WebElement confirmField;
    @FindBy(xpath = "//*[@name = 'agree']")
    private WebElement checkBox;
    @FindBy(xpath = "//*[@value = 'Continue']")
    private WebElement continueButton;

    public RegisterPage setFirstName() {
        String name = getFirstName();
        sendKeysData(firstNameField, name);
        hashMap.put("name", name);
        return this;
    }
    public RegisterPage setLastName() {
        String lastName = getLastName();
        sendKeysData(lastNameField, lastName);
        return this;
    }
    public RegisterPage setEmail() {
        String email = hashMap.get("name") + "@test.com";
        sendKeysData(emailField, email);
        return this;
    }
    public RegisterPage setPhone() {
        String phone = getPhone();
        sendKeysData(phoneField, phone);
        return this;
    }
    public RegisterPage setAddress() {
        String address = getAddress();
        sendKeysData(addressField, address);
        return this;
    }
    public RegisterPage setCity() {
        String city = getCity();
        sendKeysData(cityField, city);
        return this;
    }
    public RegisterPage setPostcode () {
        String postcode = getPostcode();
        sendKeysData(postcodeField, postcode);
        return this;
    }
    public RegisterPage chooseRegion(String value) {
        chooseSelectValue(regionSelect , value);
        return this;
    }
    public RegisterPage setPassword(String password) {
        sendKeysData(passwordField, password);
        return this;
    }
    public RegisterPage setConfirm(String password) {
        sendKeysData(confirmField, password);
        return this;
    }
    public RegisterPage setCheckbox() {
        clickOnElement(checkBox);
        return this;
    }
    public RegisterPage clickOnContinue() {
        clickOnElement(continueButton);
        return this;
    }
    //TODO закончить с регистрации - создать класс с следующей после регистрации страницей


}

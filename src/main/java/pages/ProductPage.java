package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BaseClass {
    @FindBy (xpath = "//*[@class = 'radio']")
    private List<WebElement> radioButton;
    @FindBy (xpath = "//*[@type = 'checkbox']")
    private List<WebElement> checkbox;
    @FindBy (xpath = "//*[@id = 'input-option208']")
    private WebElement textField;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage clickOnProductRadio() {
        clickOnElement(radioButton.get(1));
        return this;
    }

    public ProductPage clickOnCheckbox() {
        clickOnElement(checkbox.get(1));
        return this;
    }

    public ProductPage fillTextField() {
        sendKeysData(textField, hashMap.get("name"));
        return this;
    }

}

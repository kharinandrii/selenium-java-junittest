package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPage extends BaseClass {
    public MarketPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text() = 'Desktops']")
    private WebElement desktopDrobDown;
    @FindBy(xpath = "//*[text() = 'Desktops']/../div[@class='dropdown-menu']//a[contains(text(), 'Mac')]")
    private WebElement desktopMac;

    public MarketPage clickOnDesktopDrobDown() {
        clickOnElement(desktopDrobDown);
        return this;
    }
    public MarketPage clickOnDesktopMac() {
        clickOnElement(desktopDrobDown);
        return this;
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MarketPage extends BaseClass {
    public MarketPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text() = 'Desktops']")
    private WebElement desktopDrobDown;
    @FindBy(xpath = "//*[text() = 'Show All Desktops']")
    private WebElement allDesctops;
    @FindBy(xpath = "//*[@class = 'button-group']//*[text() = 'Add to Cart']")
    private List<WebElement> addToCartButton;

    public MarketPage clickOnDesktopDrobDown() {
        clickOnElement(desktopDrobDown);
        return this;
    }

    public MarketPage clickOnAllDesctopLink() {
        clickOnElement(allDesctops);
        return this;
    }

    public MarketPage addToCart() {
        clickOnElement(addToCartButton.get(0));
        return this;
    }
}

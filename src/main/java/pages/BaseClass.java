package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    public WebDriver driver;
    public WebDriverWait wait;

    public BaseClass(WebDriver driver) {
        this.driver = driver;
        wait =  new WebDriverWait(driver, 15);
    }
    
    public void clickOnElement(WebElement element) {
        element.click();
    }
    public void sendKeysText(By elamantBy, String text) {
        driver.findElement(elamantBy).sendKeys(text);
    }
    public void ChooseDrobdownElement(By elementBy, String value ) {
        WebElement selector = driver.findElement(elementBy);
        Select select = new Select(selector);
        select.deselectByValue(value);
    }
}

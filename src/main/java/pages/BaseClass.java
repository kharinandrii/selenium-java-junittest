package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class BaseClass {
    public WebDriver driver;
    public WebDriverWait wait;
    Map<String, String> hashMap = new HashMap<String, String>();
    Faker faker = new Faker();

    public BaseClass(WebDriver driver) {
        this.driver = driver;
        wait =  new WebDriverWait(driver, 15);
    }



    public void clickOnElement(WebElement element) {
        element.click();
    }
    public void sendKeysData(WebElement element, String text) {
        element.sendKeys(text);
    }
    public void chooseSelectValue(WebElement selector, String value ) {
        Select select = new Select(selector);
        select.selectByValue(value);
    }
    public String getFirstName() {
        return faker.name().firstName();
    }
    public String getLastName() {
        return faker.name().lastName();
    }
    public String getPhone() {
        return faker.phoneNumber().phoneNumber();
    }
    public String getAddress() {
        return faker.address().streetName();
    }
    public String getCity() {
        return faker.address().city();
    }
    public String getPostcode() { return faker.address().zipCode(); }
    public void clickOnButtonWithValue(String value) {
        driver.findElement(By.xpath("//*[@value = '"+ value +"']")).click();

    }

}

package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;
import pages.RegisterPage;
import pages.SafetyPage;
import tools.Params;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    MainPage mainPage;
    SafetyPage safetyPage;
    RegisterPage registerPage;
    Params params;

    @BeforeEach
    public void setUP() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        safetyPage = PageFactory.initElements(driver, SafetyPage.class);
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
        params = PageFactory.initElements(driver, Params.class);

    }
    @AfterEach
    public void driverClose() {
        driver.quit();
    }
}

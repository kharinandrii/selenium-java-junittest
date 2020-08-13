package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;
import tools.Params;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    MainPage mainPage;
    SafetyPage safetyPage;
    RegisterPage registerPage;
    Params params;
    SuccessPage successPage;
    BaseClass baseClass;
    LoginPage loginPage;
    MarketPage marketPage;
    ProductPage productPage;

    @BeforeClass
    public void setUP() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://opencart.abstracta.us/");
        mainPage = PageFactory.initElements(driver, MainPage.class);
        safetyPage = PageFactory.initElements(driver, SafetyPage.class);
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
        params = PageFactory.initElements(driver, Params.class);
        successPage = PageFactory.initElements(driver, SuccessPage.class);
        baseClass = PageFactory.initElements(driver,BaseClass.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        marketPage = PageFactory.initElements(driver,MarketPage.class );
        productPage = PageFactory.initElements(driver, ProductPage.class);

    }
    @AfterClass
    public void driverClose() {
        driver.quit();
    }
}

package tests;


import org.testng.annotations.Test;

public class UserLogin extends TestBase {
    @Test
    public void registerTestCase()  {

        mainPage.openDrobDown()
                .clickOnRegisterButton();
        safetyPage.clickAdditionally()
                .clickRegisterLink();
        registerPage.setFirstName()
                .setLastName()
                .setEmail()
                .setPhone()
                .setAddress()
                .setCity()
                .setPostcode()
                .chooseRegion("3513")
                .setPassword(params.PASSWORD)
                .setConfirm(params.PASSWORD)
                .setCheckbox();
        baseClass.clickOnButtonWithValue("Continue");
        successPage.getSuccessMessage(params.EXPECTED_SUCCESS_MESSAGE)
                .clickContinueLink();
        marketPage.clickOnDesktopDrobDown()
                .clickOnAllDesctopLink();
        marketPage.addToCart();
        productPage.clickOnProductRadio()
                .clickOnCheckbox()
                .fillTextField();


    }
    @Test
    public void userLogin() {
        mainPage.openDrobDown()
                .clickOnLoginButton();
        safetyPage.clickAdditionally();
        safetyPage .clickRegisterLink();
        loginPage.fillLoginField()
                 .fillPasswordField(params.PASSWORD);
        baseClass.clickOnButtonWithValue("Login");
        baseClass.getUserCookie();
        marketPage.clickOnDesktopDrobDown();
//                .clickOnDesktopMac();
        mainPage.clickOnButtonWithText(params.ADD_TO_CARD);
    }
}

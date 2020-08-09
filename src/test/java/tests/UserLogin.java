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
       // baseClass.createCookieFile();
        baseClass.getUserCookie();
        mainPage.openDrobDown()
                .userLogout();
        baseClass.addUserCookie();
        loginPage.loginPageForCookies(params.LOGIN_URL);
        marketPage.clickOnDesktopDrobDown()
                .clickOnDesktopMac();
        mainPage.clickOnAddCart(params.ADD_TO_CARD);
    }
    @Test
    public void userLogin() {
        mainPage.openDrobDown()
                .clickOnLoginButton();
        safetyPage.clickAdditionally();
        safetyPage .clickRegisterLink();
        baseClass.addUserCookie();
      //  baseClass.readCookieFile();
        loginPage.loginPageForCookies(params.LOGIN_URL);
//
//        loginPage.fillLoginField()
//                 .fillPasswordField(params.PASSWORD);
//        baseClass.clickOnButtonWithValue("Login");
        marketPage.clickOnDesktopDrobDown()
                .clickOnDesktopMac();
        mainPage.clickOnAddCart(params.ADD_TO_CARD);
    }
}

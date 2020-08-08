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
        mainPage.openDrobDown()
                .userLogout();


    }
    @Test
    public void userLogin() {
        mainPage.openDrobDown()
                .clickOnLoginButton();
        safetyPage.clickAdditionally()
                .clickRegisterLink();
        loginPage.fillLoginField()
                 .fillPasswordField(params.PASSWORD);
        baseClass.clickOnButtonWithValue("Login");
        marketPage.clickOnDesktopDrobDown()
                .clickOnDesktopMac();
        mainPage.clickOnAddCart(params.ADD_TO_CARD);
    }
}

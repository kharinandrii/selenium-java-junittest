package tests;

import org.junit.jupiter.api.Test;

public class UserLogin extends TestBase {
    @Test
    public void userLogin() {
        mainPage.openDrobDown()
                .clickOnLoginButton();
        safetyPage.clickAdditionally()
                .clickRegisterLink();
        loginPage.fillLoginField(params.LOGIN)
                 .fillPasswordField(params.PASSWORD);
        baseClass.clickOnButtonWithValue("Login");
        //TODO продолжить с логина юзера когда получу все данные для входа в аккаунт
    }
}

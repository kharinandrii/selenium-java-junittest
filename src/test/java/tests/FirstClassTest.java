package tests;

import org.junit.jupiter.api.Test;

public class FirstClassTest extends TestBase{
    @Test
    public void testCase()  {
        driver.get("http://opencart.abstracta.us/");
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
                    .setCheckbox()
                    .clickOnContinue();
        successPage.getSuccessMessage(params.EXPECTED_SUCCESS_MESSAGE)
                    .clickContinueLink();


    }
}

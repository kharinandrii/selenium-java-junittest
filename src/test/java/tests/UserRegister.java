package tests;


import org.testng.annotations.Test;

public class UserRegister extends TestBase{
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


    }

}

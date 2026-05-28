package com.erick.framework.tests;

import com.erick.framework.base.BaseTest;
import com.erick.framework.listeners.BaseListener;
import com.erick.framework.pages.InvalidLoginPage;
import com.erick.framework.utils.Utility;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(BaseListener.class)
public class InvalidLoginTest extends BaseTest {

    Utility utility = new Utility();

    @Test
    public void invalidLogin() throws IOException {
        InvalidLoginPage invalidLogin = new InvalidLoginPage(driver);
        invalidLogin.invalidLogin(utility.configReader("username_error"),(utility.configReader("password_error")));
        boolean isDisplayed = invalidLogin.isErrorMsgDisplayed();
        Assert.assertTrue(isDisplayed, "No se mostró el error al realizar un login inválido");

    }

}

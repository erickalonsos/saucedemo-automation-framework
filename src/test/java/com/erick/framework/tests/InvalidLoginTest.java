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
        Assert.assertTrue(true, invalidLogin.invalidLogin(utility.configReader("username"),(utility.configReader("password"))));

    }

}

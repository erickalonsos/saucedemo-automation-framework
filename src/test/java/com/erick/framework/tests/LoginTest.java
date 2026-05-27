package com.erick.framework.tests;

import com.erick.framework.base.BaseTest;
import com.erick.framework.listeners.BaseListener;
import com.erick.framework.pages.LoginPage;
import com.erick.framework.utils.Utility;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Clase con el test que realiza el login, extiende de la clase BaseTest que instancia el navegador
 */
@Listeners(BaseListener.class)
public class LoginTest extends BaseTest {

    Utility utility = new Utility();

    /**
     * Método para realizar login, instancia la clase LoginPage, le envia los parámetros username y password y realiza el assert del titulo.
     */
    @Test
    public void loginTest() throws IOException {
        LoginPage loginPage = new LoginPage(driver);
        String titleProducts = loginPage.login(utility.configReader("username"), utility.configReader("password"));
        Assert.assertEquals(titleProducts, "Products","No estás en la página de products");
    }

}

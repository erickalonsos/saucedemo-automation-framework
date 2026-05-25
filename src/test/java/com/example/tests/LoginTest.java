package com.example.tests;

import com.example.base.BaseTest;
import com.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Clase con el test que realiza el login, extiende de la clase BaseTest que instancia el navegador
 */
public class LoginTest extends BaseTest {

    /**
     * Método para realizar login, instancia la clase LoginPage, le envia los parámetros username y password y realiza el assert del titulo.
     */
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        String titleProducts = loginPage.login("standard_user","secret_sauce");
        Assert.assertEquals(titleProducts, "Products","No estás en la página de products");
    }

}

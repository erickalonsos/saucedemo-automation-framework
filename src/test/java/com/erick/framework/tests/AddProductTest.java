package com.erick.framework.tests;

import com.erick.framework.base.BaseTest;
import com.erick.framework.listeners.BaseListener;
import com.erick.framework.pages.AddProductPage;
import com.erick.framework.pages.LoginPage;
import com.erick.framework.utils.Utility;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(BaseListener.class)
public class AddProductTest extends BaseTest {

    Utility utility = new Utility();

    @Test
    public void addProduct() throws IOException {
        LoginPage login = new LoginPage(driver);
        login.login(utility.configReader("username"), utility.configReader("password"));
        AddProductPage addProduct = new AddProductPage(driver);
        addProduct.addProduct();
        boolean isDisplayed = addProduct.isCartBadgeDisplayed();
        Assert.assertTrue(isDisplayed, "No se muestra el número en el carrito de compras");
    }
}

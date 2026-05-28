package com.erick.framework.tests;

import com.erick.framework.base.BaseTest;
import com.erick.framework.listeners.BaseListener;
import com.erick.framework.pages.AddProductPage;
import com.erick.framework.pages.CheckoutPage;
import com.erick.framework.pages.LoginPage;
import com.erick.framework.utils.Utility;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(BaseListener.class)
public class CheckoutTest extends BaseTest {

    Utility utility = new Utility();

    @Test
    public void checkoutTest() throws IOException {
        LoginPage login = new LoginPage(driver);
        login.login(utility.configReader("username"), utility.configReader("password"));

        AddProductPage addProduct = new AddProductPage(driver);
        addProduct.addProduct();

        CheckoutPage checkout = new CheckoutPage(driver);
        String titleSucces = checkout.checkout(utility.configReader("firstName"), utility.configReader("lastName"), utility.configReader("zipCode"));
        Assert.assertEquals(titleSucces, "Thank you for your order!", "No se realizó la orden de forma exitosa");
    }

}

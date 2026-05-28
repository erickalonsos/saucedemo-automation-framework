package com.erick.framework.tests;

import com.erick.framework.base.BaseTest;
import com.erick.framework.listeners.BaseListener;
import com.erick.framework.pages.CartPage;
import com.erick.framework.pages.LoginPage;
import com.erick.framework.utils.Utility;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(BaseListener.class)
public class CartTest extends BaseTest {

    Utility utility = new Utility();

    @Test
    public void removeProduct() throws IOException {
        LoginPage login = new LoginPage(driver);
        login.login(utility.configReader("username"), utility.configReader("password"));
        CartPage cart = new CartPage(driver);
        cart.removeProduct();
        boolean isPresent = cart.isProductDisplayed();
        Assert.assertFalse(isPresent, "El producto sigue apareciendo en el carrito después de removerlo");
    }

}

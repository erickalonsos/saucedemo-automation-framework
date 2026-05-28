package com.erick.framework.pages;

import com.erick.framework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By backpack = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCart = By.cssSelector("[data-test='shopping-cart-link']");
    By removeButton = By.id("remove-sauce-labs-backpack");
    By itemRemove = By.id("item_4_title_link");


    public void removeProduct() {
        click(bikeLight);
        click(backpack);
        click(shoppingCart);
        explicitWait(removeButton);
        click(removeButton);
    }

    public boolean isProductDisplayed() {
        return isElementDisplayed(itemRemove);
    }


}

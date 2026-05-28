package com.erick.framework.pages;

import com.erick.framework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductPage extends BasePage {

    public AddProductPage(WebDriver driver) {
        super(driver);
    }

    private By addProductButton = By.id("add-to-cart-sauce-labs-bike-light");
    private By cartBadge = By.cssSelector("[data-test='shopping-cart-badge'");

    public void addProduct() {
        click(addProductButton);
        explicitWait(cartBadge);
    }

    public boolean isCartBadgeDisplayed() {
        return isElementDisplayed(cartBadge);
    }

}

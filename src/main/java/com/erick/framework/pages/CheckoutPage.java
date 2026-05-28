package com.erick.framework.pages;

import com.erick.framework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    By shoppingCart = By.cssSelector("[data-test='shopping-cart-link']");
    By checkoutButton = By.id("checkout");
    By inputFirstName = By.id("first-name");
    By inputLastName = By.id("last-name");
    By inputZipCode = By.id("postal-code");
    By continueButton = By.id("continue");
    By finishButton = By.id("finish");
    By textSuccess = By.cssSelector("[data-test='complete-header']");

    public String checkout(String firstName, String lastName, String zipCode) {
        click(shoppingCart);
        explicitWait(checkoutButton);
        click(checkoutButton);
        writeText(inputFirstName, firstName);
        writeText(inputLastName, lastName);
        writeText(inputZipCode, zipCode);
        click(continueButton);
        click(finishButton);
        return getText(textSuccess);
    }



}

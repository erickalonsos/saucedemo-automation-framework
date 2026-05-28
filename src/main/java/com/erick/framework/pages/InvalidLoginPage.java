package com.erick.framework.pages;

import com.erick.framework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class InvalidLoginPage extends BasePage {

    public InvalidLoginPage(WebDriver driver) {
        super(driver);
    }


    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMsg = By.cssSelector("[data-test='error']");

    public void invalidLogin(String strUsername, String strPassword) {
        writeText(username, strUsername);
        writeText(password, strPassword);
        click(loginButton);

    }

    public boolean isErrorMsgDisplayed() {
        return isElementDisplayed(errorMsg);
    }

}

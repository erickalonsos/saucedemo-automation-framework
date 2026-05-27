package com.erick.framework.pages;

import com.erick.framework.base.BasePage;
import com.erick.framework.utils.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class InvalidLoginPage extends BasePage {

    public InvalidLoginPage(WebDriver driver) throws IOException {
        super(driver);
    }

    Utility utility = new Utility();

    private By username = By.id(utility.configReader("loginPage_input_id_username"));
    private By password = By.id(utility.configReader("loginPage_input_id_password"));
    private By loginButton = By.id(utility.configReader("loginPage_button_id_loginButton"));
    private By errorMsg = By.cssSelector(utility.configReader("loginPage_text_error_msg"));

    public String invalidLogin(String strUsername, String strPassword) {
        writeText(username, strUsername);
        writeText(password, strPassword);
        click(loginButton);
        return getText(errorMsg);

    }

}

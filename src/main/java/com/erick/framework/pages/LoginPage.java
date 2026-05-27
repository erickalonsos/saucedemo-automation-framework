package com.erick.framework.pages;

import com.erick.framework.base.BasePage;
import com.erick.framework.utils.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Esta clase contiene los locators de la página y el método login() con las acciones a realizar
 */
public class LoginPage extends BasePage {

    Utility utility = new Utility();

    /**
     * Constructor que recibe el driver para poder utilizarlo
     * @param driver lo recibe del @Test
     */
    public LoginPage(WebDriver driver) throws IOException {
        super(driver);
    }

    //locators
    private By username = By.id(utility.configReader("loginPage_input_id_username"));
    private By password = By.id(utility.configReader("loginPage_input_id_password"));
    private By loginButton = By.id(utility.configReader("loginPage_button_id_loginButton"));
    private By title = By.className(utility.configReader("loginPage_title_class_title_Products"));


    /**
     * Método que realiza el login
     * @param strUsername lo recibe del @Test
     * @param strPassword lo recibe del @Test
     * @return el valor del locator title de la página Products
     */
    public String login(String strUsername, String strPassword) {
        writeText(username, strUsername);
        writeText(password, strPassword);
        click(loginButton);

        return getText(title);

    }

}

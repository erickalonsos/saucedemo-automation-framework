package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Esta clase contiene los locators de la página y el método login() con las acciones a realizar
 */
public class LoginPage {

    private WebDriver driver;

    /**
     * Constructor que recibe el driver para poder utilizarlo
     * @param driver lo recibe del @Test
     */
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");
    private By title = By.className("title");


    /**
     * Método que realiza el login
     * @param strUsername lo recibe del @Test
     * @param strPassword lo recibe del @Test
     * @return el valor del locator title de la página Products
     */
    public String login(String strUsername, String strPassword) {
        driver.findElement(username).sendKeys(strUsername);
        driver.findElement(password).sendKeys(strPassword);
        driver.findElement(loginButton).click();

        String realTittle = driver.findElement(title).getText();

        return realTittle;

    }



}

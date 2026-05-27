package com.erick.framework.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    /**
     * Constructor para recibir el driver
     * @param driver
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By element) {
        driver.findElement(element).click();
    }

    public void writeText(By input, String text) {
        driver.findElement(input).sendKeys(text);
    }

    public String getText(By text) {
       return driver.findElement(text).getText();
    }

}

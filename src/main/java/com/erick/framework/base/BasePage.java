package com.erick.framework.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public void explicitWait(By element) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public boolean isElementDisplayed(By element) {
        try {
            return driver.findElement(element).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}

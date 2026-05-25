package com.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;

import java.time.Duration;

/** En esta clase se configura la instancia del navegador, abre la página y cierra el navegador al terminar
 *
 */
public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void configGlobal() {
        System.setProperty("webdriver.gecko.driver", "src/resources/geckodriver");

    }

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterMethod
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }


}

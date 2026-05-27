package com.erick.framework.base;

import com.erick.framework.utils.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

/** En esta clase se configura la instancia del navegador, abre la página y cierra el navegador al terminar
 *
 */
public class BaseTest {

    protected WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    Utility utility = new Utility();

    @BeforeMethod
    public void setUp() throws IOException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(utility.configReader("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterMethod
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }


}

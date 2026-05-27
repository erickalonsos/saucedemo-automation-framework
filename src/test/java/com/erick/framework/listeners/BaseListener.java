package com.erick.framework.listeners;

import com.erick.framework.base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseListener implements ITestListener {

    public void onTestFailure(ITestResult result) {
        System.out.println("El test " + result.getName() + " falló");

        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).getDriver();

        if(driver != null) {
            TakesScreenshot sceenshotter = (TakesScreenshot) driver;
            File srcFile = sceenshotter.getScreenshotAs(OutputType.FILE);

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String screenshotName = result.getName() + "_" + ".png";

            File destFile = new File(System.getProperty("user.dir") + "/target/screeshots/" + screenshotName);

            try {
                FileUtils.copyFile(srcFile, destFile);
                System.out.println("Captura guardada en: " + destFile.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("No se puedo guardar la captura" + e.getMessage());
            }

        } else {
            System.out.println("No se pudo tomar la captura porque el webdriver venía nulo");
        }


    }

}

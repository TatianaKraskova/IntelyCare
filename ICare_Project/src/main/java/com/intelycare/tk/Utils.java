package com.intelycare.tk;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class Utils {
    final static String BASE_URL = "http://34.234.125.71/apply/career.html";
    final static String CHROME_DRIVER_LOCATION = "/Users/tatiana.kraskova/Projects/chromedriver";
    final static String FIREFOX_DRIVER_LOCATION = "/Users/tatiana.kraskova/Projects/geckodriver";

    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        return driver;
    }

    public static WebDriver initFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", Utils.FIREFOX_DRIVER_LOCATION);
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        return driver;
    }

    public static void takeSnapShot(WebDriver webdriver, String name) {

        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(SrcFile, new File("/Users/tatiana.kraskova/Desktop/temp/"+name+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

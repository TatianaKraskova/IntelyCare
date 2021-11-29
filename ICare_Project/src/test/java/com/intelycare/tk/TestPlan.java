package com.intelycare.tk;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestPlan {
    private WebDriver driver = null;

    @BeforeTest
    public void init() {
        driver = Utils.initChromeDriver();
        //driver = Utils.initFirefoxDriver();
    }

    @AfterTest
    public void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

    @Test(testName = "Create an account")

    public void createAccount() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        SignUpPageData data = new SignUpPageData();
        String sessionId = "" + System.currentTimeMillis();

        data.setEmail("testJava" + sessionId + "@mailinator.com");
        data.setPassword("Test@123");

        SignUpPage signUpPage = new SignUpPage(driver, data);
        signUpPage.enterEmail();
        signUpPage.enterPassword();
        Utils.takeSnapShot(driver, sessionId + "/s1");
        signUpPage.clickSubmitButton();

        String actualUrl = "http://34.234.125.71/apply/career.html";
        Assert.assertEquals(driver.getCurrentUrl(), actualUrl);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        BasicInfoPageData basicInfoPageData = new BasicInfoPageData();
        basicInfoPageData.setFirstName("TestName");
        basicInfoPageData.setLastName("TestLastName");
        basicInfoPageData.setMobileNumber("9789054444");
        basicInfoPageData.setZipCode("01824");

        BasicInfoPage BasicInfoPage = new BasicInfoPage(driver, basicInfoPageData);
        BasicInfoPage.enterFirstName();
        BasicInfoPage.enterLastName();
        BasicInfoPage.enterMobileNumber();
        BasicInfoPage.enterZipCode();
        BasicInfoPage.clickType();
        BasicInfoPage.clickDayShiftType();
        BasicInfoPage.clickEveningShiftType();
        BasicInfoPage.clickWorkExperience();
        BasicInfoPage.clickTermsServprivacyPolicy();
        Utils.takeSnapShot(driver, sessionId + "/s2");

        BasicInfoPage.clickAPBasicInfoContinue();

        driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);

        Utils.takeSnapShot(driver, sessionId + "/s3");

        Assert.assertEquals(driver.getTitle(), "IntelyCare Careers");
    }
}
package com.intelycare.tk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicInfoPage extends PageObject {

    private final BasicInfoPageData basicInfoPageData;

    @FindBy(id = "input_2")
    private WebElement firstName;

    @FindBy(name = "lastName")
    private WebElement lastName;

    @FindBy(name = "mobile")
    private WebElement mobileNumber;

    //@FindBy(xpath = "//*[contains(text(),'Zip Code')]") test keeps failing 
    @FindBy(id = "input_5")
    private WebElement zipCode;

    @FindBy(xpath = "//md-radio-button[@value='CNA']")
    private WebElement type;

    @FindBy(xpath = "//md-checkbox[@aria-label='Day Checkbox']")
    private WebElement dayShiftType;

    @FindBy(xpath = "//md-checkbox[@aria-label='Evening Checkbox']")
    private WebElement eveningShiftType;

    @FindBy(id = "radio_11")
    private WebElement workExperience;

    @FindBy(xpath = "//md-checkbox[@aria-label='Checkbox 1']")
    private WebElement termsServprivacyPolicy;

    @FindBy(xpath = "//button[@id='AP_Basic_Info_continue']")
    private WebElement continueButton;

    public BasicInfoPage(WebDriver driver, BasicInfoPageData data) {
        super(driver);
        this.basicInfoPageData = data;
    }

    public void enterFirstName() {
        this.firstName.sendKeys(basicInfoPageData.getFirstName());
    }

    public void enterLastName() {
        this.lastName.sendKeys(basicInfoPageData.getLastName());
    }

    public void enterMobileNumber() {
        this.mobileNumber.sendKeys(basicInfoPageData.getMobileNumber());
    }

    public void enterZipCode() {
        this.zipCode.sendKeys(basicInfoPageData.getZipCode());
    }

    public void clickType() {
        this.type.click();
    }

    public void clickDayShiftType() {
        this.dayShiftType.click();
    }

    public void clickEveningShiftType() {
        this.eveningShiftType.click();
    }

    public void clickWorkExperience() {
        this.workExperience.click();
    }

    public void clickTermsServprivacyPolicy() {
        this.termsServprivacyPolicy.click();
    }

    public void clickAPBasicInfoContinue() {
        this.continueButton.click();
    }
}

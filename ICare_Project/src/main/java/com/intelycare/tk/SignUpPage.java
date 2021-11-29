package com.intelycare.tk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageObject {

    private final SignUpPageData signUpPageData;

    @FindBy(id = "input_0")
    private WebElement email;

    @FindBy(xpath = "//*[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement submitButton;

    public SignUpPage(WebDriver driver, SignUpPageData signUpPageData) {
        super(driver);
        this.signUpPageData = signUpPageData;
    }

    public void enterEmail() {
        this.email.sendKeys(signUpPageData.getEmail());
    }

    public void enterPassword() {
        this.password.sendKeys(signUpPageData.getPassword());
    }

    public void clickSubmitButton() {
        this.submitButton.click();
    }
}
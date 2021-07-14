package com.ebay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id="userid")
    private WebElement emailField;

    @FindBy(id="signin-continue-btn")
    private WebElement continueButton;

    @FindBy(id="pass")
    private WebElement passwordField;

    public void typeOnEmailField(String userName){
        emailField.sendKeys(userName);
    }
    public void clickOnContinueButton(){
        continueButton.click();
    }
    public void typeOnPasswordField(String password){
    passwordField.sendKeys(password);
    }

}

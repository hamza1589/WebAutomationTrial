package com.ebay;

import com.report.ExtentTestManager;
import com.sun.media.jfxmedia.logging.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private static org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(HomePage.class);
    @FindBy(id = "gh-ac")
    private WebElement searchBar;

    @FindBy(id="gh-btn")
    private WebElement seachBtn;

    @FindBy(linkText = "Sign in")
    private WebElement signInBtn;

    @FindBy(xpath = "//a[text()='register']")
    private WebElement registerBtn;


    public void typeOnSearchBar(String data) {
        ExtentTestManager.log(data);
        searchBar.sendKeys(data);


    }

    public void clickOnSearchButton(){
        seachBtn.click();
        ExtentTestManager.log("Clicked On Search Button");
    }

    public void clickOnSignInButton() {
       signInBtn.click();
        ExtentTestManager.log("Clicked On Sign In Button");
    }
    public void clickOnRegisterButton() {
       registerBtn.click();
        ExtentTestManager.log("Clicked On Sign In Button");
    }
}

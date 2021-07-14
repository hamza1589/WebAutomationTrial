package com.ebay.pages;

import com.report.ExtentTestManager;
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

    public void typeOnSearchBar(String data) {
        LOGGER.info(data);
        searchBar.sendKeys(data);


    }

    public void clickOnSearchButton(){
        seachBtn.click();
    }

    public void clickOnSignInButton() {
       signInBtn.click();
        ExtentTestManager.log("Clicked on sign in button");
    }
}

package com.ebay.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class RegisterPage extends TestBase {
    /**
     * //h1[text()='Create an account']
     */

        @FindBy(xpath = "//h1[text()='Create an account']")
        private WebElement createAccountHeading;

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "Email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;



        public void validateCreateAccountDisplayed(){
            boolean flag=createAccountHeading.isDisplayed();
            Assert.assertTrue(flag);
            ExtentTestManager.log("Account is been diaplayed ");
        }
        public void validateURL(){
            String actualURL=TestBase.driver.getCurrentUrl();
            String expectedURL="https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F";
            Assert.assertEquals(actualURL,expectedURL);
            ExtentTestManager.log("URL has been validated : "+actualURL);
        }
        public void validateField(){
            Assert.assertTrue(firstName.isDisplayed());
            ExtentTestManager.log("first name is displayed ");
            Assert.assertTrue(lastName.isDisplayed());
            ExtentTestManager.log("Last name is displayed  ");
            Assert.assertTrue(password.isDisplayed());
            ExtentTestManager.log("Password is displayed  ");


        }

    public void validateFieldUsingSoftAssert(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(firstName.isDisplayed());
        ExtentTestManager.log("first name is displayed ");
        String actualData=lastName.getAttribute("name");
        String expectedData="lastname";
        softAssert.assertEquals(actualData,expectedData);
        softAssert.assertTrue(lastName.isDisplayed());
        ExtentTestManager.log("Last name is displayed  ");
        softAssert.assertTrue(password.isDisplayed());
        ExtentTestManager.log("Password is displayed  ");
        softAssert.assertTrue(email.isDisplayed());
        ExtentTestManager.log("Email is displayed ");

         softAssert.assertAll();


    }





}


package com.test.qa.pageobjects.pages;

import com.google.common.primitives.ImmutableDoubleArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSecurePage extends PageBase {

    private Logger logger = LogManager.getLogger(LoginSecurePage.class);
    private By hdrSecureArea = By.xpath("//h2");
    private By btnLogout = By.xpath("//a[@href='/logout']");
    private By alertLoginSuccess = By.id("flash");

    public LoginSecurePage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
    public boolean isLoginSecurePageDisplayed() {
        boolean flag = false;
        try {
            logger.log(Level.INFO, "Checking if dashboard displayed");
            driver.findElement(hdrSecureArea).isDisplayed();
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public boolean isLoginAlertDisplayed() {
        boolean flag = false;
        try {
            logger.log(Level.INFO, "Checking if dashboard displayed");
            driver.findElement(alertLoginSuccess).isDisplayed();
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }


    public String getLoginAlertMessage() {
        String strMessage;
        try {
            strMessage = driver.findElement(alertLoginSuccess).getText();
        } catch (Exception e) {
            strMessage = "";
            logger.log(Level.ERROR, " Error in reading message");
        }
        return strMessage;

    }

    public void clickLogout() {
        driver.findElement(btnLogout).click();
        logger.log(Level.INFO, " Clicked logout button");

    }
}

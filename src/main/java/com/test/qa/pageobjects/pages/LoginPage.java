package com.test.qa.pageobjects.pages;

import com.google.common.primitives.ImmutableDoubleArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {

    private static Logger logger = LogManager.getLogger(LoginPage.class);
    private By hdrLogin = By.xpath("//h2");
    private By txtUserName = By.id("username");
    private By txtPassword = By.id("password");
    private By btnSubmit = By.className("radius");
    private By alertLogoutSuccess = By.id("flash");

    public LoginPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
    public LoginPage login(String username, String password) {
        driver.findElement(txtUserName).sendKeys(username);
        logger.log(Level.INFO, "Entered username : " + username);
        driver.findElement(txtPassword).sendKeys(password);
        logger.log(Level.INFO, "Entered password : " + password);
        driver.findElement(btnSubmit).click();
        logger.log(Level.INFO, " Clicked login button");
        return new LoginPage(driver);
    }

    public String getErrorMessage() {
        String strMessage;
        try {
            strMessage = driver.findElement(alertLogoutSuccess).getText();
        } catch (Exception e) {
            strMessage = "";
            logger.log(Level.ERROR, " Error in reading message");
        }
        return strMessage;
    }

    public boolean isLoginPageDisplayed() {
        boolean flag = false;
        try {
            logger.log(Level.INFO, "Checking if dashboard displayed");
            driver.findElement(alertLogoutSuccess).isDisplayed();
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public boolean isLogoutAlertDisplayed() {
        boolean flag = false;
        try {
            logger.log(Level.INFO, "Checking if dashboard displayed");
            driver.findElement(alertLogoutSuccess).isDisplayed();
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public String getLogoutAlertMessage() {
        String strMessage;
        try {
            strMessage = driver.findElement(alertLogoutSuccess).getText();
        } catch (Exception e) {
            strMessage = "";
            logger.log(Level.ERROR, " Error in reading message");
        }
        return strMessage;
    }
}

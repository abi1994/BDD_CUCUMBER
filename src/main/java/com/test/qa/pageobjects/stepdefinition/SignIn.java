package com.test.qa.pageobjects.stepdefinition;

import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.LoginSecurePage;
import com.test.qa.pageobjects.pages.OrangeHRMDashboardPage;
import com.test.qa.pageobjects.pages.OrangeHRMLoginPage;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class SignIn {
    public static Properties prop = new Properties();
    protected static WebDriver driver;
    private static String os;
    private static String browser;
    private static String baseUrl;
    private static String webDriverLocation;


        @Before
        public void setup() throws IOException {
            InputStream input = null;
            input =
                    this.getClass().getClassLoader().getResourceAsStream("config/config.properties");
            prop.load(input);
            os = prop.getProperty("os");
            browser = prop.getProperty("browser");
            baseUrl = prop.getProperty("baseUrl");
            webDriverLocation = prop.getProperty("webDriverLocation");
            switch (os) {
                case "windows":
                    if (browser.equals("chrome")) {
                        System.setProperty("webdriver.chrome.driver", webDriverLocation +
                                "chromedriver.exe");
                        driver = new ChromeDriver();
                    } else {
                        System.setProperty("webdriver.gecko.driver", webDriverLocation +
                                "geckodriver,exe");
                        driver = new FirefoxDriver();
                    }
                    break;
                case "ubuntu":
                    if (browser.equals("chrome")) {
                        System.setProperty("webdriver.chrome.driver", webDriverLocation +
                                "chromedriver");
                        driver = new ChromeDriver();
                    } else {
                        System.setProperty("webdriver.gecko.driver", webDriverLocation +
                                "geckodriver");
                        driver = new FirefoxDriver();
                    }
                    break;
            }
        }

        @After
        public void tearDown(Scenario scenario) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
            driver.quit();
        }


//    @Given("^I launch elementalSelenium application$")
//    public void i_launch_elementalSelenium_application() {
//        driver.get(baseUrl);
//    }
//
//    @When("^I sign in with username \"([^\"]*)\" and password \"([^\"]*)\"in login page$")
//    public void i_sign_in_with_username_and_password_in_login_page(String username, String password) {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login(username, password);
//    }
//
//    @Then("^I I should see login secure page$")
//    public void i_should_see_dashbord_page() {
//        LoginSecurePage dashboardPage = new LoginSecurePage(driver);
//        Assert.assertTrue(dashboardPage.isLoginSecurePageDisplayed());
//    }
//
//    @When("^I get logged out$")
//    public void i_get_logged_out(){
//           LoginSecurePage LogoutPage =new LoginSecurePage(driver);
//           LogoutPage.LogOut();
//    }
//    @Then("^I should see login page \"([^\"]*)\"$")
//    public void i_should_get_error_message(String errMessage) {
//        LoginSecurePage loginPage = new LoginSecurePage(driver);
//        Assert.assertEquals("Error message does not match", errMessage, loginPage.);
//    }


    @Given("^I launch elementalSelenium application$")
    public void iLaunchElementalSeleniumApplication()  {
        driver.get(baseUrl);
    }


    @When("^I sign in with username \"([^\"]*)\" and password \"([^\"]*)\" in login page$")
    public void iSignInWithUsernameAndPasswordInLoginPage(String Username, String Password) {
      LoginPage loginPage =new LoginPage(driver);
      loginPage.login(Username,Password);
    }

    @Then("^I should see login secure page$")
    public void iShouldSeeLoginSecurePage() {
        LoginSecurePage loginSecurePage = new LoginSecurePage(driver);
        Assert.assertTrue("Page is not displayed", loginSecurePage.isLoginSecurePageDisplayed());
        Assert.assertTrue("Alert is not displayed", loginSecurePage.isLoginAlertDisplayed());
        Assert.assertTrue("Message is not same", loginSecurePage.getLoginAlertMessage().contains("You logged into a secure area!"));
    }
    @When("^I get logged out$")
    public void iGetLoggedOut() {
        LoginSecurePage loginSecurePage = new LoginSecurePage(driver);
        loginSecurePage.clickLogout();
    }
    @Then("^I should see login page$")
    public void iShouldSeeLoginPage() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue("Page is not displayed", loginPage.isLoginPageDisplayed());
        Assert.assertTrue("Alert is not displayed", loginPage.isLogoutAlertDisplayed());
        Assert.assertTrue("Message is not same", loginPage.getLogoutAlertMessage().contains("You logged out of the secure area!"));
    }

    @Then("^I should get error message \"([^\"]*)\" in login page$")
    public void iShouldGetErrorMessageInLoginPage(String message) {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue("Message is not same", loginPage.getLogoutAlertMessage().contains(message));
    }
    }

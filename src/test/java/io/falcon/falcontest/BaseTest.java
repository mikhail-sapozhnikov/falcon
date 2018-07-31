package io.falcon.falcontest;

import com.jayway.restassured.RestAssured;
import io.falcon.api.ApiRequests;
import io.falcon.ui.pages.BasePage;
import io.falcon.ui.pages.LoginPage;
import io.falcon.ui.pages.MainPage;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public static WebDriver driver;
    protected String baseUrl = "https://twitter.com/login";

    BasePage basePage = new BasePage(driver);
    ApiRequests apiRequests = new ApiRequests();
    LoginPage loginPage;
    MainPage mainPage;


    public BaseTest() {
        RestAssured.baseURI = "https://api.twitter.com";
        RestAssured.basePath = "/1.1/statuses";
    }

    protected void openTwitterPage() {
        driver.get(baseUrl);
    }

    protected void initDriver() {
        driver = basePage.getDriver();
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
    }

    protected void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public String setWebDriverPath() {

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            return "Windows";
        } else if (os.contains("nux") || os.contains("nix")) {
            return "Linux";
        } else if (os.contains("mac")) {
            return "Mac";
        } else if (os.contains("sunos")) {
            return "Solaris";
        } else {
            return "Other";
        }
    }

}



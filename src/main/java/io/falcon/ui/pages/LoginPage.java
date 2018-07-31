package io.falcon.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(className = "js-username-field")
    private WebElement fieldLogin; //Mikhail23839210
    @FindBy(className = "js-password-field")
    private WebElement fieldPassword;
    @FindBy(className = "EdgeButtom--medium")
    private WebElement btnLogin;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void enterLogin(String login) {
        fieldLogin.sendKeys(login);
    }

    public void enterPassword(String pass) {
        fieldPassword.sendKeys(pass);
    }

    public void clickLoginBtn() {
        btnLogin.click();
    }

}

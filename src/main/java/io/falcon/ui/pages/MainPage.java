package io.falcon.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    @FindBy(className = "Icon--caretDownLight")
    private WebElement btnDropDownList;
    @FindBy(className = "js-actionDelete")
    private WebElement btnDeleteDropdown;
    @FindBy(className = "delete-action")
    private WebElement btnConfirmDelete;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void deleteTweet() {

        btnDropDownList.click();
        btnDeleteDropdown.click();
        btnConfirmDelete.click();

    }

}

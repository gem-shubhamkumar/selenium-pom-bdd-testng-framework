package org.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    @CacheLookup
    private WebElement input_userName;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement input_password;

    @FindBy(id = "login-button")
    @CacheLookup
    private WebElement btn_login;

    @FindBy(id = "react-burger-menu-btn")
    @CacheLookup
    private WebElement btn_menu;

    @FindBy(id = "logout_sidebar_link")
    @CacheLookup
    private WebElement btn_logout;

    public WebElement getInput_userName() {
        return input_userName;
    }

    public WebElement getInput_password() {
        return input_password;
    }

    public WebElement getBtn_login() {
        return btn_login;
    }

    public WebElement getBtn_menu() {
        return btn_menu;
    }

    public WebElement getBtn_logout() {
        return btn_logout;
    }
}

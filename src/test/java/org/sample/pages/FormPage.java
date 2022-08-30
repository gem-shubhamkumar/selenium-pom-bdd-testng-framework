package org.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

    private WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    private WebElement input_firstName;

    @FindBy(id = "last-name")
    private WebElement input_lastName;

    @FindBy(id = "postal-code")
    private WebElement input_zipCode;

    @FindBy(id = "continue")
    private WebElement btn_continue;

    public WebElement getInput_firstName() {
        return input_firstName;
    }

    public WebElement getInput_lastName() {
        return input_lastName;
    }

    public WebElement getInput_zipCode() {
        return input_zipCode;
    }

    public WebElement getBtn_continue() {
        return btn_continue;
    }
}

package org.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "title")
    private WebElement title_PageTitle;

    @FindBy(className = "inventory_item_name")
    private WebElement text_ProductName;

    @FindBy(className = "inventory_item_price")
    private WebElement text_ProductPrice;

    @FindBy(id ="checkout")
    private WebElement btn_CheckOut;

    public WebElement getTitle_PageTitle() {
        return title_PageTitle;
    }

    public WebElement getText_ProductName() {
        return text_ProductName;
    }

    public WebElement getText_ProductPrice() {
        return text_ProductPrice;
    }

    public WebElement getBtn_CheckOut() {
        return btn_CheckOut;
    }
}

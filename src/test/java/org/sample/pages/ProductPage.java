package org.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "title")
    private WebElement title_PageTitle;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> text_ProductName;

    @FindBy(className = "inventory_item_price")
    private List<WebElement> text_ProductPrice;

    @FindBy(className = "btn_inventory")
    private List<WebElement> btn_AddToCart;

    @FindBy(className = "shopping_cart_link")
    private WebElement btn_cart;

    public WebElement getTitle_PageTitle() {
        return title_PageTitle;
    }

    public List<WebElement> getText_ProductName() {
        return text_ProductName;
    }

    public List<WebElement> getText_ProductPrice() {
        return text_ProductPrice;
    }

    public List<WebElement> getBtn_AddToCart() {
        return btn_AddToCart;
    }

    public WebElement getBtn_cart() {
        return btn_cart;
    }
}

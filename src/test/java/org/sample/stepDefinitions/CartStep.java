package org.sample.stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.sample.pages.CartPage;
import org.sample.utils.BaseClass;
import org.sample.utils.CommonFunctions;
import org.sample.utils.Constants;
import org.testng.Assert;

public class CartStep {
    WebDriver driver = BaseClass.driver;
    CartPage cartPage = new CartPage(driver);
    CommonFunctions cf = new CommonFunctions();

    @When("goto the cart page and verify product details and checkout")
    public void goto_the_cart_page_and_verify_product_details_and_checkout() {
        cf.waitUntilElementVisible(driver, cartPage.getTitle_PageTitle(), 10);
        Assert.assertEquals(cartPage.getTitle_PageTitle().getText(), Constants.cartPageTitle);
        Assert.assertEquals(cartPage.getText_ProductName().getText(), cf.getMapValue(Constants.productName));
        Assert.assertEquals(cartPage.getText_ProductPrice().getText(), cf.getMapValue(Constants.productPrice));

        cartPage.getBtn_CheckOut().click();
    }
}

package org.sample.stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.sample.pages.CheckoutPage;
import org.sample.utils.CommonFunctions;
import org.sample.utils.Constants;
import org.testng.Assert;

public class CheckoutStep {

    WebDriver driver = Hooks.driver;
    CheckoutPage checkoutPage = new CheckoutPage(driver);
    CommonFunctions cf = new CommonFunctions();

    @Then("verify the checkout page and place the order")
    public void verify_the_checkout_page_and_place_the_order() {
        cf.waitUntilElementVisible(driver, checkoutPage.getTitle_PageTitle(), 10);

        Assert.assertEquals(checkoutPage.getTitle_PageTitle().getText(), Constants.checkoutTitle);
        Assert.assertEquals(checkoutPage.getText_ProductName().getText(), cf.getMapValue(Constants.productName));
        Assert.assertEquals(checkoutPage.getText_ProductPrice().getText(), cf.getMapValue(Constants.productPrice));

        checkoutPage.getBtn_Finish().click();
    }
    @Then("verify the successful message")
    public void verify_the_successful_message() {
        cf.waitUntilElementVisible(driver, checkoutPage.getTitle_PageTitle(), 10);

        Assert.assertEquals(checkoutPage.getTitle_PageTitle().getText(), Constants.successPageTitle);
        Assert.assertEquals(checkoutPage.getText_Success().getText(), Constants.successPageMessage);

    }
}

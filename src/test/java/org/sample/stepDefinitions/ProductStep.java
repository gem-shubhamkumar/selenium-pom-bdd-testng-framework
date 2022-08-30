package org.sample.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.sample.pages.ProductPage;
import org.sample.utils.BaseClass;
import org.sample.utils.CommonFunctions;
import org.sample.utils.Constants;
import org.testng.Assert;

public class ProductStep {

    WebDriver driver = BaseClass.driver;
    ProductPage productPage = new ProductPage(driver);
    CommonFunctions cf = new CommonFunctions();

    @Given("verify the products page")
    public void verify_the_products_page() {
        cf.waitUntilElementVisible(driver, productPage.getTitle_PageTitle(), 10);
        Assert.assertEquals(productPage.getTitle_PageTitle().getText(), Constants.productPageTitle);
    }

    @When("add a {string} into cart")
    public void add_a_into_cart(String productName) {
        int size = productPage.getText_ProductName().size();

        for (int i = 0; i < size; i++) {
            if (productPage.getText_ProductName().get(i).getText().equalsIgnoreCase(productName)) {
                cf.setMapValue(Constants.productName, productName);
                cf.setMapValue(Constants.productPrice, productPage.getText_ProductPrice().get(i).getText());
                productPage.getBtn_AddToCart().get(i).click();
                cf.waitForSeconds(2);
                break;
            } else {
                cf.pageScroll(0, 100, driver);
            }
        }
        cf.pageScroll(0, -500, driver);
        productPage.getBtn_cart().click();
    }
}

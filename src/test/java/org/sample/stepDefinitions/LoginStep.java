package org.sample.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.sample.pages.LoginPage;
import org.sample.utils.BaseClass;
import org.sample.utils.CommonFunctions;

public class LoginStep {
//    WebDriver driver = Hooks.driver;

    WebDriver driver = BaseClass.driver;
    LoginPage loginPage = new LoginPage(driver);
    CommonFunctions cf = new CommonFunctions();

    @Given("launch the site and login with {string} and {string}")
    public void launch_the_site_and_login_with_and(String username, String password) {
        loginPage.getInput_userName().sendKeys(username);
        loginPage.getInput_password().sendKeys(password);
        loginPage.getBtn_login().click();
    }

    @Then("logout the user")
    public void logout_the_user() {
        loginPage.getBtn_menu().click();
        cf.waitForSeconds(1);
        loginPage.getBtn_logout().click();
        cf.waitForSeconds(1);
    }

}

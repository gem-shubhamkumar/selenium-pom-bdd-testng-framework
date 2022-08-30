package org.sample.stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.sample.pages.FormPage;
import org.sample.utils.CommonFunctions;

public class FormStep {

    WebDriver driver = Hooks.driver;
    FormPage formPage = new FormPage(driver);
    CommonFunctions cf = new CommonFunctions();

    @Then("fill the form with {string} {string} and {string} and continue")
    public void fill_the_form_with_and_and_continue(String fName, String lName, String zipCode) {
        formPage.getInput_firstName().sendKeys(fName);
        formPage.getInput_lastName().sendKeys(lName);
        formPage.getInput_zipCode().sendKeys(zipCode);

        formPage.getBtn_continue().click();
    }
}

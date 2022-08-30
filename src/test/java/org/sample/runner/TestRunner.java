package org.sample.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"org/sample/stepDefinitions"},
        monochrome = true,
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
        tags = "@Test"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

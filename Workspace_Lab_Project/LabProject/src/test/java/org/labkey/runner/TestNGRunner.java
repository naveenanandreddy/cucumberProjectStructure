package org.labkey.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/org/labkey/features",
        glue = {"org.labkey.cucumberOptions","org.labkey.stepDefinitions"},
     //   plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        dryRun=false

)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}

package org.labkey.cucumberOptions;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.*;
import org.labkey.utility.ExtentManager;
import org.labkey.utility.ReportUtil;
import org.labkey.utility.TestContextSetup;

import java.io.IOException;

public class Hooks {


private TestContextSetup testContextSetup;
private ExtentTest extentTest;
    public Hooks(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
    }

    @Before
    public void setUp(Scenario scenario){

        System.out.println("Hooks before anotation executed");
      extentTest=  extentTest=testContextSetup.getExtentReports().createTest(scenario.getName());
      testContextSetup.setExtentTest(extentTest);

    }


    @AfterAll
    public static void tearDown(){

        System.out.println("Hooks after anotation executed");
        ExtentManager.flushReports();
    }




}

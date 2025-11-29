package org.labkey.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;

public class TestContextSetup {

    private DriverManager driverManager;
    @Getter
    private WebDriver driver;

    @Getter
    private ExtentReports extentReports;

    @Getter
    @Setter
    private ExtentTest extentTest;

    @Getter
    private ReportUtil reportUtil;


    public TestContextSetup(DriverManager driverManager){
        this.driverManager = driverManager;
        this.driver= driverManager.getDriver();
        this.extentReports=ExtentManager.getExtentReport();
        reportUtil=new ReportUtil(this);

    }






}

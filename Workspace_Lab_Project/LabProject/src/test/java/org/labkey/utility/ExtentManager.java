package org.labkey.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentManager {

    private static ExtentReports extentReport;

    private ExtentManager(){

    }

    public static ExtentReports getExtentReport(){

        if (extentReport == null){

            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMM-yy HH-mm-ss");
            String timeStamp = LocalDateTime.now().format(formatter);
            String reportFolder= "test-output/ExtentReports" +  timeStamp;
            new File(reportFolder).mkdirs();

            String reportPath= reportFolder + "/SparkReport.html";
            ExtentSparkReporter sparkReporter=new ExtentSparkReporter(reportPath);

            extentReport=new ExtentReports();
            extentReport.attachReporter(sparkReporter);

        }

        return extentReport;
    }

    public static void flushReports(){

        if(extentReport !=null){
          extentReport.flush();
        }
    }


}

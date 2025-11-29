package org.labkey.utility;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

public class ReportUtil {

    private TestContextSetup testContextSetup;
    private ExtentTest extentTest;

    public ReportUtil(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    public void logPass(String message) {
        testContextSetup.getExtentTest().pass(message);
    }


    public void logFail(String message) {
        testContextSetup.getExtentTest().fail(message);
    }

    public void logInfo(String message) {
        testContextSetup.getExtentTest().info(message);
    }

    public void startTest(String testName) {
        //   extentTest = extentReports.createTest(testName);
        extentTest = testContextSetup.getExtentReports().createTest(testName);
    }

    public void logStepWithScreenshot(String message, String base64Screenshot) throws IOException {
        if (testContextSetup.getExtentTest() != null && base64Screenshot != null) {
            testContextSetup.getExtentTest().info(message,
                    MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
        } else {
            System.out.println("INFO: " + message);
        }

    }
        public static String getBase64FullPageScreenshot(WebDriver driver) {
            try {
                Screenshot screenShot = new AShot()
                        .shootingStrategy(ShootingStrategies.viewportPasting(100))
                        .takeScreenshot(driver);

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(screenShot.getImage(), "png", baos);
                byte[] imageBytes = baos.toByteArray();
                return Base64.getEncoder().encodeToString(imageBytes);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }

        }


    }

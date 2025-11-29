package org.labkey.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {

    private WebDriver driver;

    public WebDriver getDriver(){

        if (driver == null){
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        }
        return driver;
    }

    public void quitDriver(){
        if(driver !=null){
            driver.quit();
            driver =null;
        }
    }

}

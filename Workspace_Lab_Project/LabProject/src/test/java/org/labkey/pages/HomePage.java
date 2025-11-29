package org.labkey.pages;

import org.labkey.utility.TestContextSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

private WebDriver driver;
    private TestContextSetup testContextSetup;

    public By username=By.xpath("//input[@id='email']");
    public By password=By.xpath("//input[@id='password']");
    public By check=By.xpath("//input[@id='approvedTermsOfUse']");
    public By signButton=By.xpath("//span[text()='Sign In']");

public HomePage(TestContextSetup testContextSetup){
this.testContextSetup=testContextSetup;
this.driver=testContextSetup.getDriver();
}

    public void enterEmail(String email){
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(email);
    }

    public void enterPassword(String pass){
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
    }

    public void clickTermsCheckbox() {
        driver.findElement(check).click();
    }

    public void sign() {
        driver.findElement(signButton).click();
    }

}

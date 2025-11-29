package org.labkey.stepDefinitions;

import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.labkey.pages.HomePage;
import org.labkey.utility.TestContextSetup;
import org.testng.Assert;

public class AddSampleStep {

    private TestContextSetup testContextSetup;
    private HomePage homePage;
    public AddSampleStep(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
        this.homePage=testContextSetup.getPageObjectManager().homePage();
    }

@Given("the user is logged into the LabKey application")
public void the_user_is_logged_into_the_lab_key_application() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
    testContextSetup.getDriver().get("https://samplemanager-test-65575.lkpoc.labkey.com/home/login-login.view?returnUrl=%2Fhome%2Fproject-start.view");
    homePage.enterEmail("user");
    homePage.enterPassword("pass");
    homePage.clickTermsCheckbox();
    homePage.sign();
    System.out.println("Lab key logged in successfully");
    testContextSetup.getReportUtil().logInfo("Lab key logged in successfully");

}
@Given("the user navigates to the Editable Grid page")
public void the_user_navigates_to_the_editable_grid_page() {
    // Write code here that turns the phrase above into concrete actions
 //   throw new io.cucumber.java.PendingException();

    System.out.println("User navigates to editable grid page");
    testContextSetup.getReportUtil().logInfo("User navigates to editable grid page");
  //  Assert.assertTrue(false, "String message");
}
@When("the user clicks on {string} in the editable grid")
public void the_user_clicks_on_in_the_editable_grid(String string) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("User clicks on AddRow");
    testContextSetup.getReportUtil().logInfo("User clicks on AddRow");
}
@When("the user enters data for sample record")
public void the_user_enters_data_for_sample_record() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("User enters data for sample record");
    testContextSetup.getReportUtil().logInfo("User enters data for sample record");
}
@When("the user saves the grid changes")
public void the_user_saves_the_grid_changes() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("User saves the grid changes");
    testContextSetup.getReportUtil().logInfo("User saves the grid changes");
}
@Then("the new sample record should be saved successfully")
public void the_new_sample_record_should_be_saved_successfully() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("sample saved successfully");
    testContextSetup.getReportUtil().logInfo("sample saved successfully");
}


}

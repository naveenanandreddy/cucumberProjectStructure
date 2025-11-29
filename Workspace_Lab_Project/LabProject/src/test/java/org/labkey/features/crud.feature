Feature: Editable Grid Management


 @AddNewSample
 Scenario: Add a new valid sample record
 Given the user is logged into the LabKey application
 And the user navigates to the Editable Grid page
 When the user clicks on "Add Row" in the editable grid
 And the user enters data for sample record
 And the user saves the grid changes
 Then the new sample record should be saved successfully


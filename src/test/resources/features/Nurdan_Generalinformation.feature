@PER10-430
Feature: As a user,
  I should be able to see detailed information of a specific vehicle, under the Fleet Vehicle module

  @PER10-427
  Scenario: User can see the "General Information" page by clicking on any vehicle (row)
  user can see the "General Information" page by clicking on the "Eye (View)" icon at the end of each row
    Given User logs in as a driver
    When User clicks on Fleet module
    Then User clicks on Vehicles under the Fleet module
    And User clicks on any vehicle (row)
    Then User sees General Information page
    Then User clicks the step back button
    When user clicks eye icon at the end of each row
    Then user is on General Information page

  @PER10-428
  Scenario: User can see the "General Information" page by clicking on any vehicle (row)
  user can see the "General Information" page by clicking on the "Eye (View)" icon at the end of each row
  Sales Manager and Store Manager should see the "Edit", "Delete" and "Add Event" buttons on the "General Information" page
    Given User logs in as a sales manager
    When User clicks Fleet module
    Then User clicks on Vehicles under the Fleet
    And User clicks on vehicle row
    Then User goes to General Information page
    Then User clicks the step back
    When User clicks eye icon at the end of the row
    Then User is on General Information page
    And User sees the "Edit", "Delete" and "Add Event" buttons

  @PER10-429
  Scenario: User can see the "General Information" page by clicking on any vehicle (row)
  user can see the "General Information" page by clicking on the "Eye (View)" icon at the end of each row
  Sales Manager and Store Manager should see the "Edit", "Delete" and "Add Event" buttons on the "General Information" page
    Given User logs in as a store manager
    When User clicks on Fleet
    Then User clicks on Vehicles
    And User clicks on any vehicle
    Then user goes to General Information pg
    Then User clicks step-back button
    When User clicks eye icon at the end
    Then user is on General Information page again
    And User sees the "Edit", "Delete" and "Add Event" buttons on the page


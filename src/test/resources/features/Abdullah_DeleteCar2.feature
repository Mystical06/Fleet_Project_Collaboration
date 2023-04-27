@PER10-474
Feature:
  User Story :

  As a 'Store Manager', I should be able to delete a car



  Acceptance Criteria:

  1- Validate the user should see the  "Delete"  button on the "General Information" page

  2- Validate the user should see the  "Delete Confirmation" pop-up after clicking on the Delete button

  3- Validate that the users can delete any vehicle from the 'General Information' page, by clicking on the 'Delete' button, and a "Car deleted" message should be displayed.
  Background: Login
  Given User logs in as a "store manager"
  @PER10-470
  Scenario: Validate the user should see the  "Delete"  button on the "General Information" page
    When User clicks on Fleet tab
    Then User clicks on Vehicles option under fleet tab
    Then User clicks 1st line
    Then User sees delete button on tha general information page

  @PER10-471
  Scenario: Validate the user should see the  "Delete"  button on the "General Information" page
    When User clicks on Fleet tab
    Then User clicks on Vehicles option under fleet tab
    Then User clicks 1st line
    Then User clicks delete button on tha general information page
    Then User sees Delete Confirmation Alert

  @PER10-472
  Scenario: Validate the user should see the  "Delete"  button on the "General Information" page
    When User clicks on Fleet tab
    Then User clicks on Vehicles option under fleet tab
    Then User clicks 1st line
    Then User clicks delete button on tha general information page
    Then User clicks on Yes,Delete btn
    Then User sees item deleted message on the page




























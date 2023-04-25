@PER10-461
Feature:
  As a user, I should be able to arrange vehicle table display,
  under the Fleet-Vehicle page

  Background:
    Given the user is on the login page
    And user enters with valid credentials
    And user hover over "Fleet" button
    And user clicks on "Vehicles" button

  @PER10-456
#  Scenario 1
  Scenario: There is no empty record on the vehicle table
    When On Vehicles page, user checks the table contents
    And All the lines and records are full of data. There were no empty lines

  @PER10-457
#  Scenario 2
  Scenario: Validate the value of View Per Page should be 25 by default
    Given On Vehicles page, user checks if the View Per Page drop down menu value is "25"
    Then The options are as listed below and clickable
      | 10  |
      | 25  |
      | 50  |
      | 100 |

  @PER10-458
#  Scenario 3
  Scenario Outline:'View Per Page' drop down menu 10, 25, 50, 100 options can be seen
    When On Vehicles page, user clicks on the "<ViewOptions>" drop down menu
    Then the user can see "<ViewOptions>" options
    Examples:
      | ViewOptions |
      | 10          |
      | 25          |
      | 50          |
      | 100         |

  @PER10-459
#  Scenario 4
  Scenario Outline: user can sort a column in ascending or descending order by clicking the column name
    When The user clicks on "<column>" column in the table
    Then The "<column>" column is sorted in "<order1>" order

    When The user clicks on "<column>" column again
    Then The "<column>" column is sorted in "<order2>" order

    Examples:
      | column     | order1    | order2     |
      | Model Year | ascending | descending |
      | Driver     | ascending | descending |

  @PER10-460
  # Scenario 5
  Scenario Outline: Remove all sortings by reset button
    And The user saves the default order of "<column>"
    When The user clicks on "<column>" column in the table
    Then The "<column>" column is sorted in "<order1>" order

    When The user clicks on "Reset" button from the top right menu
    Then The "<column>" gets reset to default order

    Examples:
      | column     | order1    |
      | Model Year | ascending |
      | Driver     | ascending |
      | Location   | ascending |
Feature: Test Login Functionality

  @smoke
  Scenario Outline: Check login is successful with valid credentials
    Given users is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the homepage

    @valid
    Examples: 
      | username | password |
      | Admin    | admin123 |

    @invalid
    Examples: 
      | username | password |
      | admin123 | admin    |

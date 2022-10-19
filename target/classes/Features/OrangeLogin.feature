Feature: to check the functionality of ORANGE HRM

  Scenario Outline: login successful with valid credentials
    Given browser launching
    And login page to be opened
    When username is entered<user_name>
    And password entered<password>
    Then orange home page to be opened
    Examples:
      | user_name | password |
      | Admin     | admin123 |
      | geetha    | devi     |
      | Admin     |admin123  |






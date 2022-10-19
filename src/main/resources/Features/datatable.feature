Feature: multiple run of the when annotaions

  Scenario Outline: test for data table
    When i type the following names
      | name     | id       |
      | geetha   | name 1   |
      | "shree"  | "name 2" |
      | "swathi" | "name 3" |
    And i click on ok button
    Then i should see  <name>
    Examples:
      | name   |
      | Geetha |
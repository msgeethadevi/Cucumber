Feature: Login functionality of swaglabs

  Scenario Outline: login with valid credentials
    Given Browser is launching
    And User is in swaglabs login page
    When username entered<username>
    And taken<password>
    Then User is navigated to the swaglabs homepage
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | geetha        | devi         |
      | standard_user | secret_sauce |
      | correct       | password     |







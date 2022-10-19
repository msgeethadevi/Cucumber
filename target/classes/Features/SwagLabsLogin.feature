Feature: To check Login functionality of SwagLabs
  Scenario: To check login Successful with valid credentials
    Given Browser is launching
    And User is in swaglabs login page
    When username entered
    And password taken
    Then User is navigated to the swaglabs homepage

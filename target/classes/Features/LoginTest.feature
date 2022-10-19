# Author : Geetha Devi M S
# Date : 30/09/2022
# Description: Feature File
Feature: feature to test login functionality
  Scenario: check login successful with valid credentials
    Given user is on login page
    And user enters username and password
    When clicks on login button
    Then user is navigated to the homepage
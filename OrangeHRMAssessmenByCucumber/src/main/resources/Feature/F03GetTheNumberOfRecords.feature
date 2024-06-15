@E2E
Feature: Get The Number Of Records
  Scenario: check the the number of records of users
    Given Admin login with valid credentials
    When Admin check home page is open successfully
    And  Admin Navigates to Admin Page
    Then check if the Number of records equal to the number of users

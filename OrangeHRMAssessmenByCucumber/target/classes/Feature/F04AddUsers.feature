@E2E
Feature: Add Users
  Scenario: Check admin can add users
    Given  login with valid credentials
    When  check home page is open successfully
    And  Navigate to Admin Page
    Then FillTheRequiredData
    And SaveTheData
    Then Check if the user is added

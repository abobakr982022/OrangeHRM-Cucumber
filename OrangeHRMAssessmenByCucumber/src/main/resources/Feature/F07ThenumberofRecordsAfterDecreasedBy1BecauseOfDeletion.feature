@E2E
Feature: Add Users
  Scenario: Check admin can add users
    Given  login with valid credentials...
    When  check home page is open successfully...
    And  Navigate to Admin Page...
    Then add user , save it.
    Then Delete user and check the list of users is decreased by 1



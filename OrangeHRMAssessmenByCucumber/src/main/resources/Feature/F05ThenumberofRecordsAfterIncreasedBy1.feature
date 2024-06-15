@E2E
Feature: Add Users
  Scenario: Check admin can add users
    Given  login with valid credentials.
    When  check home page is open successfully.
    And  Navigate to Admin Page.
    Then add user , save it , check increasing number of users by one.


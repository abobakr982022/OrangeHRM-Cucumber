@E2E
Feature: Navigate to admin page
  Scenario: Verify the Admin Tab is Clickable
    Given Admin login with valid credentials
    When Admin check home page is opened successfully
    Then Admin click on Admin Tab and Admin Page open Successfully
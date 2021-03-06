@PROF-288
Feature: Student login and logout with valid credentials Functionality for Smoke Suit

  @PROF-240
  Scenario: Student log in with valid credentials Functionality for Smoke Suit
    Given the student should be able to login page "https://library3.cybertekschool.com"
    When the student should be able to enter valid credentials "student46@library" "pOM6YL0B"
    And the student should be able to click sign in button
    Then the student should be able to log out
@PROF-289
Feature: Student and Librarian cannot login with invalid credentials Functionality for Smoke Suit


  @PROF-240
  Scenario: Student and Librarian cannot login with invalid credentials Functionality for Smoke Suit
    Given the student should be able to login page "https://library3.cybertekschool.com"
    When the student should not be able to enter invalid credentials "    " "    "
    And the student should be able to click sign in button
    And the librarian should not be able to enter invalid credentials "librarian27@gmail.com" "Bc14562"
    And the librarian should be able to click sign in button
    Then the student and librarian should not be able to log in "Login - Library"
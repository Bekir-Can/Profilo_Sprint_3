@PROF-285
Feature: Librarian login and logout with valid credentials Functionality for Smoke Suit


  @PROF-240
  Scenario: Librarian log in with valid credentials Functionality for Smoke Suit
    Given the librarian should be able to login page "https://library3.cybertekschool.com"
    When the librarian should be able to enter valid credentials "librarian26@library" "gFOHHm6H"
    And the librarian should be able to click sign in button
    Then the librarian should be able to log out
Feature: Users should be able to login

  Scenario: Log in as a librarian
    Given the user is on the login page
    When the user enters the librarian information
    Then the user should be able to log in

  Scenario: Log in as a student
    Given the user is on the login page
    When the user enters the librarian information
    Then the user should be able to log in


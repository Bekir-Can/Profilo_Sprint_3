@PROF-274
Feature: Librarian log out functionality

  Background:
		#@PROF-229
    Given the librarian logged in the application

  @PROF-274 @PROF-275
  Scenario: Librarian Log Out Functionality
    When the user should be able to click the user name button
    And the user click the log out button
    Then log out page title should be "Login - Library"
				
		
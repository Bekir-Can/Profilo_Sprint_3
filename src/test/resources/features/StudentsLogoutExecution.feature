@PROF-284
Feature: Students log out functionality

  Background:
		#@PROF-234
    Given Student logged in the application


  @PROF-284 @PROF-275
  Scenario: Student Log Out Functionality
    When the user should be able to click the user name button
    And the user click the log out button
    Then log out page title should be "Login - Library"
				
		
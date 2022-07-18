Feature:1-As a user, I should be able to log out.

@MESK-372
  Scenario:1-User can log out and ends up in log in page

    Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    And Verify that user can login files page successfully
    And Click on the profile icon
    And Verify that user can see and click the Log out link
    Then Verify that user can log out on the files page and see log in page
  @MESK-374
  Scenario:Verify that user can NOT go to home page again by clicking step back button after successfully logged out.
    Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    And Verify that user can login files page successfully
    And Click on the profile icon
    And Verify that user can see and click the Log out link
    And Verify that user can log out on the files page and see log in page
    And Click on the step back button
    Then Verify that user can NOT go to home page again

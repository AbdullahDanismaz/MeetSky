Feature:1-User can login with valid credentials


  Scenario:1-User can login with valid credentials

    Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully

  Scenario Outline:Verify that user can not login with valid username and invalid password

    Given Navigate to login page
    When Enter username into "<username>" inputBox
    And Enter password into "<password>" inputBox
    And Click on the login button on the login page
    Then Verify that user can not login and see the notice message

    Examples:
      |username    |password|
      |Employee113 |1235|
      |Employee113 |856479ax|
      |Employee113 |afdjdfl |


  Scenario Outline:Verify that user can not login with invalid username and valid password

    Given Navigate to login page
    When Enter username into "<username>" inputBox
    And Enter password into "<password>" inputBox
    And Click on the login button on the login page
    Then Verify that user can not login and see the notice message

    Examples:
      |username    |password|
      |Emplyee113 |Employee123|
      |Employe113 |Employee123|
      |Empoyee113 |Employee123|


  Scenario:Verify that user can not login with blank username and valid password

    Given Navigate to login page
    When Enter username into "" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can not login and see the fill in this field message

  Scenario:Verify that user can not login with valid username and blank password

    Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "" inputBox
    And Click on the login button on the login page
    Then Verify that user can not login with valid username and blank password

  Scenario:Verify that user can see the password in a form of dots by default

    Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "Employee123" inputBox
    Then Verify that user can see the password in a form of dots by default

  Scenario:Verify that user can see the password explicitly

      Given Navigate to login page
      When Enter username into "Employee113" inputBox
      And Enter password into "Employee123" inputBox
      And Click on the eye sign after entering the password
      Then Verify that user can see the password explicitly

  Scenario:Verify that user can see the "Forgot password?" link and  the "Reset Password" button
    Given Navigate to login page
    When Verify that user can see the "Forgot password?" button
    And Click on the "Forgot password?" button
    Then Verify that user could see the "Reset Password" button

  Scenario:Verify that user can see valid placeholders on Username and Password fields
    Given Navigate to login page
    When Verify that user can see valid placeholders on Username inputBox
    When Verify that user can see valid placeholders on Password inputbox

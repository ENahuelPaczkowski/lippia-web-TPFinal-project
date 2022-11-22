@Registration
Feature: Registration


  @RegistrationFail
  Scenario Outline: Registration Failure
    Given the client enter the Home page
    When the client click on 'My Account' Menu
    And enter '<email>' in register email-adress textbox
    And enter '<password>' in register password texbox
    And click Register button
    Then show registration message error: '<message>'

    Examples:
      | email          | password | message                                      |
      | valid@mail.com |          | Error: Please enter an account password.     |
      |                |          | Error: Please provide a valid email address. |
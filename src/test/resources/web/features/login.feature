@Login
Feature: Login

  Background:
    Given the client enter the Home page
    When the client click on 'My Account' Menu

  @CaseSensitive
  Scenario: Login-Handles case sensitive
    When enter the case changed username in username textbox
    And enter the case chenged password in the password tetxbox
    And click on login button
    Then login must fail saying incorrect username-password

  @Authentication
  Scenario: Login-Authentication
    When enter registered in username texbox
    And enter password in password textbox
    And click on login button
    When click on sign out link
    Then sign out of the site
    When press back button
    Then user shouldn’t be signed in to his account
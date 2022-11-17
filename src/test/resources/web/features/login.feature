@Login
Feature: Login

  Background:
    Given the client enter the Home page
    When the client click on 'My Account' Menu
    When enter the case changed username in username textbox
    And enter the case chenged password in the password tetxbox
    And click on login button

#  7. Login-Handles case sensitive
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on My Account Menu
#  4) Enter the case changed username in username textbox
#  5) Enter the case chenged password in the password tetxbox
#  6) Now click on login button
#  7) Login must fail saying incorrect username/password.
  Scenario: Login-Handles case sensitive
    When enter the case changed username in username textbox
    And enter the case chenged password in the password tetxbox
    And click on login button
    Then login must fail saying incorrect username-password

#  8. Login-Authentication
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on My Account Menu
#  4) Enter the case changed username in username textbox
#  5) Enter the case chenged password in the password tetxbox
#  6) Now click on login button
#  7) Once your are logged in, sign out of the site
#  8) Now press back button
#  9) User shouldn’t be signed in to his account rather a general webpage must be visible
  Scenario: Login-Authentication
    When enter registered in username texbox
    And enter password in password textbox
    And click on login button
    Then login to the web page
    When click on sign out link
    Then sign out of the site
    When press back button
    Then user shouldn’t be signed in to his account
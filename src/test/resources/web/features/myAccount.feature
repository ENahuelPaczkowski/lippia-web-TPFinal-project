@Myaccount
Feature: My account
  Background:
    Given the client enter the Home page
    When the client click on 'My Account' Menu
    And enter registered in username texbox
    And enter password in password textbox
    And click on login button
    Then login to the web page
    When the client click on 'My Account' Menu

#  7. My Accounts-Account Details
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on My Account Menu
#  4) Enter registered username in username textbox
#  5) Enter password in password textbox
#  6) Click on login button
#  7) User must successfully login to the web page
#  8) Click on Myaccount link
#  9) Click on Account details
#  10) User can view account details where he can change his pasword also.
  Scenario: Account details
    When click on Account Details
    Then verify change password in accounts details

#  8. My Accounts-Log-Out
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on My Account Menu
#  4) Enter registered username in username textbox
#  5) Enter password in password textbox
#  6) Click on login button
#  7) User must successfully login to the web page
#  8) Click on My Account link
#  9) Click on Logout button
#  10) On clicking logout,User successfully comes out from the site
  Scenario: Log-Out
    When click on Logout button
    Then verify loguot successfully
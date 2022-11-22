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

  @AccountDetails
  Scenario: Account details
    When click on Account Details
    Then verify change password in accounts details

  @Logout
  Scenario: Log-Out
    When click on Logout button
    Then verify loguot successfully